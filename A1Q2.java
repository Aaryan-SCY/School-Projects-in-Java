import java.lang.Math;
import java.util.Arrays;
// /***************************************************** w22
//  * 
//  * course: Comp 1006
//  * assignment: 1
//  * question: 2
//  * 
//  * name:  Aaryan Sharma
//  * id: 101230220
//  * comments:
//  * 
//  ********************************************************/ 
public class A1Q2{

    public static double[][] peaks(double[] data, double epsilon){
        /*  All input arguments must satisfy. We will only use valid
            input arguments when testing your code.

            data: 0 <= data.length <= Integer.MAX_VALUE
            epsilon: epsilon > 0.0 

            Must return an array with TWO arrays in it. 
        */


        // this will be your output array
        

        //
        // add your code here!
        //

        int positions = 0;
        int numOfPeaks = 0;
        double Interger = Math.pow(2, 32);
        
        if ((data.length>=0)&&(data.length<=Interger/100)){
           
            // first part of code is to find the desired length for the lists
            if (epsilon>0.0){
                // Run Code
                for (int i=0; i<data.length; i++){
                    
                    if (i==0){
                        if (data[i] > data[i+1]){
                            if ((epsilon < Math.abs(data[i]-data[i+1]))){
                            //considerd peak of value position of zero
                            //also checks if value is same using epsilon
                                positions+=1; 
                                numOfPeaks+=1;
                            }
                        }
                    }
                            
                    else if (i==data.length-1){
                        if (data[i] > (data[i-1])){
                            if ((epsilon < Math.abs(data[i]-data[i-1]))){
                                positions+=1;
                                numOfPeaks+=1;
                            }
                        }
                    }

                    else{
                        if ((data[i]>data[i-1])&& (data[i]>data[i+1])){
                            if ((epsilon < Math.abs(data[i]-data[i+1]) && (epsilon < Math.abs(data[i]-data[i-1])))){
                            numOfPeaks+=1;
                            positions+=1;
                            }
                        }

                    }
                
                }
            }
        }

        //length of array found
        double[] Peaks = new double[numOfPeaks];
        double[] PeakPositions = new double[positions];
        int counter = 0;
        // putting values into the array
        for (int i=0; i<data.length; i++){

            if (i==0){
                if (data[i] > data[i+1]){
                    if ((epsilon < Math.abs(data[i]-data[i+1]))){
                        //considerd peak of value position of zero
                        Peaks[counter] = data[i];
                        PeakPositions[counter] = (double)i;
                        counter += 1;
                    }



                }
            }

            else if (i==data.length-1){
                if (data[i] > (data[i-1])){
                    if ((epsilon < Math.abs(data[i]-data[i-1]))){
                        Peaks[counter] = data[i];
                        PeakPositions[counter] = (double)i;
                        counter += 1;
                
                    }  
                }      
            }

            else{
                if ((data[i]>data[i-1])&& (data[i]>data[i+1])){
                    if (((epsilon < Math.abs(data[i]-data[i+1])) && (epsilon < Math.abs(data[i]-data[i-1])))){

                        Peaks[counter] = data[i];
                        PeakPositions[counter] = (double)i;
                        counter += 1;
                    }
                }

            }


        }
        //prints out 2d array using the arrays gathered
        double[][] out = {Peaks,PeakPositions};
        return out; 
        
    }
     
    // public static void main(String[] args){
    //     double[] data = {1.1, 2.2, 1.1, 2.2, 3.3};
    //     double epsilon = 0.00001;

        // just used it to test program to see if it works
    //     System.out.println(Arrays.deepToString(A1Q2.peaks(data, epsilon)));
    //     // System.out.println(java.util.Arrays.toString(A1Q1.rollingAverage(data, width)));
    // }
}


