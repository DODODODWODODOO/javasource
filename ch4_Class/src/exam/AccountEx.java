package exam;

public class AccountEx {

  public static void main(String[] args) {
    Account account = new Account("110-11-12345", "홍길동", 100000);

    int money = account.deposit(10000);
    System.out.println("현재 잔액은 : " + money);
    // int balance = account.deposit(150000);

    money = account.withdraw(20000);
    System.out.println("현재 잔액은 : " + money);
    // account.withdraw(10000);
  }
}
