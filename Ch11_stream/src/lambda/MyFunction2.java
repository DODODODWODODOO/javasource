package lambda;

// 함수형 인터페이스
// 람다식을 포함(추상 메서드는 하나만 사용)
// 람다식 == 익명 클래스 객체

@FunctionalInterface
public interface MyFunction2 {
  void method(int x); // public abstract (추상 메서드) 가 들어있음
}
