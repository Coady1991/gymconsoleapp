package models;

import java.util.Date;
import java.util.HashMap;

/**
 * Represents a Member. Stores height, starting weight, chosen package and a HashMap of dates and assessments for the member.
 * Extends class Person.
 * 
 * @author Niall Coady
 * 
 * @version 1.01 27/04/2017
 */
public class Member extends Person 
{
	
	private double height;
	private double startingWeight;
	private String chosenPackage;
	private HashMap<Date, Assessment> member;
	
	/**
	 * Constructor for objects of class Member. 
	 * 
	 * @param email The Members email. Unique use for Member login.
	 * 
	 * @param name The Members name should be no more than 30 characters. If the entered name exceed 30
     * characters, the extra characters will be truncated and only the first 30 characters will be retained.
	 * 
	 * @param address The Members address, there is no validation on the Members address.
	 * 
	 * @param gender The Members gender i.e can be either "M" or "F". If not specified, default
     * to "Unspecified".
	 * 
	 * @param height The Members height is measured in Metres. A minimum height of one metre (inclusive)
     * is allowed and a maximum height of three metres (inclusive).
	 * 
	 * @param startingWeight The Members weight upon joining the gym (in kgs). A minimum weight of
     * 35kg (inclusive) and a max of 250kg (inclusive) is permitted in the gym.
	 * 
	 * @param chosenPackage The Members chosen package.
	 */
	
	public Member(String email, String name, String address, String gender, double height, double startingWeight, String chosenPackage)
	{
		super(email, name, address, gender);
		if ((height >= 1) && (height <= 3))
        {
            this.height = height;
        }
        else
        {
            this.height = 0.0;
        }
		if ((startingWeight >= 35) && (startingWeight <= 250))
        {
            this.startingWeight = startingWeight;
        }
        else
        {
            this.startingWeight = 0.0;
        }
		this.chosenPackage = chosenPackage;
		member = new HashMap<Date, Assessment>();
		
	}

	//***************************************************************************************
    // Getters for Member
    //***************************************************************************************
	
	/**
	 * Returns the Members height(m).
	 * 
	 * @return The Members height(m).
	 */
	public double getHeight() 
	{
		return height;
	}

	/**
	 * Returns the Members starting weight(kg).
	 * 
	 * @return The Members starting weight(kg).
	 */
	public double getStartingWeight() 
	{
		return startingWeight;
	}

	/**
	 * Returns the Members chosen package.
	 * 
	 * @return The Members chosen package.
	 */
	public String getChosenPackage() 
	{
		return chosenPackage;
	}

	/**
	 * Returns the Members Assessments and Dates.
	 * 
	 * @return The Members Assessments and Dates.
	 */
	public HashMap<Date, Assessment> getMember() 
	{
		return member;
	}

	//***************************************************************************************
    // Setters for Member
    //***************************************************************************************
	
	/**
	 * Updates the Members height field.
	 * 
	 * @param height The Members height.
	 */
	public void setHeight(double height) 
	{
		if ((height >= 1) && (height <= 3))
        {
            this.height = height;
        }
	}

	/**
	 * Updates the Members starting weight field.
	 * 
	 * @param weight The Members starting weight.
	 */
	public void setStartingWeight(double startingWeight) 
	{
		if ((startingWeight >= 35) && (startingWeight <= 250))
	    {
	       this.startingWeight = startingWeight;
	    }
	}

	/**
	 * Updates the Members chosen package.
	 * 
	 * @param chosenPackage The Members chosen package.
	 */
	public void setChosenPackage(String chosenPackage) 
	{
		this.chosenPackage = chosenPackage;
	}

	/**
	 * Updates the Members Assessments and Dates
	 * 
	 * @param member The Members Assessments and Dates.
	 */
	public void setMember(HashMap<Date, Assessment> member) 
	{
		this.member = member;
	}
	
	/**
     * Returns a human-readable String representation of the object state.
	 * 
	 * @return A string version of the Member object extending Person toString.
	 */
	public String toString() 
	{
		return super.toString() + "\nheight: " + height + ", weight: " + startingWeight + ", Chosen Package: " + chosenPackage;
	}
	
	//public Assessment latestAssessment()
	{
		
	}
	
	//public SortedSet<Date> sortedAssessmentDates()
	{
		
	}
	
	//public abstract void chosenPackage(String chosenPackage)
	{
		
	}
}
