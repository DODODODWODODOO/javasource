package lang;

// 기본형 값들을 객체로 사용할 떄가 있음
// java.lang.Byte ==> byte 의 객체형
// java.lang.Short ==> short
// java.lang.Character ==> char
// java.lang.Integer ==> int
// java.lang.Long ==> long
// java.lang.Float ==> float
// java.lang.Double ==> double
// java.lang.Boolean ==> boolean

public class WrapperEx {

  public static void main(String[] args) {
    int i = 10;

    Integer i2 = 10;
    Integer i3 = Integer.valueOf(20);

    // intValue() : Integer => int
    int result = i2.intValue();
    int result2 = i2;
  }
}
