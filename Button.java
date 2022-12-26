import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Button extends JButton implements ActionListener {
  private boolean isStopped; 
  private Water water;
  private Player player; 

  public Button(Water water, Player player) {
    this.water = water;
    this.player = player;
    this.isStopped = false;
    this.setText("Press Me!");
    this.addActionListener(this);
  }

  public void actionPerformed(ActionEvent e) {
    if (!isStopped && playerWithinBounds()) {
      this.setText("You Won!");
      this.isStopped = true;
      water.stopWater();
    }
  }

  public boolean playerWithinBounds() {
    int playerX = player.getX();
    int playerY = player.getY();

    int buttonX = this.getX();
    int buttonY = this.getY();
    int buttonWidth = this.getWidth();
    int buttonHeight = this.getHeight();

    if (playerX >= buttonX && playerX <= buttonX + buttonWidth && playerY      >= buttonY && playerY <= buttonY + buttonHeight) {
      return true;
    } else {
      return false;
    }
  }

  public void render(Graphics g) {
    g.setColor(Color.RED);
    g.fillRect(getX(), getY(), getWidth(), getHeight());
    g.setColor(Color.BLACK);
    g.drawString(getText(), getX()+getWidth()/2, getY() + getHeight() / 2);
  }

}
