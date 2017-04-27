package utils;

import models.Assessment;
import models.Member; 

public class Analytics {

	/**
     * This method calculates the BMI value for the member.
     * 
     * The formula used for BMI is weight divided by the square of the height.
     * 
     * @return the BMI value for the member.  The number returned is truncated to two decimal places.
     **/   
	public static double calculateBMI (Member member, Assessment assessment)
	{
		return 2.1;//if ( <= 0)
        //    return 0;
        //else
        //    return toTwoDecimalPlaces(weight / (height * height));
	}
	
	/**
     * This method determines the BMI category that the member belongs to.
     * 
     * @return The BMI category that the member belongs to.
     */
	public static String determineBMICategory(double bmiValue)
	{
		return "";//double BMI = calculateBMI(Member, Assessment);
	}
	
	/**
	 * This method returns a boolean to indicate if the member has an ideal
	 *
     * body weight based on the divine formula
     * 
     * @return True if the result of the devine formula is within
     * 2kgs (inclusive) of the starting weight; false if it is outside
     * this range.
     * */
	public static boolean isIdealBodyWeight(Member member, Assessment assessment)
	{
		return true;
	}
}
