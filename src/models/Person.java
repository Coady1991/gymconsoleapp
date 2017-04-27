package models;

/**
 * Represents a Person. Stores email, name, address and gender.
 * 
 * @author Niall Coady
 * 
 * @version 1.01 27/04/2017
 */
public class Person 
{

	private String email;
	private String name;
	private String address;
	private String gender;
	
	/**
	 * Constructor for objects of class Person.
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
	 */
	
	public Person(String email, String name, String address, String gender)
	{
		this.email = email; //TODO put validation here
		if (name.length() < 30)
	    {
	        this.name = name;
	    }
	    else
	    {
	        this.name = name.substring(0, 30);
	    }
		this.name = name;
		this.address = address;
		if ((gender.toUpperCase().equals("M")) || ((gender.toUpperCase().equals("F"))))
        {
            this.gender = gender;
        }
        else
        {
            gender = "Unspecified";
        }
	}
	
	//***************************************************************************************
    // Getters for Person
    //***************************************************************************************

	/**
	 * Returns the email for the Person.
	 * 
	 * @return The Persons email
	 */
	public String getEmail() 
	{
		return email;
	}
	
	/**
	 * Returns the Persons name.
	 * 
	 * @return The Persons name.
	 */
	public String getName() 
	{
		if(name.length() < 30)
		{
			return name;
		}
		else
		{
			return name.substring(0, 30);
		}
	}
	
	/**
	 * Returns the Persons address.
	 * 
	 * @return The Persons address.
	 */
	public String getAddress() 
	{
		return address;
	}
	
	/**
	 * Returns the Persons gender.
	 * 
	 * @return The Persons gender.
	 */
	public String getGender() 
	{
		return gender;
	}

	//***************************************************************************************
    // Setters for Person
    //***************************************************************************************
	
	/**
	 * Updates the Person email field.
	 * 
	 * @param email The Persons email.
	 */
	public void setEmail(String email) 
	{
		this.email = email;
	}

	/**
	 * Updates the Person name field.
	 * 
	 * @param name The member's name should be no more than 30 characters. If the entered name exceed 30
     * characters, the extra characters will be truncated and only the first 30 characters will be retained.
     * 
	 */
	public void setName(String name) 
	{
		if(name.length() < 30)
		{
			this.name = name;
		}
		else
		{
			this.name = name.substring(0, 30);
		}
	}

	/**
	 * Updates the Person address field.
	 * 
	 * @param address There is no validation on the member's address.
	 */
	public void setAddress(String address) 
	{
		this.address = address;
	}

	/**
	 * Updates the Person gender field.
	 * 
	 * @param gender The member's gender i.e can be either "M" or "F". All other values are ignored.
	 */
	public void setGender(String gender)
	{
		if ((gender.toUpperCase().equals("M")) || ((gender.toUpperCase().equals("F"))))
        {
            this.gender = gender;
        }
        else
        {
            gender = "Unspecified";
        }
	}

	/**
     * Returns a human-readable String representation of the object state.
	 * 
	 * @return A string version of the Person object.
	 */
	@Override
	public String toString() 
	{
		//TODO Enter String details
		return "email: " + email + ", name: " + name + ", address: " + address + ", gender: " + gender;
	}
	
	
}
