import java.util.Scanner;
public class sample_09_scissor_stone_paper
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String result = input.nextLine();
		
		if (result.equals("scissor"))
		{
			System.out.println("you chosse scissor!");
			System.out.println("computer chosse stone!");
		}
		else if (result.equals("stone"))
		{
			System.out.println("you chosse stone!");
			System.out.println("computer chosse paper!");
		}
		else if (result.equals("paper"))
		{
			System.out.println("you chosse paper!");
			System.out.println("computer chosse scissor!");
		}
		else
		{
			System.out.println("you don't chosse option!");
		}
		
		input.close();
	}
}