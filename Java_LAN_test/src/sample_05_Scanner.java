import java.util.Scanner;

public class	sample_05_Scanner
{
	public static void main(String[] args)
	{
		Scanner scanner= new Scanner(System.in);
		String word = scanner.nextLine();		//��J��r�Φ��覡
		int number = scanner.nextInt();			//��J�Ʀr�Φ��覡
		System.out.println(word);
		System.out.println(number);
		scanner.close();
	}
}