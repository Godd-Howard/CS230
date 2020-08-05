/**
 * By: Kurtis Yoder
 * 
 * This program asks the user for a string of text, then program 
 * will output that string of text in reverse.
 * The program will continuously ask for strings to reverse
 * until the user decides to opt out. 
 * 
 */


import java.util.Scanner;
import ch02.stacks.ArrayBoundedStack;

public class ReverseTextStack 
{
    public static void main(String[] args)
    {
    	//Inform user
    	System.out.println("This program reverses a string of text entered "
    			+ "by you.");
    	System.out.println("The program will continuously prompt you "
    			+ "for a new string to reverse until you decide to quit by "
    			+ "entering the upper case letter \"X\".");
    	//Prompt user for string
    	System.out.println("Please enter a string.");	
    	//Get the string from the user
    	Scanner keyboard = new Scanner(System.in);
	    String userStr;
	    userStr = keyboard.nextLine();
	    int stringSize = userStr.length();
	    
	    /*
	     * Verify they want to use program and loop until otherwise
	     * 
	     * Also, since the program directions were not specific as to
	     * whether or not the program has to run at least one time,
	     * I'm allowing the user to break out out of the program
	     * with the first input received.
	     */
	    
    	while(!userStr.equals("X"))
    	{
	        //Create stack for char
	        ArrayBoundedStack<Character> chStack = 
	        		new ArrayBoundedStack<Character>(stringSize);
	        
	        //Change string to characters
	        char[] ch = userStr.toCharArray();
	        
	        //Push characters into stack
	        for (int i = 0; i < userStr.length(); i++)
	        {
	            chStack.push(ch[i]);
	        }
	        
	       
	       int index = 0;
	        /*
	         * Pop characters until stack is empty while getting characters 
	         * off the top of the stack the reverse string
	         */
	        while (!chStack.isEmpty())
	        {

	            ch[index] = chStack.top();
	            chStack.pop();
	            index++;
	        }
	        
	       //Turn character array into string
	       String theHolyString = new String(ch);
	       //The string displayed to the user
	       theHolyStringDisplay(theHolyString);
	       
	       //Create gap
	       System.out.println();
	       
	       //Ask user for string again and read it in
	       System.out.println("Please enter a string.");
	       keyboard = new Scanner(System.in);
	       userStr = keyboard.nextLine();
	       stringSize = userStr.length();
        
    	}
    	
        
        keyboard.close();
    
    /**
     * Method that displays the reverse of the string
     * originally entered.
     * @param str The reversed string from the original sting input
     * received from the user.
     */
    	
    }
    
    public static void theHolyStringDisplay(String str)
    {
    	System.out.println(str);
    }
    
}