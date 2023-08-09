package net.jmb19905.betterweapons.effect;

import com.google.common.collect.ImmutableList;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ai.goal.Goal;
import net.minecraft.entity.ai.goal.GoalSelector;
import net.minecraft.entity.ai.goal.PrioritizedGoal;
import net.minecraft.entity.mob.MobEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

public final class GoalAdder<T extends Entity> {
    private final Class<T> type;

    private final Function<T, GoalSelector> selector;

    private final ImmutableList<GoalEntry<T>> goals;

    private GoalAdder(final Builder<T> builder) {
        this.type = builder.type;
        this.selector = builder.selector;
        this.goals = builder.goals.build();
    }

    public void onEntityJoinWorld(final Entity entity) {
        if (!entity.getWorld().isClient && this.type.isInstance(entity)) {
            final Set<PrioritizedGoal> oldGoals = this.getGoals(this.type.cast(entity));
            final List<PrioritizedGoal> newGoals = new ArrayList<>(oldGoals.size() + this.goals.size());
            for (final GoalEntry<T> goal : this.goals) {
                newGoals.add(new PrioritizedGoal(goal.priority, goal.factory.apply(this.type.cast(entity))));
            }
            newGoals.addAll(oldGoals);
            oldGoals.clear();
            oldGoals.addAll(newGoals);
        }
    }

    private Set<PrioritizedGoal> getGoals(final T entity) {
        return this.selector.apply(entity).getGoals();
    }

    public static <T extends MobEntity> Builder<T> mobGoal(final Class<T> type) {
        return GoalAdder.builder(type, m -> m.goalSelector);
    }

    public static <T extends MobEntity> Builder<T> mobTarget(final Class<T> type) {
        return GoalAdder.builder(type, m -> m.targetSelector);
    }

    public static <T extends Entity> Builder<T> builder(final Class<T> type, final Function<T, GoalSelector> selector) {
        return new GoalAdder.Builder<>(type, selector);
    }

    public static final class Builder<T extends Entity> {
        private final Class<T> type;

        private final Function<T, GoalSelector> selector;

        private final ImmutableList.Builder<GoalEntry<T>> goals = new ImmutableList.Builder<>();

        private Builder(final Class<T> type, final Function<T, GoalSelector> selector) {
            this.type = type;
            this.selector = selector;
        }

        public Builder<T> add(final int priority, final Function<T, Goal> factory) {
            this.goals.add(new GoalEntry<>(priority, factory));
            return this;
        }

        public GoalAdder<T> build() {
            return new GoalAdder<>(this);
        }
    }

    private record GoalEntry<T extends Entity>(int priority, Function<T, Goal> factory) {}
}