package excrption;

import java.util.Scanner;

public class LoginEx {

  public static void main(String[] args) {
    // 사용자로부터 아이디와 비밀번호 입력받기
    Scanner sc = new Scanner(System.in);
    System.out.print("input id >> ");
    String id = sc.nextLine();
    System.out.print("input Pwd >> ");
    String pwd = sc.nextLine();

    try {
      login(id, pwd);
    } catch (NotExisitIdException e) {
      e.printStackTrace();
    } catch (WrongPasswordException e) {
      e.printStackTrace();
    }
    // 아이디가 blue 와 일치하지 않으면 NoExisitIdException 발생

    // 비밀번호가 12345 와 일치하지 않으면 WrongPasswordException 발생
  }

  public static void login(String id, String Pwd)
    throws NotExisitIdException, WrongPasswordException {
    if (!id.equals("blue")) {
      throw new NotExisitIdException("아이디를 확인해 주세요");
    }
    if (!Pwd.equals("12345")) {
      throw new WrongPasswordException("비밀번호를 확인해 주세요");
    }
  }
}
