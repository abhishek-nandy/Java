package javainterviewquestion;

public class ReverseString {

	public static void main(String[] args) {
		
		String actualString="abhishek";
		
		//Calling the reverse method and printing the result 
		String result=ReverseString.reverseInputString(actualString);
		
		
		System.out.println("Actual String is : "+actualString);
		System.out.println("Reverse String is : "+result);

		
//      Logic or Rough Code		
//		for (int i=actualString.length()-1;i>=0;i--) {
//			//System.out.println(i);
//			char ch = actualString.charAt(i);
		
//			// First way
//			//reverseString=reverseString+ch;
		
//			// Second way
//			reverseString=reverseString+String.valueOf(ch);

		
	}
	
	// Method to reverse the string 
	public  static String reverseInputString(String actualString) {
		String reverseString="";
		for (int i=actualString.length()-1;i>=0;i--) {
			char ch = actualString.charAt(i);
			reverseString=reverseString+String.valueOf(ch);
		}
		return reverseString;	
	}
}
