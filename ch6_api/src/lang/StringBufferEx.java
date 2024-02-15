package lang;

// java.lang.StringBuffer : mutable (변경 가능한) 클래스, thread-safe
// java.lang.StringBuilder : mutable (변경 가능한) 클래스

public class StringBufferEx {

  public static void main(String[] args) {
    StringBuffer sb1 = new StringBuffer("Hello");
    StringBuffer sb2 = new StringBuffer("Hello");

    // equals(), toString()
    // String 으로 변환해서 equals() 사용하기
    // String str1 = new String(sb1);
    // String str2 = new String(sb2);

    // String str2 =sb2.toString();
    // String str1 =sb1.toString();

    System.out.println(sb1.equals(sb2) ? "같음" : "다름");
    System.out.println(sb1 == sb2 ? "같음" : "다름");
    System.out.println(sb1); // Hello
  }
}
