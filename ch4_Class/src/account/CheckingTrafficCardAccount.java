package account;

import java.io.EOFException;

// 은행 : Account
// 은행 + 체크카드 : CheckingAccount
// 은행 + 체크카드 + 교통카드 : CheckingTrafficCardAccount
// 예금,출금 => 부모(Account)
// 카드 사용금액 지불 => pay() 부모 CheckingAccount
// 교통비 지불한다 => payTrafficCard()

public class CheckingTrafficCardAccount extends CheckingAccount {

  private boolean hasTrafficCard;

  public CheckingTrafficCardAccount(
    String accountNo,
    String owner,
    int balance,
    String cardNo,
    boolean hasTrafficCard
  ) {
    super(accountNo, owner, balance, cardNo);
    this.hasTrafficCard = hasTrafficCard;
  }

  //cardNo, amount, 교통카드 기능 여부
  void payTrafficCard(String cardNo, int amount) throws Exception {
    if (!hasTrafficCard) {
      throw new Exception("교통카드 기능이 없습니다");
    }
    // 교통카드 기능이 존재한다면 cardNo, amount 확인
    pay(cardNo, amount);
  }
}
