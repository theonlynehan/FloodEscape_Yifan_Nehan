import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Menu {
  private JFrame frame;
  private JPanel panel;
  private JButton playButton;
  private JButton exitButton;
  private Image backgroundImage;

  public Menu() {
    frame = new JFrame("Flood Escape");
    panel = new JPanel();
    playButton = new JButton("Play");
    exitButton = new JButton("Exit");
    backgroundImage = Toolkit.getDefaultToolkit().getImage("bruh.png");

    panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
    panel.add(playButton);
    panel.add(exitButton);

    frame.add(panel);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400, 400);
    frame.setVisible(true);
  }

  public void render(Graphics g) {
    g.drawImage(backgroundImage, 0, 0, null);
    panel.paintComponents(g);
  }
}