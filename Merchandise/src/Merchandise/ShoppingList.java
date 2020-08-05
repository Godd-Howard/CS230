package Merchandise;
import java.util.Scanner;
import ch06.lists.SortedABList;

/**
 * Program by Kurtis Yoder
 * 
 * This program is used to display a selection
 * of operations for a user to use on a list
 * of merchandise items
 */

public class ShoppingList {

	public static void main(String[] args) {
		
		String nameStr, priceStr;
		double priceDub;
		boolean foundItem, flag1, flag2;
		
		System.out.println("This program creates a list of merchandise"
				+ " with the name and price of each item in the list");
    	System.out.println("A list of options for creating and updating"
    			+ " the list will now be given to you.\n");
    	System.out.println("If you wish to quit this program,"
    			+ " just enter in a number other than the options"
    			+ " displayed when prompted for a number.");
    	
    	SortedABList<Merchandise> merchList = new SortedABList<Merchandise>();
    	menu();
    	Scanner keyboard = new Scanner(System.in);
    	String userChoice;
	    userChoice = keyboard.nextLine();
	    
	    while (userChoice.equals("1") || userChoice.equals("2") ||
	    		userChoice.equals("3") || userChoice.equals("4") ||
	    		userChoice.equals("5"))
	    {
	    	switch(userChoice) {
	    	case "1":
	    		System.out.println("Enter the name of the merchandise"
	    				+ " you wish to add");
	    		keyboard = new Scanner(System.in);
	    	    nameStr = keyboard.nextLine();
	    	    System.out.println("Enter the price corresponding"
	    	    		+ " to the name of the merchandise"
	    	    		+ " you wish to add");
	    	    priceStr = keyboard.nextLine();
	    	    flag1 = isDoubleAndAboveZero(priceStr);
	    	    while(flag1 == false)
	    	    {
	    	    	System.out.println("The price entered must be a "
	    	    			+ "number and above zero\n"
	    	    			+ "Please enter a new price");
	    	    	priceStr = keyboard.nextLine();
	    	    	flag1 = isDoubleAndAboveZero(priceStr);
	    	    }
	    	    priceDub = Double.parseDouble(priceStr);
	    	    Merchandise randMerch = new Merchandise(nameStr, priceDub);
	    	    merchList.add(randMerch);
	    	    System.out.println(randMerch.toString() + " was added to the"
	    	    		+ " list");
	    		break;
	    		
	    	case "2":
	    		if(merchList.size() == 0)
	    		{
	    			System.out.println("There are no items in the list "
	    					+ "so there is nothing to remove!");
	    			break;
	    		}
	    		System.out.println("Enter the name of the merchandise"
	    				+ " you wish to remove");
	    		nameStr = keyboard.nextLine();
	    	    System.out.println("Enter the price corresponding"
	    	    		+ " to the name of the merchandise"
	    	    		+ " you wish to remove");
	    	    priceStr = keyboard.nextLine();
	    	    flag2 = isDoubleAndAboveZero(priceStr);
	    	    while(flag2 == false)
	    	    {
	    	    	System.out.println("The price entered must be a "
	    	    			+ "number and above zero. Make sure "
	    	    			+ "not to include $ or any commas "
	    	    			+ "as the list will appear as "
	    	    			+ "having them. Just enter the "
	    	    			+ "price non-formatted.\n"
	    	    			+ "Please enter a new price"
	    	    			+ " that could possibly be in the list");
	    	    	priceStr = keyboard.nextLine();
	    	    	flag2 = isDoubleAndAboveZero(priceStr);
	    	    }
	    	    priceDub = Double.parseDouble(priceStr);
	    	    randMerch = new Merchandise(nameStr, priceDub);
	    	    randMerch = merchList.get(randMerch);
	    	    if(randMerch == null)
	    	    	System.out.println("The item of merchandise indicated"
	    	    			+ " is not on the list"
	    	    			+ " so it cannot be removed");
	    	    else
	    	    {
	    	    	merchList.remove(randMerch);
	    	    	System.out.println("The merchandise item "
	    	    			+ randMerch.toString() + " was removed");
	    	    }
	    		
	    		break;
	    		
	    	case "3":
	    		if(merchList.size() == 0)
	    		{
	    			System.out.println("There are no items in the list "
	    					+ "so there is nothing to check for!");
	    			break;
	    		}
	    		System.out.println("Enter the name of the merchandise"
	    				+ " you wish to check");
	    		nameStr = keyboard.nextLine();
	    	    System.out.println("Enter the price corresponding"
	    	    		+ " to the name of the merchandise"
	    	    		+ " you wish to check");
	    	    priceStr = keyboard.nextLine();
	    	    flag2 = isDoubleAndAboveZero(priceStr);
	    	    while(flag2 == false)
	    	    {
	    	    	System.out.println("The price entered must be a "
	    	    			+ "number and above zero. Make sure "
	    	    			+ "not to include $ or any commas "
	    	    			+ "as the list will appear as "
	    	    			+ "having them. Just enter the "
	    	    			+ "price non-formatted.\n"
	    	    			+ "Please enter a new price"
	    	    			+ " that could possibly be in the list");
	    	    	priceStr = keyboard.nextLine();
	    	    	flag2 = isDoubleAndAboveZero(priceStr);
	    	    }
	    	    priceDub = Double.parseDouble(priceStr);
	    		randMerch = new Merchandise(nameStr, priceDub);
	    		foundItem = merchList.contains(randMerch);
	    		if(foundItem == true)
	    			System.out.println("Yes, the list contains " 
	    		            + randMerch.toString());
	    		else
	    			System.out.println("No, the list does "
	    					+ "not contain " + randMerch.toString());
	    		
	    		break;
	    		
	    	case "4":
	    		System.out.println("The current size of the"
	    				+ " list is " + merchList.size());
	    		
	    		break;
	    		
	    	case "5":
	    		if(merchList.size() == 0)
	    		{
	    			System.out.println("The list is empty!");
	    			break;
	    		}
	    		System.out.println();
	    	    for (Merchandise merch: merchList)
	    	       System.out.println(merch);
	    		break;
	    	}
	    	
	    	
	    	menu();
	    	keyboard = new Scanner(System.in);
		    userChoice = keyboard.nextLine();
	    }
	    
	    
    	
	    keyboard.close();
	}
	
	/**
	 * Method to display menu for user
	 */
	
	public static void menu()
	{
		System.out.println("Please enter the number of your option.\n");
	    System.out.println("1. Add merchandise to the list");
	    System.out.println("2. Remove merchandise from the list");
	    System.out.println("3. Check if the list contains a "
	    		+ "certain merchandise item");
	    System.out.println("4. Check how many items are in the list");
	    System.out.println("5. See the list in sorted order by name");
	}
	
	/**
     * Method to check if the string is of data type double or not 
     * and whether or not the newly found integer is greater than 0 or not
     * @param str Number entered by user
     * @return boolean to flag whether the string can be type double or not
     * and if the newly found integer is greater than 0
     */
    
    public static boolean isDoubleAndAboveZero(String str)
    {
    	try 
        {  
          double number = Double.parseDouble(str);  
          if(number >= 0)
      	  {
      		return true;
      	  }
      	  else
      	  {
      		return false;
      	  }
        } catch(NumberFormatException e)
        {  
          return false;  
        }  
    }
}
