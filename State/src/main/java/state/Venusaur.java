  
package state;

public class Venusaur implements Pokemon {
  @Override
  public Pokemon evolve() {
    System.out.println("Already reached final evolution");
    return new Venusaur();
  }

  @Override
  public void useItem() {
    System.out.println("Use item: Wonder Chest");
  }

  @Override
  public void Attack() {
    System.out.println("Use Solar Beam!");
  }
}
