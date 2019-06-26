package classes.item3;

public class ElvisSingle2 {

  private int howMany = 0;

  private ElvisSingle2() {}

  // Return new instance for each new thread calling
  private static final ThreadLocal<ElvisSingle2> _localStorage = new ThreadLocal<ElvisSingle2>() {
    protected ElvisSingle2 initialValue() {
      return new ElvisSingle2();
    }
  };

  public static ElvisSingle2 getInstance(){
    return _localStorage.get();
  }

  public void beingElvis(){
    System.out.println("I am "+howMany +" " + this.getClass());
  }

  public void setElvisProperty(int howMany){
    this.howMany = howMany;
  }

}
