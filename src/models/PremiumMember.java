package models;

/**
 * Represents a Premium Member. Stores no further details.
 * This is a concrete class which Extends class Member.
 * 
 * @author Niall Coady
 *
 * @version 1.01 27/04/2017
 */

public class PremiumMember extends Member 
{
	/**
	 * Constructor for objects of class Premium Member. 
	 * 
	 * @param email The Premium Members email. Unique use for Member login.
	 * 
	 * @param name The Premium Members name should be no more than 30 characters. If the entered name exceed 30
	 * characters, the extra characters will be truncated and only the first 30 characters will be retained.
	 * 
	 * @param address The Premium Members address, there is no validation on the Premium Members address.
	 * 
	 * @param gender The Premium Members gender i.e can be either "M" or "F". If not specified, default
	 * to "Unspecified".
	 * 
	 * @param height The Premium Members height is measured in Metres. A minimum height of one metre (inclusive)
	 * is allowed and a maximum height of three metres (inclusive).
	 * 
	 * @param startingWeight The Premium Members weight upon joining the gym (in kgs). A minimum weight of
	 * 35kg (inclusive) and a max of 250kg (inclusive) is permitted in the gym.
	 * 
	 * @param chosenPackage The Premium Members chosen package.
	 */
	
	public PremiumMember(String email, String name, String address, String gender, double height, double weight,
                         String chosenPackage)
	{
		super(email, name, address, gender, height, weight, chosenPackage);
	}
	
	public void chosenPackage(String packageChoice)
	{
		
	}
	
}
