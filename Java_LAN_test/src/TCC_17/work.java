package TCC_17;

import TCC_17.other.test;

public class work {
	public static void main(String[] args)	{
		System.out.println(TCC_17.animal.test.x);			//使用FQN(完全符合名稱，就不用到import)	*有名稱衝突時才用
		System.out.println(TCC_17.vechile.test.x);			//使用FQN(完全符合名稱，就不用到import)
		System.out.println(test.x);							//使用import抓到裡面變數				*沒有名稱衝突用此，看的比較不亂
	}
}
