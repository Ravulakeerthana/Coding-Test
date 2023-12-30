package Mock.anp.interview;

import java.util.Scanner;

public class Exception_Test {

	public static void main(String[] args) throws StringIndexOutOfBoundsException {
	
			        Scanner scanner = new Scanner(System.in);
			        System.out.print("Enter a string: ");
			        String s = scanner.nextLine();
			      //  s= null;
			         s = " " ;
			        
			        try {
			        	
			            String reversed = reverseString(s);
			            System.out.println("Reversed string: " + reversed);
			            
			        } catch (Exception e) {
			            System.out.println(" errors occured: " + e.getMessage());
			        	
			        }
			    
			        }
	

			    public static String reverseString(String s) {
			        if (s == null) {
			            throw new NullPointerException("s string cannot be null.");
			     
			        }
			        
			        StringBuilder reversed = new StringBuilder();
			        
			        for (int i = s.length() - 1; i >= 0; i--) {
			            reversed.append(s.charAt(i));
			        }
			        return reversed.toString();
			    

	}


}

