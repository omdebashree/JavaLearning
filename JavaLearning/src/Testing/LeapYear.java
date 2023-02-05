package Testing;

public class LeapYear {

	public static void main(String[] args) {
		//The Year should be divisible by 4
		//and The year should not be divisible by 100.
		//or The year should be divisible by 400.
		
		int year = 1900;
		if ((year%4==0 && year%100!= 0) || (year%400==0)) {
			System.out.println("The year is a leap year:"+ year);
		} else {
			System.out.println("The year is not a  leap year:"+ year);
		}

	}

}
