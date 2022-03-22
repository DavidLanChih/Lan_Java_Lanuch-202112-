public class TCC_08_method_prime_number
{
	public static void main(String[] Args) 
	{
		int Limit = 100;
		for (int a=2; a<Limit; a++)				//輸入數字的範圍
		{
			if (isPrime(a))						//套入方法:如果輸入的值為值數，就會回傳true
			{
				System.out.print(a+", ");		//顯示輸入的值
			}
		}
	}
	
	public static boolean isPrime(int Number)	
	{
		for (int i=2; i<Number; i++)
		{
			if (Number % i == 0)				//輸入數字除以比自己小的數字，若可以整除則代表非質數，並回傳false
			{
				return false;
			}
		}
		return true;							//若為值數則返回true
	}
}