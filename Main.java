import javax.swing.*;
import java.awt.*;
import java.awt.color.*;

class Main {
  public static void main(String[] args) {
    Obj[] objs = new Obj[1];
    objs[0] = new Obj(500, 500, 50, 50, Color.green, false, false, "obj");
    Player bruh = new Player(50, 50);
    System.out.println(bruh.collision(objs));
  }
}
