package models;

/**
 * Represents a Trainer. Stores Trainer Speciality.
 * Extends class Person.
 * 
 * @author Niall Coady
 * 
 * @version 1.01 27/04/2017
 */

public class Trainer extends Person 
{

	private String speciality;
	
	/**
	 * Constructor for objects of class Trainer..
	 * 
	 * @param email The Persons email. Unique use for member login.
	 * 
	 * @param name The Persons name should be no more than 30 characters. If the entered name exceed 30
     * characters, the extra characters will be truncated and only the first 30 characters will be retained.
     * 
	 * @param address The Persons address, there is no validation on the Persons address.
	 * 
	 * @param gender The Persons gender i.e can be either "M" or "F". If not specified, default
     * to "Unspecified".
     * 
     * @param speciality The Trainers speciality.
	 */
	
	private Trainer(String email, String name, String address, String gender, String speciality)
	{
		super(email, name, address, gender);
		this.speciality = speciality;
	}

	//***************************************************************************************
    // Getters for Trainer
    //***************************************************************************************
	
	/**
	 * Returns the Trainers speciality.
	 * 
	 * @return The Trainers speciality.
	 */
	public String getSpeciality() 
	{
		return speciality;
	}

	//***************************************************************************************
    // Setters for Trainer
    //***************************************************************************************
	
	/**
	 * Updates the Trainers speciality field.
	 * 
	 * @param speciality The Trainers speciality
	 */
	public void setSpeciality(String speciality) 
	{
		this.speciality = speciality;
	}
	
	/**
     * Returns a human-readable String representation of the object state.
	 * 
	 * @return A string version of the Trainer object extending Person toString.
	 */
	public String toString() 
	{
		return super.toString() + "\nSpeciality: " + speciality;
	}
}
