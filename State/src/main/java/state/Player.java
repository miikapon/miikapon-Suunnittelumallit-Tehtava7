  
package state;

public class Player implements Pokemon {
  public Pokemon pokemon;

  public Player() {
    this.pokemon = new Bulbasaur();
  }

  @Override
  public Pokemon evolve() {
    this.pokemon = pokemon.evolve();
    return null;
  }

  @Override
  public void useItem() {
    this.pokemon.useItem();
  }

  @Override
  public void Attack() {
    this.pokemon.Attack();
  }
}