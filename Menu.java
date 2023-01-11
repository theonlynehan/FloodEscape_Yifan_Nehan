import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Menu implements ActionListener {
  private JFrame frame; // this is not good
  private JPanel panel;
  private JButton playButton;
  private JButton exitButton;
  private Image backgroundImage;

  public Menu() {
    frame = new JFrame("Flood Escape");
    panel = new JPanel();
    playButton = new JButton("Play");
    playButton.addActionListener(this);
    exitButton = new JButton("Exit");
    exitButton.addActionListener(this);
    backgroundImage = Toolkit.getDefaultToolkit().getImage("bruh.png");

    panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
    panel.add(playButton);
    panel.add(exitButton);

    frame.add(panel);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400, 400);
    frame.setVisible(true);
  }

  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == playButton)
      runGame();
    else if (e.getSource() == exitButton)
      frame.dispose();
  }

  public void render(Graphics g) {
    g.drawImage(backgroundImage, 0, 0, null);
    panel.paintComponents(g);
  }

  public JFrame getFrame() {
    return this.frame;
  }
}
