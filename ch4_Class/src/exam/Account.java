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

  public String getAccNum() {
    return accNum;
  }

  public void setAccNum(String accNum) {
    this.accNum = accNum;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getMoney() {
    return money;
  }

  public void setMoney(int money) {
    this.money = money;
  }

  @Override
  public String toString() {
    return (
      "Account [accNum=" + accNum + ", name=" + name + ", money=" + money + "]"
    );
  }
}
