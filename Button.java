import java.awt.*;
import javax.swing.*;
public class Button extends Obj{
  private boolean on = false;
  public Button(int height, int width, int x, int y, Color color){
    super(height, width, x, y, color, true, false, "button");
  }
  public void turnOn(){
    this.on = true;
  }
}
