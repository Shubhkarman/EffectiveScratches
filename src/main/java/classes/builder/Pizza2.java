package classes.builder;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

public class Pizza2 {

  public enum Topping {
    ONION, PANNER, CORN
  }

  Set<Pizza.Topping> toppings;

  abstract static class Builder<Y extends Pizza, T extends Builder<Y, T>> {
    EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

    public T addToppings(Topping topping) {
      toppings.add(Objects.requireNonNull(topping));
      return self();
    }

    abstract Y build();

    protected abstract T self();

  }

}
