package state;

public class Ivysaur implements Pokemon {
  @Override
  public Pokemon evolve() {
    System.out.println("Evolved into Venusaur");
    return new Venusaur();
  }

  @Override
  public void useItem() {
    System.out.println("Use item: Miracle Chest");
  }

  @Override
  public void Attack() {
    System.out.println("Use Razor Leaf!");
  }
}