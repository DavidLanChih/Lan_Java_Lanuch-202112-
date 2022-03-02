public class long_maxvalue
{
	public static void main(String[] args)
	{
		long x=0; 
		boolean run = true;
		while(run)
		{
			x++;
			if(x<0)
			{
				run=false;
			}
		}
		x--;
		System.out.println(x);
	}
}