package exam;

import java.util.Scanner;

public class Calc {

  public static void main(String[] args) {
    //문자 입력
    Scanner sc = new Scanner(System.in);
    System.out.print("+,-,*,/,% 중에서 하나를 입력하세요 >>> ");
    String op = sc.nextLine();
    System.out.println("입력한 문자는 : " + op);
    System.out.print("첫번째 숫자 >>> ");
    int num1 = sc.nextInt();
    System.out.println(num1);
    System.out.print("두번째 숫자 >>>");
    int num2 = sc.nextInt();
    System.out.println(num2);

    int result = 0;
    switch (op) {
      case "+":
        result = num1 + num2;
        break;
      case "-":
        result = num1 - num2;
        break;
      case "*":
        result = num1 * num2;
        break;
      case "/": //%s 로 출력가능
        result = num1 / num2;
        break;
      case "%":
        result = num1 % num2;
        break;
    }
    System.out.printf("%d %s %d =  %d\n", num1, op, num2, result);
  }
}
