package condition;

public class SwitchEx5 {

  public static void main(String[] args) {
    char grade = 'B';
    //A or a : 우수회원
    //B or b : 일반회원
    //       : 손님

    switch (grade) {
      case 'A':
      case 'a':
        System.out.println("우수 회원");
        break;
      case 'B':
      case 'b':
        System.out.println("일반 회원");
        break;
      default:
        System.out.println("손놈");
        break;
    }
  }
}
