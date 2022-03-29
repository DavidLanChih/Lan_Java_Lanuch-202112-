public class	sample_01_operator
{
	public static void main(String[] args)
	{
		int number=0;
		System.out.println(number);		//0
		
		number ++;
		System.out.println(number);		//0+1=1
		
		number += 1;
		System.out.println(number);		//1+1=2
		
		number -= 1;
		System.out.println(number);		//2-1=1
		
		float N2 = number;    			//盢俱计锣传Θ计	
			  N2 /= 10;					//1.0/10=0.1
		System.out.println(N2);
		
		N2 *= 50;						//0.1*50=5
		System.out.println(N2);
		
		N2 %= 2;              			
		System.out.println(N2);			//5/2=2.....1
		
		N2 %= 2.3;             			//緇计ぃъ0┮セ砆埃计:1
		System.out.println(N2);
		
		int a=1110;
		int b=2;
		int c=1110;
		int d=2;
		System.out.println(a<<=b);		// a = a << b  (1110 *2 *2)
		System.out.println(c>>=d);		// c = c >> d  (1110 /2 /2)
		
	}
}