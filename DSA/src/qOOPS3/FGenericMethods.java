package qOOPS3;
/*
We can make our methods as generic as well

say i want to print an array of integers

	
	public static void printArr(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	
	But now i want to print array of any type - char, double,String
	
	we can create a generic
	
		public static<T> void printArr(T arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
 */
public class FGenericMethods {
	
	public static void printArr(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static<T> void printArr1(T arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	//generic bound using a class, all classes that extends Flights can be used
	public static<T extends Flights> void printArr2(T arr[]) {
		for(int i=0;i<arr.length;i++) {
			arr[i].print();
		}
	}
	
	//generic bound using an interface, still we use extends keyword only
	public static<T extends PrintInterface> void printArr3(T arr[]) {
		for(int i=0;i<arr.length;i++) {
			arr[i].print();
		}
	}
	
	public static void main(String[] args) {
		Integer a[] = new Integer[10];
		for(int i=0;i<10;i++) {
			a[i] = i+1;
		}
		printArr1(a);
		
		String s[] = new String[10];
		for(int i=0;i<10;i++) {
			s[i] = "abc";
		}
		printArr1(s);
		
		//lets create a array of class Flights
		Flights f[] = new Flights[10];
		for(int i=0;i<10;i++) {
			f[i] = new Flights(20*(i+1));
		}
		printArr1(f);
		//gives flight address
		//qOOPS3.Flights@cac736f qOOPS3.Flights@5e265ba4 qOOPS3.Flights@156643d4 qOOPS3.Flights@123a439b qOOPS3.Flights@7de26db8 qOOPS3.Flights@1175e2db qOOPS3.Flights@36aa7bc2 qOOPS3.Flights@76ccd017 qOOPS3.Flights@182decdb qOOPS3.Flights@26f0a63f 
		//when i trying to print , its giving address which is of no use to me 
		//we can actually bound the generic method , which type is accepted
		/*
		 public static<T extends Flights> void printArr2(T arr[]) {
		for(int i=0;i<arr.length;i++) {
			arr[i].print();
		}
	}
		 */
		
		//what if i want some other class , which also has the print function , then i can 
		//create a interface
	}

}
