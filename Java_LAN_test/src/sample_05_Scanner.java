import java.util.Scanner;

public class	sample_05_Scanner
{
	public static void main(String[] args)
	{
		Scanner scanner= new Scanner(System.in);
		String word = scanner.nextLine();
		System.out.print(word);
		scanner.close();
	}
}