import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Player implements KeyListener{
  private int x;
  private int y;
  
  public Player() {
    this.x = 0;
    this.y = 0;
  }
  
  public void move(KeyEvent e) {
	    if (e.getKeyCode() == KeyEvent.VK_A) {
	      x -= 3;
	    } else if (e.getKeyCode() == KeyEvent.VK_D) {
	      x += 3;
	    }
	  }
  
  public int getX() {
    return this.x;
  }
  
  public int getY() {
    return this.y;
  }
    
  public void jump() {
  }

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

    
  }

