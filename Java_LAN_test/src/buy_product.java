
public class buy_product 
{														//public=���}���Aprivate=�����}
	public static void main(String[] args)				//�{�����i�J�I�A�Y�n�i�J�{���o�O���n���A�����O��k�A�ӥB�@�w�n�ǤJ�r��B���^��
	{
		TCC_16_product aaa = new TCC_16_product();		//�إߦh�Ӱӫ~����
		TCC_16_product bbb = new TCC_16_product();
		
		aaa.name = "bottle";							//�]�w�ӫ~�W��
		aaa.ori_price = 80;								//�]�w�ӫ~����
		
		System.out.println(aaa.name);
		System.out.println("origin:"+aaa.getPrice());	//��ܭ쥻�]�w�馩�᪺�O��(�覡2)
		aaa.setDiscount(1);								//�S�O�ԥX�@�Ӥ�k�����]�w�s���
		aaa.print_product();							//��ܷs�馩�᪺�O��(�覡1)
		
		bbb.name = "flower";
		bbb.ori_price = 50;
		bbb.print_product();
		
		
	}
	
}
