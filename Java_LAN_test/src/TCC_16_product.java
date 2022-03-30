public class TCC_16_product 						//物件封裝:把變數藏起來，理由在於對這些變數有些要求
{
	public String name;
	public int ori_price;
	public int number;								//public變數可被其他java使用設定
	private int discount;							//private變數只接受在這裏面設定

	public TCC_16_product()							//設定物件結構(建構子)
	{
		name = "???" ;
		ori_price = 0 ;
		discount = 5; 								//打折設定 (使一般人不能去從其他位置改設定)
	}
	
	public float getPrice()
	{
		return ori_price*discount/10;
	}
	
	public float setDiscount(int inputDiscount)		//強制給外部程式修改內部變數的方法
	{
		return discount=inputDiscount;
	}
	
	public void print_product()
	{						
		System.out.println("name: "+name+", price: $"+ori_price*discount/10);
	}
	
	
}
