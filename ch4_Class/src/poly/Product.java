package poly;

public class Product {

  int price;
  int bounsPoint;

  public Product(int price) {
    this.price = price;
    this.bounsPoint = (int) (price / 10.0); // 보너스 점수 = 가격의 10%
  }
}
