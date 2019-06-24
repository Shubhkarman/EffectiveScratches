package classes.item2.builder;

public class ChinesePizza extends Pizza2 {

  public static class ChineseBuilder extends Builder<ChinesePizza,ChineseBuilder> {

    @Override public ChinesePizza build() {
      return new ChinesePizza();
    }

    @Override protected ChineseBuilder self() {
      return this;
    }
  }

}
