package models;

public class Assessment {
	
	public double weight;
	public double chest;
	public double thigh;
	public double upperArm;
    public double waist;
    public double hips;
    public String comment;
    private Trainer trainer;
    
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
	 * @return the weight
	 */
	public double getWeight() {
		return weight;
	}
    
	/**
	 * @return the chest
	 */
	public double getChest() {
		return chest;
	}
	
	/**
	 * @return the thigh
	 */
	public double getThigh() {
		return thigh;
	}
    
	/**
	 * @return the upperArm
	 */
	public double getUpperArm() {
		return upperArm;
	}
	
	/**
	 * @return the waist
	 */
	public double getWaist() {
		return waist;
	}
	
	/**
	 * @return the hips
	 */
	public double getHips() {
		return hips;
	}
	
	/**
	 * @return the comment
	 */
	public String getComment() {
		return comment;
	}
    
	/**
	 * @return the trainer
	 */
	public Trainer getTrainer() {
		return trainer;
	}
	
    //***************************************************************************************
    // Setters for Assessment
    //***************************************************************************************
    
    /**
	 * @param weight the weight to set
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}

	/**
	 * @param chest the chest to set
	 */
	public void setChest(double chest) {
		this.chest = chest;
	}

	/**
	 * @param thigh the thigh to set
	 */
	public void setThigh(double thigh) {
		this.thigh = thigh;
	}

	/**
	 * @param upperArm the upperArm to set
	 */
	public void setUpperArm(double upperArm) {
		this.upperArm = upperArm;
	}

	/**
	 * @param waist the waist to set
	 */
	public void setWaist(double waist) {
		this.waist = waist;
	}

	/**
	 * @param hips the hips to set
	 */
	public void setHips(double hips) {
		this.hips = hips;
	}

	/**
	 * @param comment the comment to set
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}

	/**
	 * @param trainer the trainer to set
	 */
	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Assessment [weight=" + weight + ", chest=" + chest + ", thigh=" + thigh + ", upperArm=" + upperArm
				+ ", waist=" + waist + ", hips=" + hips + ", comment=" + comment + ", trainer=" + trainer + "]";
	}

    
}


