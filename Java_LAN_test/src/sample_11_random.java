import java.util.Scanner;
public class sample_11_random
{
	public static void main(String[] args)
	{
		//System.out.print(Math.random());      //random��0-1���ƭ�
		float number = (float)Math.random(); 	//random��float���ǡA�ҥH�i���নfloat��X
		number *= 100;
		int i_num= (int)number; 			 	//�p���ন���
		//System.out.print(i_num);           	//�q����쪺�Ʀr
		
		Scanner input = new Scanner(System.in);
		
		while(true)                          	//�ϥ�while�ӵL����J
		{
			int i_key = input.nextInt();     	//�`�N��J���A�������T��next���A
			
			if (i_key == i_num)
			{
				System.out.println("Congratulation~ You are Bingo!");
				break;
			}
			else if (i_key < i_num)
			{
				System.out.println("too small~");
			}
			else if (i_key > i_num)
			{
				System.out.println("too large~");
			}
		}
		input.close();
		
		
		
	}
}