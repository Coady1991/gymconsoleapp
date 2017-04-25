package models;

import java.util.Date;
import java.util.HashMap;

public class Member extends Person {
	
	private double height;
	private double weight;
	private String chosenPackage;
	private HashMap<Date, Assessment> member;
	
	public Member(String email, String name, String address, String gender, double height, double weight, String chosenPackage)
	{
		super(email, name, address, gender);
		this.height = height;
		this.weight = weight;
		this.chosenPackage = chosenPackage;
		member = new HashMap<Date, Assessment>();
		
	}

	//***************************************************************************************
    // Getters for Member
    //***************************************************************************************
	
	/**
	 * @return the height
	 */
	public double getHeight() 
	{
		return height;
	}

	/**
	 * @return the weight
	 */
	public double getWeight() 
	{
		return weight;
	}

	/**
	 * @return the chosenPackage
	 */
	public String getChosenPackage() 
	{
		return chosenPackage;
	}

	/**
	 * @return the member
	 */
	public HashMap<Date, Assessment> getMember() 
	{
		return member;
	}

	//***************************************************************************************
    // Setters for Member
    //***************************************************************************************
	
	/**
	 * @param height the height to set
	 */
	public void setHeight(double height) 
	{
		this.height = height;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(double weight) 
	{
		this.weight = weight;
	}

	/**
	 * @param chosenPackage the chosenPackage to set
	 */
	public void setChosenPackage(String chosenPackage) 
	{
		this.chosenPackage = chosenPackage;
	}

	/**
	 * @param member the member to set
	 */
	public void setMember(HashMap<Date, Assessment> member) 
	{
		this.member = member;
	}
	
	public String toString() 
	{
		return super.toString() + "\nheight: " + height + ", weight: " + weight + ", Chosen Package: " + chosenPackage;
	}
	
}
