public class TCC_02_while_break
{
	public static void main(String[] args)
	{
		int x=0; 
		while(true)
		{
			x++;
			if(x<0)
			{
				break;			//���X�j��(�����j��)
			}
		}
		x--;
		System.out.println(x);
	}
}