public class MyMain {

    // Returns the mean of the 2D array mat
    public static double mean(double[][] mat) { 
        int sum = 0;
        double x = 0;
        int counter = 0;
        int average = 0;
        for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
                x = mat[i][j];
                counter++;
                sum += x;
                
			}
			
        }
        average = sum/counter;

        return average;
    }

    // Returns the median of the 2D array mat
    public static double median(double[][] mat) { 
        int x  = (mat.length)*(mat[0].length);
        double[] medList = new double[x];
        int k = 0;
        for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
                medList[k] = mat[i][j];
                k++;
                
                
			}
			
        }
        
        
            
        
        double median = 0;
        if (medList.length%2==0){
            median = medList[medList.length/2];
        }
        else{
            median = (medList[(medList.length-1)/2]);
        }
        

        

        return median;
    }
    

    // Returns the mode of the 2D array mat
    public static double mode(double[][] mat) { 
        double x = 0;
        int counter = 0;
        int greatestCounter = 0;
        double mode = 0;
        for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
                x = mat[i][j];
                for (int k = 0; k < mat.length; k++) {
			        for (int l = 0; l < mat[0].length; l++) {
                    
                    if(mat[k][l]==x){
                        counter++;
                    }
                    if(greatestCounter<counter){
                        mode = mat[k][l];
                        greatestCounter=counter;
                    }
                    else{
                        mode = mat[i][j];
                    }
                
			        }
			
                }
            
                
			}
			
        }
        return mode;
    }


    public static void main(String[] args) {
        
    }
}
