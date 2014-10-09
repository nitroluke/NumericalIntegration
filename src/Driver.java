/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nitroluke
 */
import java.util.Scanner;

public class Driver
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("What is the lower bound? >");
        double lb = in.nextDouble();
        
        System.out.println("What is the upper bound? >");
        double ub = in.nextDouble();
        
        System.out.println("How many rectangles would you like to use? >");
        int numRec = in.nextInt();
        
        double area = Integration.numericallyIntegrate(lb, ub, numRec);
        //double area = Integration.numericallyIntegrate2(lb, ub, numRec);
        System.out.format("Approximate area = %.6f", area);
    }
}
