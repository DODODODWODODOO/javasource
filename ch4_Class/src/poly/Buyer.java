package poly;

public class Buyer {

  int money = 1000; //소유금액
  int bounsPoint = 0;

  // void buy(Tv tv){
  //     if(money < tv.price){
  //         System.out.println("잔액이 부족하여 물건 구매 불가");
  //         return;
  //     }
  //     money -= tv.price;
  //     bounsPoint += tv.bounsPoint;
  //     System.out.println(tv + " 제품을 구매하셨습니다.");
  // }

  // void buy(Computer computer){
  //     if(money < computer.price){
  //         System.out.println("잔액이 부족하여 물건 구매 불가");
  //         return;
  //     }
  //     money -= computer.price;
  //     bounsPoint += computer.bounsPoint;
  //     System.out.println(computer + " 제품을 구매하셨습니다.");
  // }
  void buy(Product p) {
    if (money < p.price) {
      System.out.println("잔액이 부족하여 물건 구매 불가");
      return;
    }
    money -= p.price;
    bounsPoint += p.bounsPoint;
    System.out.println(p + " 제품을 구매하셨습니다.");
  }
}
