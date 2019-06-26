package classes.item3;

public class ElvisDriver {
  public static void main(String[] args) {
    ElvisSingle elvisSingle1 = ElvisSingle.INSTANCE;
    elvisSingle1.beingElvis();

    Thread thread = new Thread(new Runnable() {
      @Override public void run() {
        ElvisSingle2 elvisSingle2 = ElvisSingle2.getInstance();
        elvisSingle2.setElvisProperty(3);
        elvisSingle2.beingElvis();
      }
    });

    Thread thread2 = new Thread(new Runnable() {
      @Override public void run() {
        ElvisSingle2 elvisSingle2 = ElvisSingle2.getInstance();
        elvisSingle2.beingElvis();
      }
    });


    thread.start();
    thread2.start();


    ElvisSingle3 elvisSingle3 = ElvisSingle3.INSTANCE;
    elvisSingle3.beingElvis();


  }
}
