package models;

public class Person {

	private String email;
	private String name;
	private String address;
	private String gender;
	
	public Person(String email, String name, String address, String gender)
	{
		this.email = email; //put validation here
		this.name = name;
		this.address = address;
		this.gender = gender;
	}

	/**
	 * @return the email
	 */
	public String getEmail() 
	{
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) 
	{
		this.email = email;
	}

	/**
	 * @return the name
	 */
	public String getName() 
	{
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) 
	{
		this.name = name;
	}

	/**
	 * @return the address
	 */
	public String getAddress() 
	{
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) 
	{
		this.address = address;
	}

	/**
	 * @return the gender
	 */
	public String getGender() 
	{
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender)
	{
		this.gender = gender;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() 
	{
		//TODO Enter String details
		return "email: " + email + ", name: " + name + ", address: " + address + ", gender: " + gender;
	}
	
	
}
