import java.util.*;
public class Ackerman {
 public static Integer ack(Integer m, Integer n){

if (m == 0){
return n + 1;
}
if (n == 0){
return ack(m - 1, 1);
}
return ack(m - 1, ack(m, n - 1));
}
public static void main(String[] args) {


//uncomment the below lines to check for your inputs, make sure that the values of
//m and n should be very small because ackermann function gives very large number for simple inputs.
//for example: ack(4, 2) gives an integer of 19,729 digits,due to this very large number,
// stack grows rapidly(stack overflows) which leads to stack overflow error.

Scanner sc = new Scanner(System.in);
Integer m=sc.nextInt();
Integer n=sc.nextInt();
System.out.println( "ack("+m+","+n+") = "+ ack(m, n) );
  

  
  
System.out.println( "ack(0,0) = " + ack(0, 0) );
System.out.println( "ack(1,0) = " + ack(1, 0) );
System.out.println( "ack(1,1) = " + ack(1, 1) );
System.out.println( "ack(2,2) = " + ack(2, 2) );
}
}


//Sample outputs:

//ack(0,0) = 1
//ack(1,0) = 2
//ack(1,1) = 3
//ack(2,2) = 7java