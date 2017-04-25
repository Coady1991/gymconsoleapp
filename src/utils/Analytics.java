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
	
	public static String determineBMICategory(double bmiValue)
	{
		return "";//double BMI = calculateBMI(Member, Assessment);
	}
	
	public static boolean isIdealBodyWeight(Member member, Assessment assessment)
	{
		return true;
	}
}
