public class ScrubPoloPlayer extends WYPolo {
  public ScrubPoloPlayer() {
    super(0);
  }
  
  @Override
  public void swim() {
    super.swim();
    System.out.println("Glub glub glub");
  }
  
  public void fake() { 
    System.out.println("Ha!");
  }
  
  @Override
  public void shoot() {
    fake();
  }
}