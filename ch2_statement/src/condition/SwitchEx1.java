package condition;

// if~else if 처리 대체
public class SwitchEx1 {

  public static void main(String[] args) {
    char ch1 = 'a';
    switch (ch1) {
      case 'a':
        System.out.println("a 입니다");
        break; // 밑으로 실행되는걸 막는 역할
      case 'b':
        System.out.println("b 입니다");
        break;
      default:
        System.out.println("a 도 b 도 아닙니다");
        break;
    }
  }
}
