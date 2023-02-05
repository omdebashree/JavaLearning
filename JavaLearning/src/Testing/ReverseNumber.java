package Testing;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 123456, Reverse = 0;
		while (number!= 0) {
			int reminder = number % 10 ;
			Reverse = Reverse*10 + reminder;
			number = number/10;
						
		}
		System.out.print("reverse the number " + Reverse);
	}

}
