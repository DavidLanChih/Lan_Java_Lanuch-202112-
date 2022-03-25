
public class buy_product 
{
	public static void main(String[] args)   //程式的進入點，若要進入程式這是必要的，它不是方法，而且一定要傳入字串且不回傳，public=公開的，private=不公開
	{
		product aaa = new product();
		
		aaa.name = "bottle";
		aaa.ori_price = 10;
		aaa.discount = 9;
		aaa.print_product();
		
		
	}
	
}
