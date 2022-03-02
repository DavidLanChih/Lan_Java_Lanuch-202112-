public class int_maxvalue
{
	public static void main(String[] args)
	{
		int x=0; 
		boolean run = true;
		while(run)
		{
			x++;
			if(x<0)
			{
				run=false;
			}
		}
		x=x-1;
		System.out.println(x);
	}
}