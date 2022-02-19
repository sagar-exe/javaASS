import java.util.Scanner;
//import java.StringFormat;
public class Ass1{
	public static void main(String args[]){
		String binary="";
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Decimal number");
		int decimal=s.nextInt();
		int original=decimal;
		while(decimal!=0){
		binary+=decimal%2;
		decimal/=2;	
		}
		
		//System.out.println((binary)); 
	
		  
		//System.out.println(Integer.toBinaryString(original));
		//OR 
		System.out.println(Reverse.reverseString(binary));   
  
	}
}
    
