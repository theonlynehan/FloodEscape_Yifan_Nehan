import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Button extends Obj {
  private static ImageIcon btnNotPressed = new ImageIcon("file2.png"); // will add the images later
  private static ImageIcon btnPressed = new ImageIcon("file.png");
  private boolean isStopped;
  private Water water;
  private Player player;

  public Button() {
    super(); // this doesn't work yet
    this.setIcon(btnNotPressed);
  }

  // we will change this later so that the player checks for all collisions
  public boolean playerWithinBounds() {
    int playerX = player.getX();
    int playerY = player.getY();

    int buttonX = this.getX();
    int buttonY = this.getY();
    int buttonWidth = this.getWidth();
    int buttonHeight = this.getHeight();

    if (playerX >= buttonX && playerX <= buttonX + buttonWidth && playerY >= buttonY
        && playerY <= buttonY + buttonHeight) {
      return true;
    } else {
      return false;
    }
  }

  public void render(Graphics g) {
    g.setColor(Color.RED);
    g.fillRect(getX(), getY(), getWidth(), getHeight());
    g.setColor(Color.BLACK);
    g.drawString(getText(), getX() + getWidth() / 2, getY() + getHeight() / 2);
  }

}
