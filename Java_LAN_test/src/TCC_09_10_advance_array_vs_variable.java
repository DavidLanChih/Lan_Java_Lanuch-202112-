public class TCC_09_10_advance_array_vs_variable
{
	public static void main(String[] args) 
    {
        int [] array_A = {10,20,30};    //設定陣列A的標籤
        int [] array_B = array_A ;      //設定陣列B與陣列A的標籤位置一樣
        array_B[1] = 5 ;                //直接幫第二個陣列的值換成5
        System.out.println(array_A[1]);
        
        
        int Num_1 = 100 ;               //以下兩個範例: 若為一般變數，則無法替換
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