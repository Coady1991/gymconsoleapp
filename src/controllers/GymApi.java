package controllers;

import models.*;

import static utils.ScannerInput.validNextDouble;
import static utils.ScannerInput.validNextString;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import utils.*;

/**
 * This is a concrete class that operates between the inheritance hierarchy 
 * classes and assessment class and the menu controller.
 * 
 * @author Niall Coady
 * 
 * @version 1.03 12/05/2017
 */

public class GymApi 
{
	private ArrayList<Member> members;
	private ArrayList<Trainer> trainers;
	
	public GymApi()
	{
		members = new ArrayList<>();
		trainers = new ArrayList<>();
	}
	
	/**
	 * Adds a member to the Member array collection.
	 * 
	 * @param member Adds a member to the Members Array.
	 */
	
	public void addMember(Member member)
	{	
		members.add(member);
	}
	
	/**
	 * Adds a trainer to the trainer array collection.
	 * 
	 * @param trainer Adds a trainer to the Trainers Array.
	 */
	public void addTrainer(Trainer trainer)
	{
		trainers.add(trainer);
	}
	
	/**
	 * Returns the number of members stored in the Members Array.
	 * 
	 * @return The number of members currently stored in the Members Array.
	 */
	
	public int numberOfMembers()
	{
		return members.size();
	}
	
	/**
	 * Returns the number of trainers stored in the Trainers Array.
	 * 
	 * @return The number of trainers currently stored in the Trainers Array.
	 */
	
	public int numberOfTrainers()
	{
		return trainers.size();
	}
	
	/**
	 * An ArrayList of members.
	 * 
	 * @return A list of members.
	 */
	
	public ArrayList<Member> getMembers()
	{
		return members;
	}
	
	/**
	 * An ArrayList of trainers.
	 * 
	 * @return A list of trainers.
	 */
	
	public ArrayList<Trainer> getTrainers()
	{
		return trainers;
	}
	
	/**
	 * Returns a boolean indicating if the index passed as a parameter is
	 * a valid index for the member's ArrayList.
	 * 
	 * @param index The index passed in by the user.
	 * 
	 * @return A boolean that determines if the index is valid.
	 */
	
