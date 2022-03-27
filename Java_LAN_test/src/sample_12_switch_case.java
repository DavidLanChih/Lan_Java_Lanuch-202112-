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
				System.out.println("這是1");
				break; 		//若不加break會造成後面的都會顯示出來
			}
			case 2:
			{
				System.out.println("這是2");
				break;
			}
			case 3:
			{
				System.out.println("這是3");
				break;
			}
		}
		input.close();
		
	}
}