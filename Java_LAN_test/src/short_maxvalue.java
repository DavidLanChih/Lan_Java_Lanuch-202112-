public class short_maxvalue
{
	public static void main(String[] args)
	{
		short x=0; 
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