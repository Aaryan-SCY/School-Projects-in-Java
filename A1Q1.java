import java.lang.Math;

/***************************************************** w22
 * 
 * course: Comp 1006 
 * assignment: 1
 * question: 1 
 * 
 * name: Aaryan Sharma  
 * id: 101230220
 * 
 * comments:
 * 
 ********************************************************/
public class A1Q1{

    public static double[] rollingAverage(double[] data, int width){
        /* Pre-conditions:
             These are conditions that the input will always satisfy  
             0 <= data.length <= Integer.MAX_VALUE/100
             1 <= width <= Integer.MAX_VALUE
        */
        
        //
        // add your code here!
        //

        double widthsum = 0;
        double[] rollingavg = new double[data.length];
        double Interger = Math.pow(2,32);
        //if statements to check for elgibility
        if ((data.length <= Interger/100) && (data.length>=1) ){
            //another if statement to check for elgibiility
                if ((width<=Interger) && (width>=1)) {
                    for (int i=0; i < data.length; i++){
                        
                        //rollning average calculaions
                        widthsum += data[i];
                        if (i>= width-1){
                            rollingavg[i]= widthsum/width;
                            widthsum-= data[i-(width-1)];


                        } 
                        else {
                            rollingavg[i]= Double.NaN;

                        }
                    }
                }
                else{//quick else statemnts
                    System.out.println("Your Width size is too Big or too Small.");
                }
        }
        else {//quick else statemnts
        System.out.println("Your Data length is too Large or too Small.");   
        }
        
        //desired return value

        return rollingavg;

    }
     


    // You are NOT asked to write a program so this following main 
    // method is not needed. However, you CAN write code here to help
    // test your methods. Just be sure that whatever you add here 
    // compile and does not rely on any imports that are not standard.
    // 
    // public static void main(String[] args){
    //     int width = 1;
    //     double[] data = {1,2,4};
    //     // used for practice to check output if it is accurate
    //     System.out.println(java.util.Arrays.toString(A1Q1.rollingAverage(data, width)));

    // }
}



