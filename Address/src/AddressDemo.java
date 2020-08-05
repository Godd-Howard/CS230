/**
 * @author Kurtis Yoder
 * A demo program to test the Address class
 *
 */

public class AddressDemo {

    public static void main(String[] args) {
        Address address1 = new Address(1234, "Shar St", 
        		           "Dan", "Ohio", 3215452, "America");
        Address address2 = new Address(12, "Shackane Ave", 
        		           "Dan", "Ohio", 3215452, "America");
        Address address3 = new Address(1236456, 
        		           "Sharks", "Lepidus", "", 23543425, "Ama");
        System.out.println(address1);
        System.out.println(address2);
        System.out.println(address1.equals(address2));
        
        System.out.println();
        Address addressClone1 = new Address(address1);
        System.out.println(addressClone1);
        System.out.println(address1.equals(addressClone1));
        
        System.out.println();
        Address addressClone2 = addressClone1.copy();
        System.out.println(addressClone1);
        System.out.println(addressClone1.equals(addressClone2));
        
        System.out.println();
        addressClone2 = address3.copy();
        System.out.println(addressClone2);
        System.out.println(addressClone1.equals(addressClone2));
        
        
        
        

    }

}
