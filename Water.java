import java.awt.Color;
import java.awt.Graphics;

public class Water {
  private int x;
  private int y;
  private int width;
  private int height;
  private int speed;
  private Color color;
  private boolean isStopped;

  public Water() {
    this.x = 0;
    this.y = 0;
    this.width = 1028;
    this.height = 600;
    this.speed = 2;
    this.color = Color.blue;
    this.isStopped = false;
  }

  public void update() {
    if (!isStopped) {
      y -= speed;
    }
  }

  public void render(Graphics g) {
    g.setColor(color);
    g.fillRect(x, y, width, height);
  }

  public void stopWater() {
    isStopped = true;
  }
}
