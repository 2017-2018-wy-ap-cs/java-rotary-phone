public class MondayWork 
{
  public static double q5 (int n)
  {
    double answer = 1;
    for (int k = 2; k <= n; k++) {
      answer = 1 + 1/answer;
    }
    return answer;
  }
  
  
  public static double q5b (int n)
  {
    if ( n == 1 ) return 1;
    return 1 + 1/q5b(n-1);
  }
  
  public static String triangle (int n)
  {
    String answer = "";
    for(int k=1; k<=n; k++) {
      for (int reps = 0; reps < k; reps++) {
        answer += "*";
      }
      answer += "\n";
    }
    // System.out.println(answer);
    return answer;
  }
  
  public static void triangleJin (int n)
  {
    String s = "*";
    for (int k=0; k<n; k++) {
      System.out.println(s);
      s += "*";
    }
  }
  
}
