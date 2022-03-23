public class TCC_11_exchange_array
{
	public static void main(String[] args)
	{
		int [] A = {0} ;
		int [] B = {100} ;
		int [] C = {50} ;
		int [] temp ;
		
		temp = A ; 
		A = B ;
		B = temp ;
		
		System.out.println(A[0]); 
		System.out.println(B[0]);						//以上確實有將兩個陣列變數的內容互換
		
		bbb(A,C);										//可看到方法bbb內部確實有將C陣列內容換成0
		System.out.println(C[0]);						//但並不會變更到此區的C陣列內容
	}
	public static void bbb(int[] array1, int[] array2)	//參數，只是複製上述變數的值再做後續處理，並非轉移變數到此方法
	{
		array2 = new int[] {0};
		System.out.println(array2[0]);
	}
}