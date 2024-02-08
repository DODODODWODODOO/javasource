package account;

// 은행 : Account
// 은행 + 체크카드 : CheckingAccount
// 은행 + 체크카드 + 교통카드 : CheckingTrafficCardAccount
// 은행 + 마이너스 통장
// 은행 + 보너스 포인트 (예금액의 0.1%)

public class BounsPointAccount extends Account {

  // 보너스 포인트
  private int bounsPoint;

  // 생성자
  public BounsPointAccount(
    String accountNo,
    String owner,
    int balance,
    int bounsPoint
  ) {
    super(accountNo, owner, balance);
    this.bounsPoint = bounsPoint;
  }

  // 예금하다 오버라이딩
  @Override
  public void deposit(int amount) {
    super.deposit(amount);
    // 예금 + 보너스 포인트 적립
    this.bounsPoint += (int) (amount * 0.001);
  }

  public int getBounsPoint() {
    return bounsPoint;
  }
}
