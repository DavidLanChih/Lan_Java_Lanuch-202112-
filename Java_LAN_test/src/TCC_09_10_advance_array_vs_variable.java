public class TCC_09_10_advance_array_vs_variable
{
	public static void main(String[] args) 
    {
        int [] array_A = {10,20,30};    //�]�w�}�CA������
        int [] array_B = array_A ;      //�]�w�}�CB�P�}�CA�����Ҧ�m�@��
        array_B[1] = 5 ;                //�������ĤG�Ӱ}�C���ȴ���5
        System.out.println(array_A[1]);
        
        
        int Num_1 = 100 ;               //�H�U��ӽd��: �Y���@���ܼơA�h�L�k����
        int Num_2 = Num_1 ;
        Num_2 = 10 ;
        System.out.println(Num_1);
        
        int A = 0 ;
        aaa(A);
        System.out.println(A);
    }

    public static void aaa(int input)
    {
        input = 10 ;
    }
}