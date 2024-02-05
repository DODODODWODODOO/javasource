package exam;

import java.time.LocalDateTime;

public class Board {

  // 번호, 제목, 내용, 작성자, 작성날짜, 수정날짜
  private int num;
  private String title;
  private String text;
  private String name;
  private LocalDateTime regDate;
  private LocalDateTime lastModifedDate;

  // default
  public Board() {}

  // 4 개만
  public Board(int num, String title, String text, String name) {
    this.num = num;
    this.title = title;
    this.text = text;
    this.name = name;
  }
}
