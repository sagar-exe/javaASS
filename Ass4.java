import java.util.Scanner;
public class Ass4 {
    public static void main(String[] args)
    {
        int num;
        System.out.print("Input number of rows : ");
        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        int number = 1;
        System.out.println("Output: ");
        for (int row = 1; row <= num; row++)
        {
            for (int column = 1; column <= row; column++)
            {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }
}
