public class ForLoopExample { 
   public static void main(String[] args) { 
   		/** 
   		Pulling out the initialization 'int i' from the for loop
   		allows us to reference the variable, i, outside the for loop
   		**/
   		int i;
		for(i = 0; i < 10; i++){
			System.out.println("hello");
		}
		System.out.println(i);
	}

}