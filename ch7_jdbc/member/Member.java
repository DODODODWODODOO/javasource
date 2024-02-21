package member;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// ~~DTO : 생성자, getter, setter, toString
// @Data : toString, Getter, Setter, default 생성자, equals, HashCode

// @Data
@Getter
@Setter
@ToString
@NoArgsConstructor // default 생성자
@AllArgsConstructor // 맴버 변수 모두 포함 생성자
public class Member {

  private String id;
  private String name;
  private String password;
}
