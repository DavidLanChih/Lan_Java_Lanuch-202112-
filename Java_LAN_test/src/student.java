public class student 								//定義物件
{
	//靜態變數(只能單一被使用在student.x這個變數)
	public static int x;							//不屬於物件，而屬於class本身
	
	//動態變數(又稱:成員變數，可以被多個物件使用)
	public float weight;							//定義物件的變數
	public float height;
	
	public student()								//創造建構子，名字必須與class的名字一樣
	{
		System.out.println("student created");		//當有其他物件使用此物件時，執行此段程式
	}
	
	public void print()								//非靜態的方法
	{
		System.out.println("print data");
	}
	
	public static void s_print()					//靜態的方法
	{
		System.out.println("S_print");
	}
	
	public float bmi()								//計算BMI的方法
	{
		return weight / (height * height ) ;
	}
	
}
