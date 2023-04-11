import java.util.Scanner;
import java.lang.Math;

/***************************************************** w22
 * 
 * course: Comp 1006 
 * assignment: 1
 * question: Part 2 
 * 
 * name: Aaryan Sharma  
 * id: 101230220
 * 
 * comments:
 * 
 ********************************************************/



public class Part2{
    public static String plot(String[] labels, double[] values, double[] rollingAves){
        
        int spaces = 0;
        //checking for spaces required when formatting
        for (int i=0; i<labels.length; i++){
            spaces = labels[i].length();

        }
        
        //checking for ratio length
        double max = 0; 
        for (double d: rollingAves){
            if (d>max){
                max = d; 
            }
        }

        // int maxwidth= 40;
        // for (double d: rollingAves){
        //     for (int i=0; i<maxwidth*(d/max); i++){
        //         if (i = 
        //         System.out.print('-');
        //     }
        // }

        //  couldn't figiure out the formatting







        

    }
    
        public static void main(String[] args){
            
            Scanner keyboard = new Scanner(System.in);

            System.out.print("Enter number of datapoints: "); 
            
            int datapoints = keyboard.nextInt();

            System.out.print("Enter width for rolling average: ");
            int width = keyboard.nextInt();

            System.out.println("Enter data one line at a time as label , value: ");
            
            String[] labelvalue = new String[datapoints];
            
            //looping for points
            labelvalue[0] = keyboard.nextLine();
            for (int i=0; i<datapoints; i++){
                labelvalue[i] = keyboard.nextLine();
            
            }
            
            //creating the values and labels list
            String[] labels = new String[datapoints];
            double[] values = new double[datapoints];
            for (int i=0; i<labelvalue.length; i++){
                String[] templist = labelvalue[i].split(",");
                labels[i]=templist[0];
                values[i]= Double.parseDouble(templist[1]);



                
            }
            
            // rolling average calculatiions
            double widthsum = 0;
            double[] rollingAves = new double[values.length];
            
                for (int i=0; i < values.length; i++){
                    
                    widthsum += values[i];
                    if (i>= width-1){
                        rollingAves[i]= Math.round(widthsum/width);
                        widthsum-= values[i-(width-1)];
        
        
                    } 
                    else {
                        rollingAves[i]= Double.NaN;
                    }
                }

            plot(labels, values, rollingAves);


        }


} 
