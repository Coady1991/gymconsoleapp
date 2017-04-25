package models;

import java.util.Date;
import java.util.HashMap;

public class StudentMember extends Member {

	private int studentId;
	private String collegeName;
	
	public StudentMember(String email, String name, String address, String gender, double height, double weight,
			             String chosenPackage, int studentId, String collegeName)
	{
		super(email, name, address, gender, height, weight, chosenPackage);
		if ((studentId >= 100001) && (studentId <= 999999))
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
	 * @return the studentId
	 */
	public int getStudentId() {
		return studentId;
	}

	/**
	 * @return the collegeName
	 */
	public String getCollegeName() {
		return collegeName;
	}

	//***************************************************************************************
    // Setters for StudentMember
    //***************************************************************************************
	
	/**
	 * @param studentId the studentId to set
	 */
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	/**
	 * @param collegeName the collegeName to set
	 */
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	
	public String toString() 
	{
		return super.toString() + "\nStudent ID: " + studentId + ", collegeName: " + collegeName;
	}
	
}
