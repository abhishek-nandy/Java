package javainterviewquestion;

public class RemoveJunkOrSpecialChars {

	public static void main(String[] args) {
		
        String actualString="a!@`dfdek";
		
		String result=RemoveJunkOrSpecialChars.reverseInputString(actualString);
		
		System.out.println("Actual String is : "+actualString);
		System.out.println("String after removing junk value is  :"+result);
	}
	

	public  static String reverseInputString(String actualString) {
		String  regex="[^a-zA-Z0-9]";
		return actualString.replaceAll(regex,"");
		}
}
