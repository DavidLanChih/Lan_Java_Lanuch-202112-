import java.util.Scanner;
public class sample_12_switch_case
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int i_num = input.nextInt();
		switch(i_num)
		{
			case 1:
			{
				System.out.println("�o�O1");
				break; 		//�Y���[break�|�y���᭱�����|��ܥX��
			}
			case 2:
			{
				System.out.println("�o�O2");
				break;
			}
			case 3:
			{
				System.out.println("�o�O3");
				break;
			}
		}
		input.close();
		
	}
}