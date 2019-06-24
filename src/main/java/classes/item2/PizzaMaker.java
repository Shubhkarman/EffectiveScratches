package classes.item2;

import classes.item2.builder.ChinesePizza;
import classes.item2.builder.NyPizza;
import classes.item2.builder.Pizza;
import classes.item2.builder.Pizza2;

public class PizzaMaker {

  public static void main(String[] args) {
    NyPizza nyPizza = (NyPizza) new NyPizza.Builder(NyPizza.Size.SMALL).addToppings(Pizza.Topping.CORN).build();

    ChinesePizza chinesePizza = new ChinesePizza.ChineseBuilder().addToppings(Pizza2.Topping.PANNER).build();

  }
}
