import java.util.Scanner;
public class sample_11_random
{
	public static void main(String[] args)
	{
		//System.out.print(Math.random());      //random為0-1的數值
		float number = (float)Math.random(); 	//random比float更精準，所以可先轉成float輸出
		number *= 100;
		int i_num= (int)number; 			 	//小數轉成整數
		//System.out.print(i_num);           	//電腦抓到的數字
		
		Scanner input = new Scanner(System.in);
		
		while(true)                          	//使用while來無限輸入
		{
			int i_key = input.nextInt();     	//注意輸入型態須給正確的next型態
			
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