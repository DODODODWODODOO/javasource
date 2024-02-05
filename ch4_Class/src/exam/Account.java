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
}
