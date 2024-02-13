package abstractclass;

public class Ambulance extends Car {

  void Siren() {
    System.out.println("Siren!!!!");
  }

  @Override
  void drive() {
    System.out.println("Ambulance 달린다");
  }
}
