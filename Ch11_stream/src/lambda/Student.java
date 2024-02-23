package lambda;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor // defalut 생성자
@Getter
@AllArgsConstructor
@ToString
public class Student {

  private String name;
  private int math;
  private int kor;
}
