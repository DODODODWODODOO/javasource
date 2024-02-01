package ch1;

/* 기본타입(peimitive type)
 * 정수, 실수, 불린, 문자형
 * 초기화가 반드시 필요함
 *
 * 인코딩 (ASCII, 유니코드(UTF-8, UTF-16))
 * A ===> 65
 *
 * 디코딩
 * 65 ==> A
 */
public class VarByteEx1 {

  public static void main(String[] args) {
    // 타입 (자료형)
    // 변수명(소문자로 시작/ 두 개의 단어가 합해진 변수명은 두번째 단어 시작을 대문자로 한다)
    // 1. 정수형 - byte(1byte), short(2byte), int(4byte) - 주로사용, long(8byte)
    byte age = 10, maxSpeed = 10;
    short age1 = 10, maxSpeed1 = 10;
    int age2 = 15, maxSpeed2 = 20;

    age = 33;
    // age = 128;

    // long 타입은 값에 L(l) 붙이기
    // L에 소문자도 사용가능하나 가독성이 떨어짐(식별자 개념)
    long age3 = 123456789L, maxSpeed3 = 1000000000000L;

    System.out.println(age + " , " + maxSpeed);
    System.out.println("나이 : " + age1 + ", 최고속도 : " + maxSpeed1);
    System.out.println("나이 : " + age2 + ", 최고속도 : " + maxSpeed2);
    System.out.println("나이 : " + age3 + ", 최고속도 : " + maxSpeed3);
    // + 의 의미 : 1.더해주세요 2. 연결해서 출력해주세요

  }
}
