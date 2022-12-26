public class Player {
  private int x;
  private int y;
  private int velocity = 0;
  private boolean left = false;
  private boolean right = false;
  private boolean up = false;

  public Player() {
    this.x = 0;
    this.y = 0;
  }

  public void moveUp() {
    this.y += this.velocity;
  }

  public void moveDown() {
    this.y -= this.velocity;
  }

  public void moveLeft() {
    this.x -= this.velocity;
  }

  public void moveRight() {
    this.x += this.velocity;
  }

 //   public void move(KeyEvent e) {
	//    if (e.getKeyCode() == KeyEvent.VK_A) {
	//    x -= 3;
	//   } else if (e.getKeyCode() == KeyEvent.VK_D) {
	//      x += 3;
	//     }
	//   }
  //we could use this instead of the methods, but I dont know how to add it to the game kk

  public int getX() {
    return this.x;
  }

  public int getY() {
    return this.y;
  }

  public void jump() {
    for (int i = 0; i < 15; i++) {
      this.y += 1;
    }

    try {
      Thread.sleep(500);
    } catch (InterruptedException e) {
    }

    for (int i = 0; i < 15; i++) {
      this.y -= 1;
    }
  }

  public void nextVersion() {
    // just switches the icon that the player is based on movement
  }

  public boolean collide(Obj obj) {
    // collision detection function to write
    return false;
    // will stop the player from moving when it collides with platform
  }
}
