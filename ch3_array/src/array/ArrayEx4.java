package array;

import java.util.Arrays;

public class ArrayEx4 {

  public static void main(String[] args) {
    // 'a', 'b', 'c', 'd' char 1차원 선언,생성
    char arr[] = { 'a', 'b', 'c', 'd' };
    System.out.println(arr); //abcd

    int intarr[] = { 78, 88, 9, 86, 55 };
    System.out.println(intarr);
    System.out.println(Arrays.toString(intarr)); //[78, 88, 9, 86, 55]

    // 배열 복사
    // 더 큰 배열을 생성 => 기존 배열을 새로운 배열에 복사
    int temp[] = new int[intarr.length * 2];
    //ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    // 배열의 범위가 벗어남
    for (int i = 0; i < intarr.length; i++) {
      temp[i] = intarr[i];
    }
    intarr = temp;
    System.out.println("복사 후" + Arrays.toString(intarr));

    // "abc", "def", "hij","apple"
    String straar[] = { "abc", "def", "hij", "apple" };
    System.out.println(straar);
    System.out.println(Arrays.toString(straar)); //[abc, def, hij, apple]
  }
}
