package ch4;

public class SingletonEx {

  public static void main(String[] args) {
    // not visible
    // Singleton singleton = new Singleton();
    Singleton singleton = Singleton.getInstance();
    Singleton singleton2 = Singleton.getInstance();
    System.out.println(singleton == singleton2); //true
  }
}
