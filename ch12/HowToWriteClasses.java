public class HowToWriteClasses {
  private String exerciseName;
  private int numDoingIt;
  
  public HowToWriteClasses () {
    exerciseName = "workout";
    numDoingIt = 1;
  }
  
  public HowToWriteClasses(String name, int num) {
    exerciseName = name;
    numDoingIt = num;
  }
  
  public String getName() {
    return exerciseName;
  }
  
}