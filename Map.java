import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;
import java.awt.Graphics;


public class Map {
  private ArrayList<Platform> platforms;
  private Button button;
  private Random random;

  public Map(Button button) {
    this.button = button;
    this.platforms = new ArrayList<>();
    this.random = new Random();
    loadPlatforms();
  }

  private void loadPlatforms() {
    for (int i = 0; i < 10; i++) {
      int x = random.nextInt(400); 
      int y = 50 * i; 
      int width = 100; 
      int height = 10; 
      platforms.add(new Platform(x, y, width, height));
    }

    Platform lastPlatform = platforms.get(platforms.size() - 1);
    button.setBounds(lastPlatform.getX(), lastPlatform.getY(),       lastPlatform.getWidth(), lastPlatform.getHeight());
  }

  public void render(Graphics g) {
    for (Platform platform : platforms) {
      platform.render(g);
    }

    button.render(g);
  }
}