
import static java.lang.Math.cos;

/**
 * Integration class to do numerical integration.
 * 
 * @author yaw 
 * @version 03 Oct 2014
 */
public class Integration {
    
    public static double numericallyIntegrate(double lb, double ub, double numRec) {
        double area = 0.0;
        
        //Your code goes in here.
        double width = (ub-lb)/numRec;
        for(double i = (lb + width/2);  i < ub; i+= width){
            area += function(i) * width;
        }
        return area;
    }
    
    public static double numericallyIntegrate2(double lb, double ub, double numRec) {
        double area = 0.0;
        
        //Your code goes in here.
        double width = (ub-lb)/numRec; 
        for(int i = 0; i < numRec; i++){
            area += function(lb + (i*width +(width/2))) * width;
        }
        return area;
    }
    
    
    private static double function(double x) {
        return x * x;
    }
}
