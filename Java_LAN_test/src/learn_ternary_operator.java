import java.util.Scanner;

public class learn_ternary_operator					//�T���B��l
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