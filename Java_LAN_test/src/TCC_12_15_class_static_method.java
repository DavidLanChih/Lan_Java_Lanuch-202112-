public class TCC_12_15_class_static_method 
{
	public static void main(String[] args)
	{
		/*==============使用動態變數者，一定要先創建物件才能使用=============*/
		/*-----靜態、動態變數使用區分-----*/
		//動態變數
		student A = new student();						//創造student物件，並定義此變數名稱，原設定於:student.java
		student B = new student();
		student C = new student();
		
		A.height = 1.0f;								//可將不同值存在不同student物件內的變數
		A.weight = 30.0f;
		B.height = 1.2f;
		B.weight = 50.0f;
		C.height = 1.8f;
		C.weight = 70.0f;
		
		System.out.println(A.height);
		System.out.println(B.height);
		System.out.println(C.height);
		
		//靜態變數
		student.x = 10;									//存值在此單一種靜態變數(不須創造就有此變數)
		
		/*-----靜態、動態方法使用區分-----*/
		A.print();										//使用動態方法
		student.s_print();								//使用靜態方法
		
		
		/*----------計算BMI----------*/
		float BMI = A.weight/(A.height*A.height);		//一般計算BMI
		System.out.println(BMI);			
		
		System.out.println(A.bmi());					//套用方法計算BMI，並顯示出來
		System.out.println(B.bmi());
		System.out.println(C.bmi());
		
				
		/*----------遊戲設定----------*/					//原設定於:role.java
		role.num_role = 100 ;							//有多少角色數量要用靜態變數，因為無法詢問任何一個角色總共有多少角色
		
		role dog = new role();
		dog.ID = 2;
		dog.HP = 100;
		dog.DAMAGE = 20;
		
		role fire = new role();
		fire.ID = 1;
		fire.HP = 10;
		fire.DAMAGE = 100;
	}
}
