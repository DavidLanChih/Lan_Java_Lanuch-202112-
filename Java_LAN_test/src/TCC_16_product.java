public class TCC_16_product 						//����ʸ�:���ܼ��ð_�ӡA�z�Ѧb���o���ܼƦ��ǭn�D
{
	public String name;
	public int ori_price;
	public int number;								//public�ܼƥi�Q��Ljava�ϥγ]�w
	private int discount;							//private�ܼƥu�����b�o�ح��]�w

	public TCC_16_product()							//�]�w���󵲺c(�غc�l)
	{
		name = "???" ;
		ori_price = 0 ;
		discount = 5; 								//����]�w (�Ϥ@��H����h�q��L��m��]�w)
	}
	
	public float getPrice()
	{
		return ori_price*discount/10;
	}
	
	public float setDiscount(int inputDiscount)		//�j��~���{���ק鷺���ܼƪ���k
	{
		return discount=inputDiscount;
	}
	
	public void print_product()
	{						
		System.out.println("name: "+name+", price: $"+ori_price*discount/10);
	}
	
	
}
