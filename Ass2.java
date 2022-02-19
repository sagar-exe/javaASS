import java.util.Scanner;
public class Ass2{
	
	public static void main(String args[]){
		
		  Scanner i = new Scanner(System.in);
            System.out.print("Input the first number : ");
            int a = i.nextInt();
            System.out.print("Input the second number: ");
            int b = i.nextInt();
            System.out.println("Result: "+result(a, b));
        }
        public static int result(int x, int y)
        {
            if(x == y)
                return 0;
            if(x % 7 == y % 7)
                return (x < y) ? x : y;
            return (x > y) ? x : y;
        }
    

	}

