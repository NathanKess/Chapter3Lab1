
/**
 * Write a description of class Charge_Account here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;
import java.text.NumberFormat;

public class Charge_Account
{
    public static void main (String[] args)
    {
        double previousBallence;
        double AdditionalCharges;
        double interest = .02;
        double newBallence = 0.0;
        double minOwed;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter Previous Ballence: ");
        previousBallence = scan.nextDouble();
        System.out.println("Enter Total Ammount of Additional Charges: ");
        AdditionalCharges = scan.nextDouble();
        
        if (previousBallence > 0){
            newBallence = (previousBallence + AdditionalCharges)*interest;
        }
        
        if (newBallence < 50){
            minOwed = newBallence;
        }
        else if (newBallence >= 50 && newBallence <= 300){
            minOwed = 50;
        }
        else if (newBallence > 300){
            minOwed = newBallence*0.2;
        }
        
        System.out.println("Ammount owd is: " + ((previousBallence*interest)+AdditionalCharges));
     
    }
}
