package exam;

import java.util.Scanner;

public class AccountEx2 {

  public static void main(String[] args) {
    // Account 객체를 담을 배열 생성 3개
    Account accArr[] = new Account[3];

    // 입력
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < accArr.length; i++) {
      System.out.print("계좌번호 입력 : ");
      String accNum = sc.nextLine();

      System.out.print("이름입력 : ");
      String name = sc.nextLine();

      System.out.print("현재 잔액은 : ");
      int money = Integer.parseInt(sc.nextLine());

      accArr[i] = new Account(accNum, name, money);
    }
    // 확인
    for (Account account : accArr) {
      System.out.println(account);
    }
  }
}
