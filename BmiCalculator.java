/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmicalculator;
import java.util.Scanner;
/**
 *
 * @author Richard Shiawase
 */
public class BmiCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        double kilosWeight= 0.45359237;
        System.out.print("Input weight in pounds: ");
        double poundWeight = sc.nextDouble();
        poundWeight *= kilosWeight;
        
        System.out.print("Input height in inches: ");
        float inchesHeight = sc.nextFloat();
        double metreHeight = 0.0254;
        inchesHeight *=  metreHeight;
        //inchesHeight *=inchesHeight;
        //System.out.println(inchesHeight);
        inchesHeight = (float) Math.pow(inchesHeight, 2);
        //System.out.print(inchesHeight);
        double bmi =  poundWeight/inchesHeight;
        System.out.println("Body Mass Index is "+bmi);

    }
    
}

