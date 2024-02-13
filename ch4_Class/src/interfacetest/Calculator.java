package interfacetest;

public abstract class Calculator implements Calc {

  // times, divide 추상 메소드

  @Override
  public int add(int num1, int num2) {
    return num1 + num2;
  }

  @Override
  public int substrack(int num1, int num2) {
    return num1 - num2;
  }
}
