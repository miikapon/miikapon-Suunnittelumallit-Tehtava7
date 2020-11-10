package state;

public class Bulbasaur implements Pokemon {
  @Override
  public Pokemon evolve() {
    System.out.println("Evolved into Ivysaur");
    return new Ivysaur();
  }

  @Override
  public void useItem() {
    System.out.println("Use item: Lucky Egg");
  }

  @Override
  public void Attack() {
    System.out.println("Use Vine Whip!");
  }
}