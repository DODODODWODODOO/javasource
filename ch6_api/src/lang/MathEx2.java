package lang;

import static java.lang.Math.*;

// Math : 구성 요소가 모두 static 상태

public class MathEx2 {

  public static void main(String[] args) {
    System.out.println(PI);
    // Math.random() : 0 ~ 1 미만의 임의의 숫자
    System.out.println(random());

    // round() : 반올림 => long or int 리턴
    double val = 90.7552;
    System.out.println("round()" + round(val));
  }
}
