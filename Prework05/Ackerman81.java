import java.util.Scanner;
public class Ackerman81 {

	// Assumes n >= 0, m >= 0
	public static int ack(int m, int n) {
    Scanner sc = new Scanner(System.in);
//Integer m=sc.nextInt();
//Integer n=sc.nextInt();
  //System.out.println("Enter a number less than 5");

System.out.println( "ack("+m+","+n+") = "+ ack(m, n) );
  
//Integer m=sc.nextInt();
//Integer n=sc.nextInt();
System.out.println( "ack("+m+","+n+") = "+ ack(m, n) );
      
		if (m == 0) {
			return n + 1;
		}
		else if (n == 0) {
			return ack(m - 1, 1);
		}
		else {
			return ack(m - 1, ack(m, n - 1)); 
		}
	}
	
	public static void main(String[] args) {
		System.out.println("A(0, 0) = " + ack(0, 0));
		System.out.println("A(0, 1) = " + ack(0, 1));
		System.out.println("A(1, 0) = " + ack(1, 0));
		System.out.println("A(2, 1) = " + ack(2, 1));
		System.out.println("A(1, 1) = " + ack(1, 1));
		System.out.println("A(2, 2) = " + ack(2, 2));
	}
}