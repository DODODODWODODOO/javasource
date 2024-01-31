package ch1;

// 자동 형(타입)변환 : promotion
// 정수, 문자, 실수, 논리형
// 타입 변환 가능함 : 작은 타입 => 큰 타입
// 연산 시 타입변환이 일어남 : 작은 타입 => 큰 타입
public class PromotionEc1 {

  public static void main(String[] args) {
    byte v1 = 10;
    int intValue = v1;
    System.out.println("intValue = " + intValue);

    short s1 = 15;
    intValue = s1;
    System.out.println("intvalue = " + intValue);

    char ch1 = 'a';
    intValue = ch1;
    System.out.println("intvalue = " + intValue);

    // float type 이 int 보다 더 정밀한 수를 표현
    // int(4byte) => float(4byte)
    float floatvalue = intValue;
    System.out.println("floatvalue = " + floatvalue);

    // 8byte
    long longvalue = intValue;
    System.out.println("longvalue = " + longvalue);

    double doublevalue = intValue;
    System.out.println("doublevalue = " + doublevalue);

    //int + double
    intValue = 55;
    doublevalue = 98.25D;

    // int result = intValue + doublevalue;
    double result = intValue + doublevalue;
    System.out.println("int + double = double 타입으로 변환됨");
    System.out.println(result);

    byte v2 = 15;
    //byte bytevalue = v1 + v2; => 정수를 변수에 담는다면 int 사용
    int bytevalue = v1 + v2;
  }
}
