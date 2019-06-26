package classes.item3;

public class ElvisSingle {

  public static final ElvisSingle INSTANCE = new ElvisSingle();

  private ElvisSingle(){
    if (INSTANCE != null){
      throw new IllegalStateException("Operation not allowed. Use getInstance() to get instance");
    }
  }

  public void beingElvis(){
    System.out.println("I am " + this.getClass());
  }

}
