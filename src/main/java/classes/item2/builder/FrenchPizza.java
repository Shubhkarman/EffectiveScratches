package classes.item2.builder;

public class FrenchPizza extends Pizza {

  FrenchPizza(Builder<?> builder) {
    super(builder);
  }

  public static class FrenchBuilder extends Builder<FrenchBuilder> {

    @Override FrenchPizza build() {
      return new FrenchPizza(this);
    }

    @Override protected FrenchBuilder self() {
      return this;
    }

  }

}
