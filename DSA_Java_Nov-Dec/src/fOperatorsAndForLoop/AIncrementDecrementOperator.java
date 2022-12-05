package fOperatorsAndForLoop;

/*

Post Increment - a++

Pre Increment - ++a

Post Decrement - a--

pre Decrement - --a
 */
public class AIncrementDecrementOperator {

	public static void main(String[] args) {
		int a = 60;
		
		System.out.println(a++);//60
		int b = 60;
		System.out.println(++b);//61
		
		int c = 60;
		System.out.println(c--);//60
		
		int d = 60;
		System.out.println(--d);//59
	}
}


/*
&& - uses short circuting

say if(a>60 && b>80) ---> if a>60 evaluates to false , then it will not check for whether
b is > 80 or not
*/