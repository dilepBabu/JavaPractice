// import java.util.ArrayList;

// public class ArrayListss {
//     public static void main(String[] args) {
//         ArrayList al=new ArrayList();
//         al.add("1");
//         al.add("2");
//         al.add("3");
//         al.add("4");
//         al.add("5");
//         al.add("6");
//         al.add("7");
//         al.add("8");
//         al.add("9");
//         al.add("10");
//         al.add("11");
//         al.
//         // al.add("1");
//         System.out.println(al.size());
//         System.out.println(al);

//     }
    
// }
import java.util.*; 

public class Arr { 
	public static void main(String[] argv) 
		throws Exception 
	{ 

		try { 

			// Creating object of ArrayList<Integer> 
			ArrayList<Integer> 
				arrlist = new ArrayList<Integer>(); 

			// adding element to arrlist 
			arrlist.add(10); 
			arrlist.add(20); 
			arrlist.add(30); 
			arrlist.add(40); 

			// Print the ArrayList 
			System.out.println("ArrayList: "
							+ arrlist); 

			// ensure that the ArrayList 
			// can hold upto 5000 elements 
			// using ensureCapacity() method 
			arrlist.ensureCapacity(0); 

			// Print 
			System.out.println("ArrayList can now"
							+ " surely store upto"
							+ " 5000 elements."); 
		} 

		catch (NullPointerException e) { 
			System.out.println("Exception thrown : " + e); 
		} 
	} 
} 
