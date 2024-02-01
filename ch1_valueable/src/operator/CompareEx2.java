package operator;

public class CompareEx2 {

  public static void main(String[] args) {
    // 비교 연산자 결과는 true or false 로 나옴
    // 문자 vs 문자열
    // '' vs ""
    // 'A' "A"

    String strl = "홍길동";
    String str2 = "홍길동";
    String str3 = new String("홍길동");
    System.out.println(strl == str2); //true
    System.out.println(strl == str3); //false
    // 문자열 비교는 equals() 사용
    System.out.println(strl.equals(str3)); //true
  }
}
