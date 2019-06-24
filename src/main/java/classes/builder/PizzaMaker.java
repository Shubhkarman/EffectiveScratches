package classes.builder;

public class PizzaMaker {

  public static void main(String[] args) {
    FrenchPizza.Builder builder = new FrenchPizza.FrenchBuilder();
    FrenchPizza frenchPizza = builder.addToppings(Pizza.Topping.PANNER).build();

  }
}
