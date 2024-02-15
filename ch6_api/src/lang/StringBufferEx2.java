package lang;

public class StringBufferEx2 {

  public static void main(String[] args) {
    StringBuffer sb1 = new StringBuffer("Hello");
    // StringBuffer sb2 = "Hello"; (X)

    // append() : 원본 문자열 뒤에 추가
    System.out.println("append() " + sb1.append(" World"));
    System.out.println();

    // String str1 = "Hello"; str1 += "123"; str += 456
    sb1.append("123").append(456).append(123.3f);
    System.out.println(sb1); // 원본이 변경
    System.out.println();

    // charAt()
    System.out.println(sb1.charAt(3));
    System.out.println();

    // delete() : 끝 위치 문자 제외
    sb1.delete(3, 6); // 3 4 5
    System.out.println(sb1);
    System.out.println();

    sb1.deleteCharAt(5); //
    System.out.println(sb1);
    System.out.println();

    // insert() :
    sb1.insert(4, " 012345 ");
    System.out.println(sb1);
    System.out.println();

    // length()

    // replace()
    sb1.replace(0, 3, "AB");
    System.out.println(sb1);
    System.out.println();

    String str2 = "0123456789";
    // 9876543210 출력하기
    // System.out.println(str2.charAt(9));
    // System.out.println(str2.charAt(8));
    // System.out.println(str2.charAt(7));

    for (int i = str2.length() - 1; i >= 0; i--) {
      System.out.print(str2.charAt(i));
    }
    System.out.println();

    StringBuffer sb3 = new StringBuffer("0123456789");
    System.out.println(sb3.reverse());
    System.out.println();

    // String => StringBuffer
    StringBuffer sb4 = new StringBuffer(str2);
    System.out.println(sb4.reverse());
    System.out.println();

    sb1.setCharAt(1, 'K');
    System.out.println(sb1);
    System.out.println();

    StringBuilder sBuilder = new StringBuilder("Hello");
    System.out.println(sBuilder);
  }
}
