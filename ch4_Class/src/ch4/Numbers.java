package ch4;

public class Numbers {

  private int num[];

  public Numbers(int[] num) {
    this.num = num;
  }

  int getTotla() {
    int totla = 0;
    for (int i : num) {
      totla += i;
    }
    return totla;
  }

  int gerAverage() {
    return getTotla() / num.length;
  }
}
