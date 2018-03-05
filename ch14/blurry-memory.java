        // how many square with all values nearby "close"
        int count = 0;
        
        for(int row=0; row<size; row++) {
            for (int col=0; col<size; col++) {
                int far = 0;
                for(int drow = -1; drow <= 1; drow++ ) {
                    for(int dcol = -1; dcol <= 1; dcol++) {
                        if ( 0 <= col+dcol 
                           && col+dcol < size
                           && 0 <= row + drow
                           && row + drow < size ) 
                        {
                            if (Math.abs(data[row][col] 
                                         - data[row+drow][col+dcol]) > close)
                            {
                                far += 1;
                            }
                        }
                    }
                }
                if (far==0) {
                    count += 1;
                }
            }
        }
