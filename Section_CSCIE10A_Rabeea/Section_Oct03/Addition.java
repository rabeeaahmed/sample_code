public class Addition { 
   public static void main(String[] args) { 
       forloop();
       System.out.println("The sum of 3 and 5 is: ");
       int sum = add(3, 5);
       System.out.println(sum);
       System.out.println("That is all!");
   }
   public static void say_hello() {
   		System.out.println("Hello, World");
        System.out.println("This place ");
        System.out.print("smells ");
        System.out.println(" so good!!");
	}
	public static void forloop() {
	  int x = 5;
      for(int i = 0; i <= 10; i = i+1) {
         x = 5 + i;
        System.out.println(x);
    	}
    }
    
    public static int add(int x, int y) {
    	return (x + y);
	}
}

