package classes.builder;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

public abstract class Pizza {
  public enum Topping {
    ONION, PANNER, CORN
  }

  Set<Topping> toppings;

  abstract static class Builder<Y extends Builder<Y>> {
    EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

    public Y addToppings(Topping topping) {
      toppings.add(Objects.requireNonNull(topping));
      return self();
    }

    abstract Pizza build();

    //Builder<Y> x = (Builder<Y>) new FrenchPizza.FrenchBuilder();

    protected abstract Y self();

  }

  Pizza(Builder<?> builder) {
    toppings = builder.toppings.clone();
  }
}