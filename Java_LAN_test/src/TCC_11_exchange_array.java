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
		System.out.println(B[0]);						//�H�W�T�꦳�N��Ӱ}�C�ܼƪ����e����
		
		bbb(A,C);										//�i�ݨ��kbbb�����T�꦳�NC�}�C���e����0
		System.out.println(C[0]);						//���ä��|�ܧ�즹�Ϫ�C�}�C���e
	}
	public static void bbb(int[] array1, int[] array2)	//�ѼơA�u�O�ƻs�W�z�ܼƪ��ȦA������B�z�A�ëD�ಾ�ܼƨ즹��k
	{
		array2 = new int[] {0};
		System.out.println(array2[0]);
	}
}