public class sample_10_increment_factorial
{
	public static void main(String[] args)
	{
		/*--------²Ö¥[»¼¼W--------*/
		int num_0 	= 	0,
			i		=	1;
		while(i<=5)               			// num_0=0+1+1+1+1+1
		{
			num_0 += 1;
			i++;
		}
		System.out.println(num_0);
			
		int num_1 	= 	0,
			j		=	0;
		while(j<=5)               			// num_1=0+1+2+3+4+5
		{
			num_1 += j;
			j++;
		}
		System.out.println(num_1);
		
		/*---------¶¥­¼----------*/ 			// num_2=1*2*3*4*5
		int num_2 	= 	1,
			k		=	1;
		while(k<=5)
		{
			num_2 *= k;
			k++;
		}
		System.out.println(num_2);
	}
}