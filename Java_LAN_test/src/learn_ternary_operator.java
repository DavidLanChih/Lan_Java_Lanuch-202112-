import java.util.Scanner;

public class learn_ternary_operator					//三元運算子
{
	public static void main(String[] Args)
	{
		Scanner scanner = new Scanner(System.in);
		String Answer;
		while(true)
		{
			int Num = scanner.nextInt();
			Answer = Num % 2 == 0? "even":"odd" ;   //若Num除以2為偶數則顯示even,否則為odd
			System.out.println(Answer);
			if (Num==1)
			{
				break;
			}
		}
		scanner.close();
	}
}