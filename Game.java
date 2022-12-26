import java.awt.*;
import javax.swing.*;

public class Game {
  private Button button;
  private Map map;
  private Menu menu;
  private Player player;
  private Water water;
  
  public Game(Water water, Player player) {
	player = new Player();
	water = new Water();
    button = new Button(water, player);
    map = new Map(button);
    menu = new Menu();
  }
  
  public void runGame() {
    
    while (true) {
      water.rise();
      player.move();
      

      
      repaint();
    }
  }
  
  public void repaint(Graphics g) {
    map.render(g);
    player.render(g);
    water.render(g);
  }
}
