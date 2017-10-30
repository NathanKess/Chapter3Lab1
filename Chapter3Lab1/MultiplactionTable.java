
/**
 * Write a description of class MultiplactionTable here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MultiplactionTable
{
    public static void main(String[]args){
        for (int y = 1; y<=12; y++){
            for (int k = 1; k<=12; k++){
                System.out.print(y*k);
            }
            System.out.println();
        }
    }
}
