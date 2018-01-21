public class Ch12Lecture2 {

  public void talk() {
   
    int[] nums = new int[40];
    for(int k = 0; k<40; k++) {
      nums[k] = k*k;
    }
    
    
    int[][] quick = new int[30][60];
    
    // row major order = row comes first in coordinates
    for(int row=0; row<30; row++) {
      for (int col=0; col<60; col++) {
        quick[row][col] = row - col*col;
      }
    }
    
    // "traverse in column major order"
    for(int col=0; col<60; col++) {
      for(int row=0; row<30; row++) {
        quick[row][col] = 0;
      }
    }
  }
  
  // purpose: return 1d array of int containing
  // max in each column, so
  // answer[j] is max of data[*][j]
  // ASSUME: data is a rectangular array
  public static int[] columnMax (int[][]data) {
    int rows = data.length;
    int cols = data[0].length; // length of first row
    
    int[] answer = new int[cols];
    
    for(int c=0; c<cols; c++) {
      int m = data[0][c];
      
      for(int r=0; r<rows; r++) {
        int d = data[r][c];
        
        if ( d > m ) {
          m = d;
        }
      }
      
      answer[c] = m;
    }
    
      
      
    return answer;
    
  }
  
  
}
