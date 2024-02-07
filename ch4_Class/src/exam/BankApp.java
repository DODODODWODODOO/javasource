package exam;

import java.util.Scanner;

public class BankApp {

  static Scanner sc = new Scanner(System.in);
  static Account accArr[] = new Account[100];

  public static void main(String[] args) {
    boolean run = true;

    while (run) {
      System.out.println(
        "----------------------------------------------------"
      );
      System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
      System.out.println(
        "----------------------------------------------------"
      );
      System.out.println("메뉴 선택 >> ");

      int meun = Integer.parseInt(sc.nextLine());
      switch (meun) {
        case 1: // 계좌 생성
          createAcoount();
          break;
        case 2: //계좌 목록
          accountList();
          break;
        case 3: // 예금
          deposit();
          break;
        case 4: //출금
          withdraw();
          break;
        case 5: //종료
          run = false;
          break;
        default:
          break;
      }
    }
  }

  static void createAcoount() {
    System.out.print("계좌번호 입력 : ");
    String accNum = sc.nextLine();

    System.out.print("이름입력 : ");
    String name = sc.nextLine();

    System.out.print("현재 잔액은 : ");
    int money = Integer.parseInt(sc.nextLine());

    for (int i = 0; i < accArr.length; i++) {
      if (accArr[i] == null) {
        accArr[i] = new Account(accNum, name, money);
        System.out.println("계좌가 생성되었습니다.");
        break;
      }
    }
  }

  static void accountList() {
    // 생성된 계좌목록 보여주기
    for (Account account : accArr) {
      if (account != null);
      System.out.println(account);
    }
  }

  static void deposit() {
    // 예금하다
    // 계좌번호
    System.out.print("계좌번호 >> ");
    String accNum = sc.nextLine();

    // 예금액
    System.out.print("예금액 >> ");
    int money = Integer.parseInt(sc.nextLine());

    // 배열에서 입력받은 계좌번호와 일치한 배열요소 찾기
    Account account = findAccount(accNum);

    // 찾은 요소의 잔액+예금액
    if (account != null) {
      System.out.println("현재잔액 : " + account.deposit(money));
    }
  }

  static void withdraw() {
    // 출금하다
    System.out.print("계좌번호 >> ");
    String accNum = sc.nextLine();

    // 출금액
    System.out.print("출금액 >> ");
    int money = Integer.parseInt(sc.nextLine());

    // 배열에서 입력받은 계좌번호와 일치한 배열요소 찾기
    Account account = findAccount(accNum);

    // 찾은 요소의 잔액-출금액
    if (account != null) {
      System.out.println("현재잔액 : " + account.withdraw(money));
    }
  }

  static Account findAccount(String accNum) {
    for (Account account : accArr) {
      if (account != null) {
        if (account.getAccNum().equals(accNum));
        {
          return account;
        }
      }
    }
    return null;
  }
}
