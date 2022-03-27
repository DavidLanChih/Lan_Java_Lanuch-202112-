
public class buy_product 
{														//public=公開的，private=不公開
	public static void main(String[] args)				//程式的進入點，若要進入程式這是必要的，它不是方法，而且一定要傳入字串且不回傳
	{
		TCC_16_product aaa = new TCC_16_product();		//建立多個商品物件
		TCC_16_product bbb = new TCC_16_product();
		
		aaa.name = "bottle";							//設定商品名稱
		aaa.ori_price = 80;								//設定商品價格
		
		System.out.println(aaa.name);
		System.out.println("origin:"+aaa.getPrice());	//顯示原本設定折扣後的費用(方式2)
		aaa.setDiscount(1);								//特別拉出一個方法給予設定新折數
		aaa.print_product();							//顯示新折扣後的費用(方式1)
		
		bbb.name = "flower";
		bbb.ori_price = 50;
		bbb.print_product();
		
		
	}
	
}
