public class TCC_12_15_class_static_method 
{
	public static void main(String[] args)
	{
		/*==============�ϥΰʺA�ܼƪ̡A�@�w�n���Ыت���~��ϥ�=============*/
		/*-----�R�A�B�ʺA�ܼƨϥΰϤ�-----*/
		//�ʺA�ܼ�
		student A = new student();						//�гystudent����A�éw�q���ܼƦW�١A��]�w��:student.java
		student B = new student();
		student C = new student();
		
		A.height = 1.0f;								//�i�N���P�Ȧs�b���Pstudent���󤺪��ܼ�
		A.weight = 30.0f;
		B.height = 1.2f;
		B.weight = 50.0f;
		C.height = 1.8f;
		C.weight = 70.0f;
		
		System.out.println(A.height);
		System.out.println(B.height);
		System.out.println(C.height);
		
		//�R�A�ܼ�
		student.x = 10;									//�s�Ȧb����@���R�A�ܼ�(�����гy�N�����ܼ�)
		
		/*-----�R�A�B�ʺA��k�ϥΰϤ�-----*/
		A.print();										//�ϥΰʺA��k
		student.s_print();								//�ϥ��R�A��k
		
		
		/*----------�p��BMI----------*/
		float BMI = A.weight/(A.height*A.height);		//�@��p��BMI
		System.out.println(BMI);			
		
		System.out.println(A.bmi());					//�M�Τ�k�p��BMI�A����ܥX��
		System.out.println(B.bmi());
		System.out.println(C.bmi());
		
				
		/*----------�C���]�w----------*/					//��]�w��:role.java
		role.num_role = 100 ;							//���h�֨���ƶq�n���R�A�ܼơA�]���L�k�߰ݥ���@�Ө����`�@���h�֨���
		
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
