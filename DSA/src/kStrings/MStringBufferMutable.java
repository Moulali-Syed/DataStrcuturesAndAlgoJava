package kStrings;

public class MStringBufferMutable {

	public static void main(String[] args) {
		//StringBuffer is mutable
		
		StringBuffer st= new StringBuffer("Apple");
		st.setCharAt(2, 'c');
		st.append("hi");
		
		System.out.println(st.length());
		
		System.out.println(st.replace(0, 3, "A"));//Alehi[replaces characters from 0 to 2nd index ]
	}
}

//StringBuffer doesnot store string in stringpool
