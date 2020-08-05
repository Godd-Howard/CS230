package Merchandise;
import java.text.DecimalFormat;

/**
 * By: Kurtis Yoder
 * 
 * This class is used for creating a Merchandise object.
 * Utilized in other java programs.
 */

public class Merchandise implements Comparable <Merchandise>{

	private String name;
	private String price;
	
    /**
     * Constructor
     * Initialize attribute name and price of a
     * Merchandise object.
     * @param nam Name of a Merchandise object
     * @param price Price of Merchandise object
     */
	
	public Merchandise(String nam, double pric)
	{
		name = nam;
		price = new DecimalFormat("#,##0.##").format(pric);
	}
	
	/**
	 * The equals method returns whether a Merchandise
	 * object equals another Merchandise object.
	 * @param obj A Merchandise object to compare
	 * @return Whether the two Merchandise objects are equal
	 */
	
	public boolean equals(Merchandise obj)
	{
		if(name.equals(obj.name) && 
				price.equals(obj.price))
			return true;
		else
			return false;
	}
	
	/**
	 * This method returns a negative integer, zero, 
	 * or a positive integer as this object 
	 * is less than, equal to, or greater than when
	 * compared to the other Merchandise object.
	 * @param other Merchandise object to compare
	 * @return Returns a negative integer, zero, 
	 * or a positive integer
	 */
	
	public int compareTo(Merchandise other)
	{
		if(!name.equals(other.name))
			return name.compareToIgnoreCase(other.name);
		else
			return price.compareTo(other.price);
		
	}
	
	/**
	 * This method returns a string made
	 * up of the name and price attributes
	 * of a Merchandise object.
	 * @return Name and price attributes
	 */
	
	@Override
	public String toString()
	{
		return(name + " $" + price);
	}
}
