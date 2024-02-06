package ch4;

public class CardEx {

  public static void main(String[] args) {
    Card card1 = new Card("heart", 2);
    Card card2 = new Card("spade", 5);

    // 공유 값 조회
    System.out.println("카드크기 " + Card.width);
    System.out.println("카드크기 " + Card.height);

    // System.out.println("카드크기 " + card2.width);
    // System.out.println("카드크기 " + card2.height);

    // 공유 값 변경
    Card.width = 80;
    Card.height = 50;

    // static 에서 non-static 메소드, 변수 호출 불가
    // 호출이 가능하려면?
    // 1) 같은 static 으로 만들기
    // 2) 인스턴스 생성 후 접근하기
    CardEx obj = new CardEx();
    obj.method1();
  }

  public void method1() {
    System.out.println("인스턴스 메소드");
  }
}
