import java.util.Scanner;

public class	sample_05_Scanner
{
	public static void main(String[] args)
	{
		Scanner scanner= new Scanner(System.in);
		String word = scanner.nextLine();		//輸入文字用此方式
		int number = scanner.nextInt();			//輸入數字用此方式
		System.out.println(word);
		System.out.println(number);
		scanner.close();
	}
}