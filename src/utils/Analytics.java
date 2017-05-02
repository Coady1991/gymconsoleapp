package utils;

import models.Assessment;
import models.Member; 
/**
 * 
 * @author Niall Coady
 *
 * @version 1.02 02/05/2017
 */

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
		return 2.1;
		//if (= 0)
        //    return 0;
        //else
           // return toTwoDecimalPlaces(assessment.getWeight() / (member.getHeight() * member.getHeight()));
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
	
	/**
	 * Returns the member height converted from metres to inches.
	 * 
	 * @param height Members height.
	 * 
	 * @return The member height converted from metres to inches using the formula:
	 * metres multiplied by 39.37. The number returned is truncated to two decimal places.
	 */
	
	public double convertHeightMetresToInches(double height)
	{
		return toTwoDecimalPlaces(height * 39.37);
	}
	
	/**
	 * Returns the member weight converted from kgs to pounds.
	 * 
	 * @param weight Members weight.
	 * 
	 * @return The member weight converted from kgs to pounds using the formula:
	 * kg multiplied by 2.20. The number is truncated to two decimal places.
	 */
	
	public double convertWeightKgToPounds(double weight)
	{
		return toTwoDecimalPlaces(weight * 2.20);
	}
	
	/**
	 * Returns to two decimal places.
	 * 
	 * @param num
	 * 
	 * @return Value to decimal places.
	 */
	
	private double toTwoDecimalPlaces(double num)
	{
		return (int)(num * 100) / 100.0;
	}
}