	public boolean isValidMemberIndex(int index)
	{
		if(index > (members.size() -1))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	/**
	 * Returns a boolean indicating if the index passed as a parameter is
	 * a valid index for the trainer's ArrayList.
	 * 
	 * @param index The index passed in by the user.
	 * 
	 * @return A boolean that determines if the index is valid
	 */
	
	public boolean isValidTrainerIndex(int index)
	{
		if(index > (trainers.size() -1))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	/**
	 * Returns the member object that matches the email entered.
	 * If no member matches, returns null.
	 * 
	 * @param emailEntered The email passed in by the user.
	 * 
	 * @return The member that matches the email entered. 
	 * If no member matches, return null.
	 */
	
	public Member searchMembersByEmail(String emailEntered)
	{
		for(Member member : members) //goes through list of members and compares email with given email
		{
			if(member.getEmail().toLowerCase().equals(emailEntered.toLowerCase()))
			{
				return member; //returns member when email found
			}
		}
		return null; //returns null when no member with given email could be found
	}
	
	/**
	 * Returns a list of member whose name partially or entirely matches the entered name.
	 * 
	 * @param nameEntered The name passed in by the user.
	 * 
	 * @return A list of members whose name partially or entirely matches the entered name.
	 */
	
	public String searchMembersByName(String nameEntered)
	{
		String nameMembers = "";
		if(members.size() > 0)
			for(int i = 0; i < members.size(); i++)
			{
				if(members.get(i).getName().toLowerCase().contains(nameEntered.toLowerCase()))
				{
					nameMembers += members.get(i).getName() + "\n";
				}
				else if(nameMembers.equals(""))
				{
					nameMembers = "There was no matches found";
				}
			}
			else
			{
				nameMembers = "There are no members in the gym";
			}
		return nameMembers;
	}
	
	/**
	 * Returns the trainer object that matches the email entered.
	 * If no trainer matches, return null.
	 * 
	 * @param emailEntered The email passed in by the user.
	 * 
	 * @return The trainer that matches the email entered.
	 * If no trainer matches, return null.
	 */
	
	public Person searchTrainersByEmail(String emailEntered)
	{
		for(Trainer trainer : trainers) //goes through list of trainers and compares email with given email
		{
			if(trainer.getEmail().toLowerCase().equals(emailEntered.toLowerCase()))
			{
				return trainer; //returns trainer when email found
			}
		}
		return null; //returns null when no member with given email could be found
	}
	
	/**
	 * Returns a string containing all the members details in the gym.
	 * 
	 * @return A string containing all the members details in the gym.
	 * If there are no members in the gym, returns a message to indicate this.
	 */
	
	public String listMembers()
	{
		String listMembers = "";
		if(members.size() > 0)
			for (Member members : members)
			{
				listMembers += members.toString() + "\n";
			}
		if (listMembers.equals(""))
		{
			return "There are no members in the gym";
		}
		else
		{
			return listMembers;
		}
	}
	
	/**
	 * Returns a string containing all the members details in the gym
	 * whose latest assessment weight is an ideal weight.
	 * 
	 * @return Returns a string containing all the members details in the gym
	 * whose latest assessment weight is an ideal weight
	 */
	
	public String listMembersWithIdealWeight()
	{
		String listOfMembersIdeal = "";
		if (members.size() > 0)
		{
			for (Member member : members)
			{
				
				if(Analytics.isIdealBodyWeight(member, member.latestAssessment()))
				{
					listOfMembersIdeal = listOfMembersIdeal + member.toString() + "\n"; 
				}
				else if(listOfMembersIdeal.equals(""))
				{
					return "There are no members in the gym with an ideal weight";
				}
				else
				{
					return "listOfMembersIdeal";
				}
			}
		}
		return "There are no members in the gym";
	}
	
	
	/**
	 * Returns a string containing all the members details in the gym
	 * whose BMI category(based on their latest assessment weight) partially
	 * or entirely matches the entered category.
	 * 
	 * @param category The BMI category passed in by the user.
	 * 
	 * @return Returns a string containing all the members details in the gym
	 * whose BMI category(based on their latest assessment weight) partially
	 * or entirely matches the entered category
	 */
	
	public String listmembersByspecificBMICateogry(String category)
	{
		String listOfMembers = "";
		if(members.size() > 0)
		{
			for(Member member: members)
			{
				if(member.getMember().size() > 0 && Analytics.determineBMICategory(Analytics.calculateBMI(member, member.latestAssessment())).toUpperCase().contains(category.toUpperCase()))
				{
					listOfMembers += member.toString() + "\n";
				}
			}
			if(listOfMembers.equals(""))
			{
				return "There are no members in the gym in this BMI category";
			}
			else
			{
				return listOfMembers;
			}
		}
		return "There are no members in the gym";
	}
	
	
	/**
	 * List, for each member, their latest assessment weight and their height both imperially and metrically.
	 * 
	 * @return List, for each member, their latest assessment weight and their height
	 * both imperially and metrically. If there are no members in the gym, return a message
	 * to indicate this.
	 */
	public String listMemberDetailsImperialAndMetric()
	{
		String listOfMembers = "";
		if(members.size() > 0)
		{
			for(Member member : members)
			{
				listOfMembers += member.getName() + ": \t"
						+ member.latestAssessment().getWeight() + " kg (" + Analytics.convertWeightKgToPounds(member.latestAssessment().getWeight()) + 
						" lbs) \t" + member.getHeight() + " metres (" + Analytics.convertHeightMetresToInches(member.getHeight()) + " inches)."
						+ "\n";
						
			}
			return listOfMembers;
		}
		return "There are no members in the gym";
	}

	/**
	 * Allows a Trainer to add an assessment for a Member
	 * 
	 * @param trainer
	 * 
	 * @param member
	 */
	public void addAssessment(Person trainer, Member member)
	{
		double weight;
		
		while(true)
		{
			weight = validNextDouble("Enter weight(Between 35 and 250kgs): ");
			
			if((weight >= 35) && (weight <= 250))
			{
				break;
			}
			else
			{
				System.out.println("Invalid weight entered: " + weight);
				System.out.println("\nPlease enter a starting weight between 35 and 250 kgs");
			}
		}
		
		double chest = validNextDouble("Enter Chest measurement: ");
		double thigh = validNextDouble("Enter Thigh measurement: ");;
		double upperArm = validNextDouble("Enter Upper Arm measurement: ");;
	    double waist = validNextDouble("Enter Waist measurement: ");;
	    double hips = validNextDouble("Enter Hips measurement: ");;
	    String comment = validNextString("Enter assessment comment: ");
	    
	    member.addAssessment(new Assessment(weight, chest, thigh, upperArm, waist, hips, comment, trainer));
	}
	/**
	 * Loads Member and Trainer data.
	 * 
	 * @throws Exception
	 */
	
	 @SuppressWarnings("unchecked")
	public void load() throws Exception
	{
		 XStream xstream = new XStream(new DomDriver());
	     ObjectInputStream is = xstream.createObjectInputStream(new FileReader("gymapp.xml"));
	     members = (ArrayList<Member>) is.readObject();
	     trainers = (ArrayList<Trainer>) is.readObject();
	     is.close();
	}
	
	 /**
	  * Saves Member and Trainer data.
	  * 
	  * @throws Exception
	  */
	public void save() throws Exception
	{
		XStream xstream = new XStream(new DomDriver());
        ObjectOutputStream out = xstream.createObjectOutputStream(new FileWriter("gymapp.xml"));
        out.writeObject(members);
        out.writeObject(trainers);
        out.close();    
	}
	
}
