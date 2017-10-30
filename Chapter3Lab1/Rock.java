// ****************************************************************
//   Rock.java
//
//   Play Rock, Paper, Scissors with the user
//          
// ****************************************************************
import java.util.Scanner;
import java.util.Random;
public class Rock
{
    public static void main(String[] args)
    {
        String personPlay = "";    //User's play -- "R", "P", or "S"
        String computerPlay = "";  //Computer's play -- "R", "P", or "S"
        int computerInt;      //Randomly generated number used to determine
                              //computer's play
        Scanner scan = new Scanner(System.in);
        
        Random generator = new Random();
        //Get player's play -- note that this is stored as a string
        personPlay = scan.next();
        //Make player's play uppercase for ease of comparison
        personPlay.toUpperCase();
        //Generate computer's play (0,1,2)
        computerInt = generator.nextInt(3);
        //Translate computer's randomly generated play to string
        if (computerInt == 0){
            computerPlay = "R";
        }
        else if (computerInt == 1){
            computerPlay = "P";
        }
        else if (computerInt == 2){
            computerPlay = "S";
        }
        //Print computer's play
        System.out.println(computerPlay);
        //See who won.
        if (personPlay.equals(computerPlay)){
            System.out.println("Tie");
        }
        else if (personPlay.equals("R") && computerPlay.equals("S")){
            System.out.println("You Win!");
        }
        else if (personPlay.equals("P") && computerPlay.equals("R")){
            System.out.println("You Win!");
        }
        else if (personPlay.equals("S") && computerPlay.equals("P")){
            System.out.println("You Win!");
        }
        else if (personPlay.equals("S") && computerPlay.equals("R")){
            System.out.println("You Loose");
        }
        else if (personPlay.equals("R") && computerPlay.equals("P")){
            System.out.println("You Loose");
        }
        else if (personPlay.equals("P") && computerPlay.equals("S")){
            System.out.println("You Loose");
        }
    }
}