import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Player {
  private int x;
  private int y;
  private int width;
  private int height;
  private ImageIcon img;
  private static int speed = 5;

  public Player(int x, int y) {
    this.y = y;
    this.x = x;
    this.width = 100;
    this.height = 100;
  }

  public Player() {

  }

  public Player(int x, int y, ImageIcon img) {
    this.x = x;
    this.y = y;
    this.width = img.getIconWidth();
    this.height = img.getIconHeight();
    this.img = img;
  }

  public boolean collision(Obj[] labels) {
    for (int i = 0; i < labels.length; i++) {
      if (this.x < labels[i].getX() + labels[i].getWidth() &&
          this.x + this.width > labels[i].getX() &&
          this.y < labels[i].getY() + labels[i].getHeight() &&
          this.height + this.y > labels[i].getY()) {
        return true;
      }
    }
    return false;
  }

  public void left(Obj[] labels) {
    if (!collision(labels)) {
      this.x -= this.speed;
    }
  }

  public void right(Obj[] labels) {
    if (!collision(labels)) {
      this.x += this.speed;
    }
  }

  public void jump(Obj[] labels) {
    for (int i = 0; i < 10; i += 1) {
      if (!collision(labels)) {
        this.y += this.speed;
      }
    }
  }

  public void fall(Obj[] labels) {
    if (!collision(labels)) {
      this.y -= this.speed;
    }
  }

  public void cameraEffectX(Obj[] objs, int x) {
    for (int i = 0; i < objs.length; i += 1) {
      objs[i].addX(x);
    }
  }

  public void cameraEffectY(Obj[] objs, int y) {
    for (int i = 0; i < objs.length; i += 1) {
      objs[i].addY(y);
    }
  }
}
