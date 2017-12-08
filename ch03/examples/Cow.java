import java.io.*;
public class Cow implements BarnAnimal
{
  private int milch;
  public Cow (int milk) {
    milch = milk;
  }
  
  public int giveMilk() {
    int amount = (int) ( Math.random() * 5 + 1);
    if (amount > milch) { amount = milch; }
    
    milch -= amount;
    return amount;
  }
  
  public void makeNoise() {
    System.out.println("Moo");
  }
}