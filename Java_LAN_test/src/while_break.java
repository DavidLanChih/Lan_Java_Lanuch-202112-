public class while_break
{
	public static void main(String[] args)
	{
		int x=0; 
		while(true)
		{
			x++;
			if(x<0)
			{
				break;
			}
		}
		x--;
		System.out.println(x);
	}
}