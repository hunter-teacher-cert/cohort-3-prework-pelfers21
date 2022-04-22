import java.util.*;
import java.util.Scanner;
public class Exercise03 {

public static boolean isTriangle(int length1, int length2, int length3) {	
		// return false if any side length is greater than the sum of other two sides
		  if (length1 > (length2 + length3)) {
		  return false;
		  } else if (length2 > (length1 + length3)) {
			return false;
		  } else if (length3 > (length1 + length2)) {
			return false;
		  } else {
			return true;
		}
  }
public static void main(String[] args) {
Scanner keyboard = new Scanner(System.in);
  System.out.print("Pick three lengths, length1 length2 length3");

       int length1  = keyboard.nextInt(); 
       int length2  = keyboard.nextInt();
       int length3  = keyboard.nextInt();
  //System.out.println(isTriangle);
  } 
 
}
	

