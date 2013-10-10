public class BasicForLoopExample { 
   public static void main(String[] args) { 
   		/** 
		A for loops work in the following steps:
	
		0) Initializes the value of the variable that controls the loop's execution. In 
		this case, the variable is i and the initial value is 0.
		1) It then checks if the condition i < 10 is true.
		   If it is true, it proceeds to step 2. Else, it proceeds to step 5.
		2) It executes whatever is inside the braces of the for loop. In this case, it 
		is the statement System.out.println(i). There may be multiple things in the for loop,
		just like in Scratch. All will be executed.
		3) After execution, increment i using i++. i++ can also be replaced by i +=1
		4) Using this new i, go to 1.
		5) Exit the loop. In this case, this is done by entering the line which 
		System.out.println("hello")
   		**/
   		for(int i = 0; i < 10; i++){
			System.out.println(i);
		}
		System.out.println("hello");
	}

}