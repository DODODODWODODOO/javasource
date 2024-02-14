package excrption;

public class NotExisitIdException extends Exception {

  public NotExisitIdException() {
    super();
  }

  public NotExisitIdException(String massage) {
    super(massage);
  }
}
