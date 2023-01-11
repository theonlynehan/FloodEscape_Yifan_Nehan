public class Game {
  private Map map;
  private boolean over = false;
  public Game(){
    
  }
  public void loadMenu(){
    
  }
  public void setMap(Map map){
    this.map = map;
  }
  public void play(Map map){
    setMap(map);
    
    // clear the rest of the GUI
    
    this.map.load();
    while(!over){
      
    }
  }

  // Implement actionlisteners for player movement
}
