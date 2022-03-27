import java.util.Scanner;
public class sample_08_if_else
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int price = input.nextInt();
		
		if (price < 100)
		{
			System.out.print("You can buy! It's so cheap!");
		}
		else if (price == 100)
		{
			System.out.print("The price is the same as market price!");
		}
		else
		{
			System.out.print("Don't buy! It's so expensive!");
		}
		
		input.close();
	}
}