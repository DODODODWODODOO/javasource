package lang;

public class StringEx4 {

  public static void main(String[] args) {
    String[] names = { "Park", "Hong", "kim", "Choi" };
    System.out.println(findKim(names)); // "Kim" 의 위치 => "Kim 은 0 번 위치에 있다"
  }

  public static String findKim(String[] arr) {
    // "Kim".equals(arr[0]);
    // "Kim".equals(arr[1]);
    // "Kim".equals(arr[2]);
    // "Kim".equals(arr[3]);
    int idx = 0;
    for (int i = 0; i < arr.length; i++) {
      if ("Kim".equals(arr[i])) {
        idx = i;
        break;
      }
    }

    return "Kim 은 " + idx + " 번 위치에 있다";
  }
}
