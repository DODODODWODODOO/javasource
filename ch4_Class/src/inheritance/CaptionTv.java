package inheritance;

public class CaptionTv extends Tv {

  // CaptionTv(){super();}

  boolean caption;

  public CaptionTv(boolean power, int channel, boolean caption) {
    super(power, channel); // 부모의 생성자
    this.caption = caption; // 본인
  }

  public CaptionTv(boolean caption) {
    this.caption = caption;
  }

  void displayCaption(String text) {
    // if(caption!=true) == if(!caption)

    //if(caption==true)
    if (caption) {
      System.out.println(text);
    }
  }
}
