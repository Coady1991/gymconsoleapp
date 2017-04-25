package models;

public class Trainer extends Person {

	public String speciality;
	
	public Trainer(String email, String name, String address, String gender, String speciality)
	{
		super(email, name, address, gender);
		this.speciality = speciality;
	}

	//***************************************************************************************
    // Getters for Trainer
    //***************************************************************************************
	
	/**
	 * @return the speciality
	 */
	public String getSpeciality() {
		return speciality;
	}

	//***************************************************************************************
    // Setters for Trainer
    //***************************************************************************************
	
	/**
	 * @param speciality the speciality to set
	 */
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	
	public String toString() 
	{
		return super.toString() + "\nSpeciality: " + speciality;
	}
}
