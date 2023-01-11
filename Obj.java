import javax.swing.*;
import java.awt.*;

public class Obj extends JLabel {
  private int height;
  private int width;
  private int x;
  private int y;
  private int displayX;
  private int displayY;
  private Color color;
  private boolean exit;
  private boolean btn;
  private String type;

  public Obj(int height, int width, int x, int y, Color color, boolean btn, boolean exit, String type) {
    this.width = width;
    this.height = height;
    this.color = color;
    this.displayX = x;
    this.displayY = y;
    this.x = x;
    this.y = y;
    this.btn = btn;
    this.exit = exit;
    this.type = type;
  }

  public Obj(int height, int width, int x, int y, boolean btn, boolean exit) {
    this.width = width;
    this.height = height;
    this.displayX = x;
    this.displayY = y;
    this.x = x;
    this.y = y;
    this.btn = btn;
    this.exit = exit;
  }

  public Obj() {

  }

  public int getX() {
    return this.x;
  }

  public int getY() {
    return this.y;
  }

  public void addX(int x) {
    this.displayX += x;
  }

  public void addY(int y) {
    this.displayY += y;
  }

  public int getWidth() {
    return this.width;
  }

  public int getHeight() {
    return this.height;
  }
}
