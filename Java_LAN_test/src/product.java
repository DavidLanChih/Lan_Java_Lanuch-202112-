public class product 
{
	public String name;
	public int ori_price;
	public int discount;
	
	public product()
	{
		name = "???" ;
		ori_price = 0 ;
		
	}
	public void print_product()
	{
		System.out.println("name: "+name+", price: $"+ori_price*discount/10);
	}
}
