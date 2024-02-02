package condition;

import java.util.Scanner;

public class SwitchEx3 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("월을 입력하세요 ");
    int month = sc.nextInt();

    if (month >= 3 && month <= 5) {
      System.out.println("계절은 봄입니다");
    } else if (month >= 6 && month <= 8) {
      System.out.println("계절은 여름입니다");
    } else if (month >= 9 && month <= 11) {
      System.out.println("계절은 가을입니다");
    } else if (month > 13) {
      System.out.println("월을 확인해 주세요 ");
    } else {
      System.out.println("계절은 겨울입니다 ");
    }
  }
}
