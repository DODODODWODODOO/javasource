package interfacetest;

// interface
// 모든 맴버 변수는 public static final 이어야 함
// 모든 맴버 메소드는 public abstract 임(abstract 생략 가능)
// 추상화가 높은 상태(기본 설계도)
// body 를 가진 메소드는 static, default 만 가능(1.8 버전 추가)
// 여러 개 구현 가능
// public class Bouns implements Acoount, CheckingAccount
// public class Bouns extends (creditLine) implements (Acoount, CheckingAccount)
//                               하나                          여러개

public interface Account {
  // accountNo; only public, static & final
  // private String accountNo; 맴버변수 선언 불가
  public static final int SPADE = 4; // 상수

  // Abstract methods do not specify a body
  // public void deposit(){}
  public void deposit();

  // 앞에 static 이 붙어있으면 {}가 와도된다
  static void getCardKind() {}

  // 앞에 default 이 붙어있으면 {}가 와도된다
  default void getCard() {}
}
