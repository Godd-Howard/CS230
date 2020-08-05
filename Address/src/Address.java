/**
 * This class implements an address storing the
 * street number, street, city, state, zipcode, and country.
 * @author Debbie Wilson
 *
 * Edited by Kurtis Yoder
 * Fixed any issues with the class
 */

public class Address 
{
   private int streetNum;
   private String streetName;
   private String city;
   private String state;
   private int zipcode;
   private String country;
   
   /**
    * Constructor
    * @param num    The street number for the address.
    * @param street The street for the address.
    * @param c      The city for the address.
    * @param st     The state for the address.
    * @param zip    The zipcode for the address.
    * @param coun   The country for the address.
    */
   public Address(int num, String street, String c, 
		   String st, int zip, String coun)
   {
       streetNum = num;
       streetName = street;
       city = c;
       state = st;
       zipcode = zip;
       country = coun;
   }
   
   /**
    * Copy constructor
    * Copies an Address object.
    * @param add The Address object to copy.
    */
   public Address(Address add)
   {
       streetNum = add.streetNum;
       streetName = add.streetName;
       city = add.city;
       state = add.state;
       zipcode = add.zipcode;
       country = add.country;
   }
   
   /**
    * The equals method compares two Address objects
    * @param add The Address object to compare to this object.
    * @return True if the objects are equal, false otherwise.
    */
   public boolean equals (Address add)
   {
	   boolean status;
	   if (streetNum == add.streetNum && 
		   streetName.equals(add.streetName) &&
		   city.equals(add.city) &&
		   state.equals(add.state) &&
		   zipcode == add.zipcode  &&
		   country.equals(add.country))
		   status = true;
	   else
		   status = false;
	   
	   return status;
   }
   
   /**
    * The copy method creates a copy of this Address object.
    * @return A copy of this Address object.
    */
   public Address copy ()
   {
       Address copy = new Address (streetNum, streetName, 
    		          city, state, zipcode, country);
	   return copy;
   }
   
   /**
    * Create a String of the current state of the Address object.
    * @return A String object containing the full formatted address.
    */
   @Override
   public String toString ()
   {
	   String str;
	   str = streetName + " " + streetNum + "\n" + city + ", " +
			 state + " " + zipcode + ", " + country;
	   
	   return str;
   }
}