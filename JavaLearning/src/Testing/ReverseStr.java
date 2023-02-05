package Testing;

public class ReverseStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ajdshasbhd jadhjasb jasdbjabsx";
        char chars[] = str.toCharArray(); 
        System.out.print( "string length" + (chars.length-1));// converted to character array and printed in reverse order
        for(int i= chars.length-1; i>=0; i--) {
            System.out.print(chars[i]);
            
        }
	}

}
