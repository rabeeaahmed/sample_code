public class MediumForLoop { 
   public static void main(String[] args) { 
   		/** 
   		We can also create a new variable which is in the scope of main
   		and have that keep track of the value of i.
   		
   		This way, when we exit the for loop, we will have the last value of i, which is
   		9, still stored in the value of x. We can then print this
   		**/
   		int x = 500;
   		for(int i = 0; i < 10; i++){
			System.out.println("hello");
			x = i;
		}
		System.out.println(x);
	}

}