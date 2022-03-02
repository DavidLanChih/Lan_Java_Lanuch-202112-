public class int_minvalue
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
		System.out.println(x);
	}
}