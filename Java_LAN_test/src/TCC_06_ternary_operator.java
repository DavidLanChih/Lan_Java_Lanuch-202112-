import java.util.Scanner;

public class TCC_06_ternary_operator
{
	public static void main(String[] Args)
	{
		Scanner scanner = new Scanner(System.in);
		String Answer;
		while(true)
		{
			int Num = scanner.nextInt();
			Answer = Num % 2 == 0? "even":"odd" ;   //�YNum���H2�����ƫh���even,�_�h��odd
			System.out.println(Answer);
			if (Num==1)
			{
				break;
			}
		}
		scanner.close();
	}
}