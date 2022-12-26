import java.awt.Color;
import java.util.ArrayList;
import java.awt.Graphics;

// okay let me send u what i got in discord this is confusing

public class Map {
  private ArrayList<Obj> platforms;
  private ArrayList<Button> buttons;
  private Water water;
  private Exit exit;

  public Map(Water water, Exit exit) {
    this.water = water;
    this.exit = exit;
  }
  public void addPlatform(Obj platform){
    this.platforms.add(platform);
  }
  public void addButton(Button button){
    buttons.add(button);
  }
  private void load() {
    for (int i = 0; i < platforms.size(); i++) {
      //draw(platforms.get(i))
    }
    for (int i = 0; i < buttons.size(); i++) {
      //draw(buttons.get(i))
    }
    //draw(this.exit);
    //draw(this.water);
  }

  public void moveMap(int x, int y){
    // Create a following camera effect for the player, making the map move around when the player moves
  }

}

    // we just need to make sure each individual class and obj works
    // then everything will be a lot easier
