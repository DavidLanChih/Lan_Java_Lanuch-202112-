package TCC_18;

public class NumYo 
{
	private long number;
	
	/*-----------�غc�l����-----------*/
	public NumYo(long input) 
	{
		number = input ;
	} 
	public NumYo(float  input) 
	{
		number = (long)input ;
	} 
	public NumYo(String input) 
	{
		number = Long.valueOf(input) ;
	} 
	
	
	/*-----------��k����------------*/		//�Τ@�˪��W�r(�̭��ܼƫ��A���@�ˡAJAVA�|�۰ʧP�_�̾A�X�����A�i��ϥ�)
	public void set(long input) 
	{
		number = input ;
	}
	public void set(float input) 
	{
		number = (long)input ;				//�p���ܦ���ơA�|�L����˥h�p��
	}
	public void set(String input) 
	{
		number = Long.valueOf(input); 		//�N�r���ܬ����
	}
	
	// �����]�i�H���R�A��k������
	// **���O!����Hreturn��k������**
	
	public void print()
	{
		System.out.println(number);
	}
}
