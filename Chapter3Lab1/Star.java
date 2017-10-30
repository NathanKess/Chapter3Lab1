
/**
 * Write a description of class Star here.
 *
 * @author nathan kessenich
 * @version (a version number or a date)
 */
public class Star
{
    public static void main(String[]args)
    {
       printA();
       printB();
       printC();
    }
    public static void printItem(char letter, int num)
    {
        for (int k = num; k > 0; k--){
            System.out.print(letter);
        }
    }
    public static void printA()
    {
        for(int i = 10; i>0; i--){ 
        printItem('*', i);
        System.out.println();
    }
    }
    public static void printB()
    {
        for (int j = 10; j>0; j--){
            printItem(' ', j-1);
            printItem('*', 11-j);
            System.out.println();
        }
    }
    public static void printC(){
        for (int r = 10; r>0; r--){
            printItem('*', r-1);
            printItem(' ', 11-r);
            System.out.println();
        }
    }
}
