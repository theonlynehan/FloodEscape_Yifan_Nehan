import java.awt.Color;
import java.awt.Graphics;

public class Platform {
  private int x; 
  private int y; 
  private int width; 
  private int height; 
  private Color color; 

  public Platform(int x, int y, int width, int height) {
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
    this.color = Color.green;
  }

  public int getX() {
    return this.x;
  }

  public int getY() {
    return this.y;
  }

  public int getWidth() {
    return this.width;
  }

  public int getHeight() {
    return this.height;
  }

  public void render(Graphics g) {
    g.setColor(color);
    g.fillRect(x, y, width, height);
  }
}
