package loap;

//continue 이후에 구문 건너뛰게 함
// 반복문 안에서 특정 구문을 실행하지 않게 함
public class ContinueEx1 {

  public static void main(String[] args) {
    for (int i = 0; i < 11; i++) {
      if (i % 3 == 0) continue;
      System.out.println(i);
    }

    System.out.println("\n\n");

    for (int i = 0; i < 11; i++) {
      if (i % 2 != 0) continue;
      System.out.println(i);
    }
  }
}
