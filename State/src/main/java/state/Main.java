package state;

public class Main {
  public static void main(String[] args) throws Exception {
    Player player = new Player();
    player.useItem();
    player.Attack();
    player.evolve();
    player.useItem();
    player.Attack();
    player.evolve();
    player.useItem();
    player.Attack();
    player.evolve();
  }
}