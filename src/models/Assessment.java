package models;

/**
 * Represents an Assessment. Stores weight, chest, thigh,
 * upper arm, waist, hips, comment and the trainer
 * who carried out the Assessment for a Member.
 * 
 * @author Niall Coady
 * 
 * @version 1.01 27/04/2017
 */

public class Assessment 
{
	public double weight;
	public double chest;
	public double thigh;
	public double upperArm;
    public double waist;
    public double hips;
    public String comment;
    private Trainer trainer;
    
    /**
     * Constructor for objects of class Assessment. There is no validation on any fields.
     * 
     * @param weight The weight of the Member for an Assessment.
     * 
     * @param chest The chest size of a Member for an Assessment.
     * 
     * @param thigh The thigh size of a Member for an Assessment.
     * 
     * @param upperArm The upper arm size of a Member for an Assessment.
     * 
     * @param waist The waist size of a Member for an Assessment.
     * 
     * @param hips The hip size of a Member for an Assessment.
     * 
     * @param comment The comment associated with the Assessment.
     * 
     * @param trainer The Trainer who carried out the Assessment.
     */
    
    public Assessment (double weight, double chest, double thigh, double upperArm, double waist, double hips,
    		           String comment, Trainer trainer)
    {
    	this.weight = weight;
    	this.chest = chest;
    	this.thigh = thigh;
    	this.upperArm = upperArm;
    	this.waist = waist;
    	this.hips = hips;
    	this.comment = comment;
    	this.trainer = trainer;
    }

    //***************************************************************************************
    // Getters for Assessment
    //***************************************************************************************
	
    /**
     * Returns the weight for the Assessment.
     * 
     * @return The weight for the Assessment
     */
    public double getWeight() 
    {
    	return weight;
    }
    
	/**
	 * Returns the chest size for the Assessment.
	 * 
	 * @return The chest size for the Assessment.
	 */
	public double getChest() 
	{
		return chest;
	}
	
	/**
	 * Returns the thigh size for the Assessment.
	 * 
	 * @return The thigh size for the Assessment.
	 */
	public double getThigh() 
	{
		return thigh;
	}
    
	/**
	 * Returns the upper arm size for the Assessment.
	 * 
	 * @return The upper arm size for the Assessment.
	 */
	public double getUpperArm() 
	{
		return upperArm;
	}
	
	/**
	 * Returns the waist size for the Assessment.
	 * 
	 * @return The waist size for the Assessment.
	 */
	public double getWaist() 
	{
		return waist;
	}
	
	/**
	 * Returns the hip size for the Assessment.
	 * 
	 * @return The hip size for the Assessment.
	 */
	public double getHips() 
	{
		return hips;
	}
	
	/**
	 * Returns the comment for the Assessment.
	 * 
	 * @return The comment for the Assessment.
	 */
	public String getComment() 
	{
		return comment;
	}
    
	/**
	 * Returns the Trainer who carried out the Assessment.
	 * 
	 * @return The Trainer who carried out the Assessment.
	 */
	public Trainer getTrainer() 
	{
		return trainer;
	}
	
    //***************************************************************************************
    // Setters for Assessment
    //***************************************************************************************
    
    /**
     * Updates the weight field for the Assessment.
     * 
	 * @param weight The Assessment weight.
	 */
	public void setWeight(double weight) 
	{
		this.weight = weight;
	}

	/**
	 * Updates the chest size field for the Assessment.
	 * 
	 * @param chest The Assessment chest size.
	 */
	public void setChest(double chest) 
	{
		this.chest = chest;
	}

	/**
	 * Updates the thigh size field for the Assessment.
	 * 
	 * @param thigh The Assessment thigh size.
	 */
	public void setThigh(double thigh) 
	{
		this.thigh = thigh;
	}

	/**
	 * Updates the upper arm size field for the Assessment.
	 * 
	 * @param upperArm The Assessment upper arm size.
	 */
	public void setUpperArm(double upperArm) 
	{
		this.upperArm = upperArm;
	}

	/**
	 * Updates the waist size field for the Assessment.
	 * 
	 * @param waist The Assessment waist size.
	 */
	public void setWaist(double waist) 
	{
		this.waist = waist;
	}

	/**
	 * Updates the hip size field for the Assessment.
	 * 
	 * @param hips The Assessment hip size.
	 */
	public void setHips(double hips) 
	{
		this.hips = hips;
	}

	/**
	 * Updates the comment field for the Assessment.
	 * 
	 * @param comment The Assessment comment.
	 */
	public void setComment(String comment) 
	{
		this.comment = comment;
	}

	/**
	 * Updates the Trainer field for the Assessment.
	 * 
	 * @param trainer The Assessment Trainer.
	 */
	public void setTrainer(Trainer trainer) 
	{
		this.trainer = trainer;
	}

	/**
	 * Returns a human-readable String representation of the object state.
	 *
	 * @return A string version of the Assessment object.
	 */
	@Override
	public String toString() 
	{
		return "Assessment weight: " + weight + ", chest: " + chest + ", thigh: " + thigh + ", upperArm: " + upperArm
				+ ", waist: " + waist + ", hips: " + hips + ", comment: " + comment + ", trainer: " + trainer;
	}

    
}


