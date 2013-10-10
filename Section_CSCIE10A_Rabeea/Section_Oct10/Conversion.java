public class Conversion { 
   public static void main(String[] args) { 
   		/**
   		NOTE: 
   		
   		1) 
   		5/9 is evaluated to 0 and 10/9 is evaluated to 1
   		This is because integer division in Java only returns the value before the decimal
   		To return the full value, use a decimal when specifying the division:
   			ie 5.0/9, 5/9.0 and 5.0/9.0 will return the correct result 
   		
   		2) 
   		Use parenthesis generously. The computer might not evaluate things in the
   		same sequence you would in your head. 
   			ie for "2.0/3.0 * 5.0, do you mean (2.0/3.0) * 5.0 or (2.0/(3.0 * 5.0))?
   			
   		**/
    	int value = 5;
    	System.out.println(((2.0/3) * value) - 5);
   }
}
