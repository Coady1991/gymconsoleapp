package models;

import java.util.Date;
import java.util.HashMap;

/**
 * Represents a student member. Stores student ID and college name.
 * This is a concrete class which extends class Member.
 * 
 * @author Niall Coady
 *
 * @version 1.01 27/04/2017
 */

public class StudentMember extends Member 
{

	private int studentId;
	private String collegeName;
	
	/**
	 * Constructor for objects of class Student Member. 
	 * 
	 * @param email The Students email. Unique use for Member login.
	 * 
	 * @param name The Students name should be no more than 30 characters. If the entered name exceed 30
	 * characters, the extra characters will be truncated and only the first 30 characters will be retained.
	 * 
	 * @param address The Students address, there is no validation on the Members address.
	 * 
	 * @param gender The Students gender i.e can be either "M" or "F". If not specified, default
	 * to "Unspecified".
	 * 
	 * @param height The Students height is measured in Metres. A minimum height of one metre (inclusive)
	 * is allowed and a maximum height of three metres (inclusive).
	 * 
	 * @param startingWeight The Students weight upon joining the gym (in kgs). A minimum weight of
	 * 35kg (inclusive) and a max of 250kg (inclusive) is permitted in the gym.
	 * 
	 * @param chosenPackage The Students chosen package.
	 * 
	 * @param studentId The Students ID is 6 digits long i.e between 100000(exclusive) and 999999 (inclusive).
	 * If an invalid Student ID is entered, set the Student ID to default value of 100000.
	 * 
	 * @param collegeName The Students college name.
	 */
	public StudentMember(String email, String name, String address, String gender, double height, double weight,
			             String chosenPackage, int studentId, String collegeName)
	{
		super(email, name, address, gender, height, weight, chosenPackage);
		if((studentId >= 100001) && (studentId <= 999999))
        {
            this.studentId = studentId;
        }
        else
        {
            this.studentId = 100000;
        }
		this.collegeName = collegeName;
	}

	//***************************************************************************************
	// Getters for StudentMember
	//***************************************************************************************
	
	/**
	 * Returns the Students student ID.
	 * 
	 * @return The Students student ID
	 */
	public int getStudentId() 
	{
		return studentId;
	}

	/**
	 * Returns the Students college name.
	 * 
	 * @return The Students collegeName
	 */
	public String getCollegeName() 
	{
		return collegeName;
	}

	//***************************************************************************************
	// Setters for StudentMember
	//***************************************************************************************
	
	/**
	 * Updates the Students student ID field.
	 * 
	 * @param studentId The Students ID is 6 digits long i.e between 100000(exclusive) and 999999 (inclusive).
	 */
	public void setStudentId(int studentId) 
	{
		if ((studentId >= 100001) && (studentId <= 999999))
        {
            this.studentId = studentId;
        }
		
	}

	/**
	 * Updates the Students college name field.
	 * 
	 * @param collegeName The students college name.
	 */
	public void setCollegeName(String collegeName) 
	{
		this.collegeName = collegeName;
	}
	
	/**
	 * Returns a human-readable String representation of the object state.
	 * 
	 * @return A string version of the Student object extending Member and Person toString.
	 */
	public String toString() 
	{
		return super.toString() + "\nStudent ID: " + studentId + ", College Name: " + collegeName + "\n";
	}
	
	public void chosenPackage(String packageChoice)
	{
		setChosenPackage(packageChoice);
	}
	
}
