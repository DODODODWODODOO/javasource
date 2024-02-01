package exam;

import java.util.Scanner;

public class PayOfHours {

  public static void main(String[] args) {
    //근무  시간 입력 받은 후
    //시간 당 9800
    //8 시간이 넘어가는 시간은 원래 받는 금액에 1.5%
    // 오늘 받는 임금은 15000

    Scanner sc = new Scanner(System.in);

    System.out.print("근무 시간 입력 : ");
    int Hours = sc.nextInt();

    int pay = 0, rate = 9800;
    if (Hours > 8) {
      pay = (int) ((Hours - 8) * rate * 1.5) + (rate * 8);
    } else {
      pay = Hours * rate;
    }
    System.out.println("오늘 받는 임급은 : " + pay);
  }
}
