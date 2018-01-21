import java.util.Arrays;

public class Ch12Lecture2B {
 
  public static void lecture()
  {
    int[][] nums = {{1,2,3},{5,6,7}};
    System.out.println(Arrays.deepToString(nums));
    for(int[] row : nums) {
      System.out.println(Arrays.toString(row));
    }
    
    int[][] v = new int[30][60];
    int rows = v.length;
    int cols = v[0].length;
    
    for(int r=0;r<rows;r++) {
      for(int c=0;c<cols;c++) {
        int n = 0;
        boolean midR = 1<= r && r<rows-1;
        boolean midC = 1<= c && c<cols-1;
        if(midR && midC) { n = 1;} 
        v[r][c] = n;
      }
    }
    
    // System.out.println(Arrays.deepToString(v));
  }
  
  public static int[][] boxSplitV(int[] data) {
    int n = data.length;
    int half = n/2;
    int[][] answer = new int[2][half];
    
    for(int k=0; k<n; k++) {
      answer[ k / half ][ k % half ] 
        = data[k];
    }
    
    for(int r=0; r<2; r++) {
      for(int c=0; c<half; c++) {
        answer[r][c] = data[c + r*half];
      }
    }
    return answer;
    
  }
  public static void main(String[] args) {
    lecture();
  }
}