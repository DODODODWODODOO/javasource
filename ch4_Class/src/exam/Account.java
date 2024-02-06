package exam;

public class Account {

  // 계좌번호(110-11-12345), 계좌주 이름(홍길동), 잔액(100000)
  private String accNum;
  private String name;
  private int money;

  public Account() {}

  public Account(String accNum, String name, int money) {
    this.accNum = accNum;
    this.name = name;
    this.money = money;
  }

  // 예금하다 deposit
  int deposit(int money) {
    return this.money += money;
  }

  // int deposit(int amount){
  //   // 잔액 = 잔액 + 예금액
  //   balance = balance + amount;
  //   return balance;
  // }

  // 출금하다 withdraw
  int withdraw(int money) {
    return this.money -= money;
  }
  // int withdraw(int amount){
  //   잔액 = 잔액 - 출금액
  //   balance = balance - amount;
  //   return balance;
  // }
}
