public class sample_14_while_break
{
	public static void main(String[] args)
	{
		int x=0; 
		while(true)
		{
			x++;
			if(x<0)
			{
				break;		   //int程+1穦跑Θ程璽
			}
		}
		x=x-1;				   //int程璽-1碞穦確Θint程
		System.out.println(x); 
	}
}