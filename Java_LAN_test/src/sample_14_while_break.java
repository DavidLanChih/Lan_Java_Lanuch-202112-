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
				break;		   //int的最大值再+1，會變成最大的負值
			}
		}
		x=x-1;				   //int最大的負值再-1，就會恢復成int最大值
		System.out.println(x); 
	}
}