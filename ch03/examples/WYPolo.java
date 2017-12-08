
public class WYPolo implements WaterPoloPlayer {
  private int shots;
  
  public WYPolo (int s) {
    shots = s;
  }
  
  public void swim() {
    System.out.println("Woosh");
  }
  
  public void shoot() {
    shots += 1;
    System.out.println("Blam!");
  }
}
