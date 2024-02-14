package excrption;

public class WrongPasswordException extends Exception {

  public WrongPasswordException() {
    super();
  }

  public WrongPasswordException(String massage) {
    super(massage);
  }
}
