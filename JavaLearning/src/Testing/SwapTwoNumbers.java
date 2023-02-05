package Testing;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int x, y;
	      System.out.println("Enter x and y");
	      Scanner in = new Scanner(System.in);
	  
	      x = in.nextInt();
	      y = in.nextInt();
	  
	      System.out.println("Before Swapping\nx = "+x+"\ny = "+y);
	  
	      x = x + y;
	      System.out.println("Value x = "+ x);
	      y = x - y;
	      System.out.println("Value y = "+ y);
	      x = x - y;
	  //using 3rd variable
	      //temp = x;
	      //  x = y;
	       // y = temp;
	      System.out.println("After Swapping without third variable\nx = "+x+"\ny = "+y);
	}

}
