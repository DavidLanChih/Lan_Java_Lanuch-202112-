public class TCC_07_method
{
	public static void main(String[] args) 
	{
		int Number = 8;
		System.out.println(square(Number)); //�M�J��k1:�N�Ѽƿ�J�isquare��k�A�̫�A��println��ܥX��k�����G
		
		print("hi~");						//�M�J��k2:�Τ�k�N���쥻�A�ѼƤ��]�i���ܼ�
		String something = "hello";
		print(something);					
	}
	
	public static int square(int input)		//������k1: �]�w��k�W�٬����square�A�̭��i�H��J�Ѽ�(���w�Ʀr)
	{
		return input*input;					//�o�쪺�ѼơA�|�i��B��A�æ^��
	}
	
	public static void print(String name)	//������k2: �]�w��k�W�٬�print�A�̭��i�H��J�Ѽ�(���w��r)�Avoid�N���^��
	{
		System.out.println(name);			
	}
}