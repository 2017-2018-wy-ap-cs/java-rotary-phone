public class JerseyCow extends Cow
{  
  
  public JerseyCow (int milk) {
    super(milk);
  }
  
  public int giveMilk() {
    return super.giveMilk() + super.giveMilk();
  }
}
