package ch4;

public class MyMath {

  private long num1, num2;

  public MyMath(long num1, long num2) { // 생성자
    this.num1 = num1;
    this.num2 = num2;
  }

  long add() {
    return num1 + num2;
  }

  long subtract() {
    return num1 - num2;
  }

  long multply() {
    return num1 * num2;
  }

  long diyide() {
    return num1 / num2;
  }

  static long add(long num1, long num2) {
    return num1 + num2;
  }

  static long subtract(long num1, long num2) {
    return num1 - num2;
  }

  static long multply(long num1, long num2) {
    return num1 * num2;
  }

  static long diyide(long num1, long num2) {
    return num1 / num2;
  }
}
