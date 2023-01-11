import javax.swing.*;
import java.awt.*;
import java.util.*;
public class Map{
  private ArrayList <Obj> objs = new ArrayList <Obj>();
  private Water water;

  public Map(){
    
  }
  public Map(ArrayList <Obj> objs){
    this.objs = objs;
  }
  public void load(){
    for(int i =0; i<objs.size(); i+=1){
      // use the render method here
    }
    // also render the water
  }
}
