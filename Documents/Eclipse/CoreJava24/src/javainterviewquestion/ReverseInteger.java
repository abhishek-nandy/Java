package javainterviewquestion;

public class ReverseInteger {

	public static void main(String[] args) {
		int num=1234;
		
		System.out.println("The reverse of integer "+num+" is "+ReverseInteger.reverseInt(num));

	}
	
	public static int reverseInt(int num) {
		int reverseNum=0;
		while(num!=0) {
			int x=num%10;
			reverseNum=reverseNum*10+x;
			num=num/10;
		}
		return reverseNum;
	}

}
