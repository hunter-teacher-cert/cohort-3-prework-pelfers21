import java.util.Scanner;

/**
 * Converts Celcius to Fahrenheight.
 */
public class Celsius {

    public static void main(String[] args) {
        int cel;
        double far;
        Scanner in = new Scanner(System.in);
      //asks for input from the user
        System.out.print("What is the temperature in Celsius? ");
        cel = in.nextInt();
      //creates a constant for 9/5 or 1.8
        final double CEL_TO_FAR = 1.8;
      
       //formula for conversion
        far = cel * CEL_TO_FAR + 32;
        System.out.print(cel + " Celsius = ");
        //prints out temperature in Fahrenheight
        System.out.println(far + " Fahrenheight");
    }

}
