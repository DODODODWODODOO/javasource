package interfacetest;

public interface Calc {
  // public static final 기본
  double PI = 3.14;
  int ERROR = -999999999;

  // public abstract 기본
  int add(int num1, int num2);
  int substrack(int num1, int num2);
  int times(int num1, int num2);
  int divide(int num1, int num2);
}
