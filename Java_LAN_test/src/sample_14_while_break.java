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
				break;		   //int���̤j�ȦA+1�A�|�ܦ��̤j���t��
			}
		}
		x=x-1;				   //int�̤j���t�ȦA-1�A�N�|��_��int�̤j��
		System.out.println(x); 
	}
}