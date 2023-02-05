package Testing;

public class DataTypeExample {
	public static void main(String[] args) {
	// Variable type
		/* byte-1byte, short-2byte,int-4byte, --> number
		 * long-8byte, float-4byte, double-decimal-8byte, char-2byte,
		 *  boolean--true or false
		 * */
	byte b =127;
	short s = 3245;
	int i = 234567;
	long l = 122000034567890L;
	float f = 123.098f;
	double d = 123.098;
	boolean b1 = true;
	char c = 'T';
	var x = 10;
	var y = 11;
	String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	System.out.println("The length of the txt string is: " + txt.length());
	System.out.println("Upper case:"+ txt.toUpperCase());
	System.out.println("Lower case:"+ txt.toLowerCase());
	
	String txt1 = "Please locate where occurs!";
	System.out.println(txt1.indexOf("occurs"));
	System.out.println("square root of "  +  Math.sqrt(b));
	int randomNum = (int)(Math.random() * 101);  // 0 to 100
	System.out.println(randomNum);
	
	}
}
