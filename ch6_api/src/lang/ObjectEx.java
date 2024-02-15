package lang;

// java.lang.* => 기본 패키지(import 구문 없이 사용 가능)
// java.lang.Object : 모든 클래스의 최고 조상
//           equals() 는 == 과 같은 역할(주소비교)
//           toString() : 객체 자신의 정보를 문자열로 반환

public class ObjectEx {

  public static void main(String[] args) {
    // 인스턴스 생성
    Object obj1 = new Object();
    Object obj2 = new Object();

    if (obj1.equals(obj2)) {
      System.out.println("두 객체는 같다");
    } else {
      System.out.println("두 객체는 다르다");
    }

    if (obj1 == obj2) {
      System.out.println("두 객체는 같다");
    } else {
      System.out.println("두 객체는 다르다");
    }

    // java.lang.Object@5ca881b5
    // java.lang.Object@4f023edb
    System.out.println("obj1 toString() " + obj1.toString());
    System.out.println("obj2 toString() " + obj2.toString());

    Value value1 = new Value(10);
    Value value2 = new Value(10);
    if (value1.equals(value2)) {
      System.out.println("두 객체는 같다");
    } else {
      System.out.println("두 객체는 다르다");
    }

    // lang.Value@7adf9f5f
    System.out.println("value1 toString() " + value1.toString());
    System.out.println("value1 toString() " + value1); // 오버라이딩 되어있으면 .toSting() 생략가능

    Member member1 = new Member("hong123");
    Member member2 = new Member("hong123");

    // equals() : 값 비교
    // == : 주소 비교
    System.out.println(member1.equals(member2) ? "같다" : "다르다");
    System.out.println(member1 == member2 ? "같다" : "다르다");
  }
}
