public class Printing { 
   public static void main(String[] args) { 
		for(int i = 0; i < 10; i++){
		/** We must pass the value of i to the printing function if
		we want it to do anything with it **/
			printing(i);
		}
   }

	/** Once we passed the variable i, the printing function refers to that value as x.
   Therefore, anything the printing function does (such as printing the variable) must be 
   done to the variable x and not the variable i. Another way to think about it is that 
   printing renames the variable to x and then forgets what it was named previously.**/
   
   public static void printing(int x) {
       System.out.println(x);
   	}
}