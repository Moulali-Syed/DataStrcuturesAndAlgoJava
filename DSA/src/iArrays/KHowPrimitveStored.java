package iArrays;

public class KHowPrimitveStored {

	public static void main(String[] args) {
		int i = 10;
		increment(i);
		System.out.println(i);//10
	}

	public static void increment(int i) {
		i++;//here it will increment to 11
		
		
		//the i in main and i in increment both are stored in 2 different memory locations
		//the increment of i here doesnot reflect in main
	}
}
