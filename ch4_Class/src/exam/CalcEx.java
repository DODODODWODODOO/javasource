package exam;

import javax.security.auth.callback.Callback;

public class CalcEx {

  public static void main(String[] args) {
    //객체 생성
    Calc calc = new Calc();

    // 덧셈
    int result = calc.add(15, 20);
    System.out.println("덧셈 결과 : " + result);

    // 곱셈
    System.out.println("곱셈 결과 : " + calc.multiply(3, 5));

    // 나눗셈
    int result2 = calc.divide(36, 6);
    System.out.println("나눗셈 결과 : " + result2);

    // 뺄셈
    System.out.println("뻴셈 결과 : " + calc.subtract(6, 4));
  }
}
