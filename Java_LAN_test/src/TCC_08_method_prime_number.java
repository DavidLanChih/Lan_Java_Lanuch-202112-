public class TCC_08_method_prime_number
{
	public static void main(String[] Args) 
	{
		int Limit = 100;
		for (int a=2; a<Limit; a++)				//��J�Ʀr���d��
		{
			if (isPrime(a))						//�M�J��k:�p�G��J���Ȭ��ȼơA�N�|�^��true
			{
				System.out.print(a+", ");		//��ܿ�J����
			}
		}
	}
	
	public static boolean isPrime(int Number)	
	{
		for (int i=2; i<Number; i++)
		{
			if (Number % i == 0)				//��J�Ʀr���H��ۤv�p���Ʀr�A�Y�i�H�㰣�h�N��D��ơA�æ^��false
			{
				return false;
			}
		}
		return true;							//�Y���ȼƫh��^true
	}
}