package controllers;

import models.*;
import controllers.GymApi;
import static utils.ScannerInput.*;
import java.util.Scanner;


/**
 * This class runs the application and handles the Gym
 * with its members and trainers.
 * 
 * @author Niall Coady
 * 
 * @version 1.03 07/05/2017
 */

public class MenuController {
	
	private Scanner input;
	private GymApi gymapi;
	
	
	public static void main(String[] args)
	{
		new MenuController();
	}
	
	public MenuController()
	{
		input = new Scanner(System.in);
		gymapi = new GymApi();
		try //TODO is this in the right place to load from XML before menu runs?
		{
			gymapi.load();
		}
		catch (Exception e)
		{
			System.err.println("Error reading from file: " + e);		
		}
		runMenu();
	}
	
	/**
	 * loginMenu() - This method displays the login menu for the application,
	 * read the menu option that the user entered and returns it.
	 * 
	 * @return The users menu choice.
	 */
	private int loginMenu()
	{
		System.out.println("+---------------------------+");
		System.out.println("+   Welcome to the GymApp   +");
		System.out.println("+---------------------------+");
		System.out.println("  1) Login");
		System.out.println("  2) Register");
		System.out.println("  0) Exit");
		int option = validNextInt("==>> ");
		return option;
	}
	
	/**
	 * This method controls the loop for the login menu.
	 * Exits the loop once user inputs 0.
	 * 
	 */
	private void runMenu()
	{
		int option = loginMenu();
		while (option != 0)
		{
			switch (option)
			{
			case 1: login();
			break;
			case 2: register();
			break;
			default: System.out.println("Invalid option entered: " + option);
			break;
			}
			//pause the program so that the user can read what was printed to
			//the terminal window
			System.out.println("\nPress any key to continue...");
			input.nextLine();
			//display the main menu again
			option = loginMenu();
		}
		//The user chose option 0, so exit the program
		System.out.println("Exiting... Goodbye");
		System.exit(0);
	}
	
	/**
	 * This method controls the loop for the Member/Trainer login.
	 * If invalid details are entered, the user is returned to the login menu.
	 * 
	 */
	private void login()
	{
		String loginType = "";
		
		String personClass = validNextString("Welcome! Are you a Member or a Trainer? (M/T)");
		personClass = personClass.toUpperCase();
		
		if((!personClass.equals("M")) && (!personClass.equals("T")))
		{
			System.out.println("Invalid option entered: " + personClass + 
					           "\nReturning to login menu!");
			return;
		}
		else if(personClass.equals("M"))
		{
			loginType = "Member";
		}
		else if(personClass.equals("T"))
		{
			loginType = "Trainer";
		}
		
		System.out.println("Hello " + loginType + " please login.");
		String loginEmail = validNextString("Enter your Email: ");
		
		if(personClass.contains("M") && gymapi.searchMembersByEmail(loginEmail) != null)
		{
			runMemberMenu(personClass, gymapi.searchMembersByEmail(loginEmail));			
		}
		else if(personClass.contains("T") && gymapi.searchTrainersByEmail(loginEmail) != null)
		{
			trainerMenu(personClass, gymapi.searchTrainersByEmail(loginEmail));
		}
		else
		{
			System.out.println("ACCESS DENIED: " + loginEmail +
					           "\nReturning to login menu!");
		}
	}
	
	private void register()
	{
		String regType = "";
		
		
		String personClass = validNextString("Welcome! Would you like to register as a Member or a Trainer? (M/T)");
		personClass = personClass.toUpperCase();
		
		if((!personClass.equals("M")) && (!personClass.equals("T")))
		{
			System.out.println("Invalid option entered: " + personClass + 
					           "\nReturning to login menu!");
			return;
		}
		else if(personClass.equals("M"))
		{
			regType = "New Member";
		}
		else if(personClass.equals("T"))
		{
			regType = "New Trainer";
		}
		
		System.out.println("Hello " + regType + " please register.");
		
		//Register a Member loop
		if(personClass.contains("M"))
		{
			System.out.println("\nPlease enter the following details to set up your Member account");
			
			String mEmail = "";
			String mName = "";
			String mAddress = "";
			String mGender = "";
			double mHeight = 0;
			double mStartingWeight = 0;
			String mChosenPackage = "";
			int mStudentId = 0;
			String mCollegeName = "";
			
			while(true)
			{
				mEmail = validNextString("\nEnter your E-mail address: ");
				
				//https://www.tutorialspoint.com/javaexamples/regular_email.htm
				if(!mEmail.matches("^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$")) 
				{
					System.out.println("Invalid E-mail entered: " + mEmail);
				}
				
				else if(gymapi.searchMembersByEmail(mEmail) != null || gymapi.searchTrainersByEmail(mEmail) != null)
				{
					System.out.println("\nThis E-mail address is already in use: " + mEmail);
				}
				else
				{
					break;
				}
			}
			
			while(true)
			{
				mName = validNextString("Enter your name: ");
				
				//http://stackoverflow.com/questions/24191040/checking-to-see-if-a-string-is-letters-spaces-only
				if(!mName.matches("^[ A-Za-z]+$"))
				{
					System.out.println("This name is invalid: " + mName);
					System.out.println("\nIt must contain only letters");
				}
				else
				{
					break;
				}
			}
			
			mAddress = validNextString("Enter your Address: ");
			
			
			while(true)
			{
				mGender = validNextString("Enter your Gender: (M/F)");
				
				if(!mGender.toUpperCase().equals("M") && !mGender.toUpperCase().equals("F"))
				{
					System.out.println("Invalid option was entered: " + mGender);
					System.out.println("\nPlease enter M or F");
				}
				else
				{
					break;
				}
			}
			
			while(true)
			{
				mHeight = validNextDouble("\nEnter your height(Between 1 and 3 metres): ");
				
				if((mHeight >= 1) && (mHeight <=3))
				{
					break;
				}
				else
				{
					System.out.println("Invalid height entered: " + mHeight);
					System.out.println("\nPlease enter a height between 1 and 3 metres!");
				}
			}
			
			while(true)
			{
				mStartingWeight = validNextDouble("Enter you starting weight(Between 35 and 250kgs): ");
				
				if((mStartingWeight >= 35) && (mStartingWeight <= 250))
				{
					break;
				}
				else
				{
					System.out.println("Invalid weight entered: " + mStartingWeight);
					System.out.println("\nPlease enter a starting weight between 35 and 250 kgs");
				}
			}
			
			while(true)
			{
				mChosenPackage = validNextString("Is this membership a Premium or Student type membership? (P/S)");
				mChosenPackage = mChosenPackage.toUpperCase();
				
				if(!mChosenPackage.toUpperCase().equals("P") && !mChosenPackage.toUpperCase().equals("S"))
				{
					System.out.println("Invalid option was entered: " + mChosenPackage);
					System.out.println("\nPlease enter P or S");
					}
				else if(mChosenPackage.equals("P"))
				{
					mChosenPackage = "Premium Membership";
					break;
				}
				else if(mChosenPackage.equals("S"))
				{
					mChosenPackage  = "Student Membership";
					break;
				}
			}
				
			
			
			
			if(mChosenPackage.contains("S"))
			{
				System.out.println("You have selected a " + mChosenPackage + " Please enter the following details to set up your Member account");
				
				while(true)
				{
					mStudentId = validNextInt("Please enter your Student Id number(Between 100001 and 999999)");
					
					if((mStudentId >= 100001) && (mStudentId <= 999999))
					{
						break;
					}
					else
					{
						System.out.println("Invalid Student Id entered: " + mStudentId);
						System.out.println("\nPlease enter a Student Id between 100001 and 999999");
					}
				}
				
				while(true)
				{
					mCollegeName = validNextString("Please enter the name of your College? ");
					
					if(!mCollegeName.matches("^[ A-Za-z]+$"))
					{
						System.out.println("This name is invalid: " + mCollegeName);
						System.out.println("\nIt must contain only letters");
					}
					else
					{
						break;
					}
				}
				
				gymapi.addMember(new StudentMember(mEmail, mName, mAddress, mGender, mHeight, mStartingWeight, mChosenPackage, mStudentId, mCollegeName));
				System.out.println("\nNew Student member added successfully!");
			}
			
			
			
			else if(mChosenPackage.contains("P"))
			{
				gymapi.addMember(new PremiumMember(mEmail, mName, mAddress, mGender, mHeight, mStartingWeight, mChosenPackage));
				System.out.println("\nNew Premium member added successfully!");
			}	
		}
		
		//Register a Trainer loop
		if(personClass.contains("T"))
		{
			System.out.println("\nPlease enter the following details to set up your Member account");
			
			String tEmail = "";
			String tName = "";
			String tAddress = "";
			String tGender = "";
			String tSpeciality = "";
			
			while(true)
			{
				tEmail = validNextString("\nEnter your E-mail address: ");
				
				//https://www.tutorialspoint.com/javaexamples/regular_email.htm
				if(!tEmail.matches("^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$")) 
				{
					System.out.println("Invalid E-mail entered: " + tEmail);
				}
				
				else if(gymapi.searchMembersByEmail(tEmail) != null || gymapi.searchTrainersByEmail(tEmail) != null)
				{
					System.out.println("\nThis E-mail address is already in use: " + tEmail);
				}
				else
				{
					break;
				}
			}
			
			while(true)
			{
				tName = validNextString("Enter your name: ");
				
				//http://stackoverflow.com/questions/24191040/checking-to-see-if-a-string-is-letters-spaces-only
				if(!tName.matches("^[ A-Za-z]+$"))
				{
					System.out.println("This name is invalid: " + tName);
					System.out.println("\nIt must contain only letters");
				}
				else
				{
					break;
				}
			}
			
			tAddress = validNextString("Enter your Address: ");
			
			while(true)
			{
				tGender = validNextString("Enter your Gender: (M/F)");
				
				if(!tGender.toUpperCase().equals("M") && !tGender.toUpperCase().equals("F"))
				{
					System.out.println("Invalid option was entered: " + tGender);
					System.out.println("\nPlease enter M or F");
				}
				else
				{
					break;
				}
			}
			
			tSpeciality = validNextString("Enter your training speciality: ");
			
			gymapi.addTrainer(new Trainer(tEmail, tName, tAddress, tGender, tSpeciality));
			System.out.println("\nNew Trainer added successfully!");
		}

	}
	
	//TODO #1 Member menu
	private int memberMenu()
	{
		System.out.println("+---------------------------+");
		System.out.println("+        Member Area        +");
		System.out.println("+---------------------------+");
		System.out.println("  1) View your proflie");
		System.out.println("  2) Update your profile");
		System.out.println("  3) View Progress Sub-Menus");
		System.out.println("  0) Exit");
		int option = validNextInt("==>> ");
		return option;
	}
	
	private void runMemberMenu(String personClass, Member member)
	{
		int option = memberMenu();
		while (option != 0)
		{
			switch (option)
			{
			case 1: System.out.println(member.toString());
			break;
			case 2: runMemberProfile(member);
			//break;
			//case 3: memberSubMenu();
			//break;
			default: System.out.println("Invalid option entered: " + option);
			break;
			}
			//pause the program so that the user can read what was printed to
			//the terminal window
			System.out.println("\nPress any key to continue...");
			input.nextLine();
			//display the main menu again
			option = memberMenu();
		}
		//The user chose option 0, so exit the program
		System.out.println("Exiting to login menu...");
		runMenu();
	}
	
	private int memberProfile(Member member)
	{
		System.out.println("+---------------------------+");
		System.out.println("+      Update Profile       +");
		System.out.println("+---------------------------+");
		System.out.println("  1) Update email");
		System.out.println("  2) Update name");
		System.out.println("  3) Update address");
		System.out.println("  4) Update gender");
		System.out.println("  5) Update height");
		System.out.println("  6) Update weight");
		if(member.getChosenPackage().contains("S"))
		{
			System.out.println("  7) Update Student Id");
			System.out.println("  8) Update College Name");
		}
		System.out.println("  9) Update package type");
		System.out.println("  0) Exit");
		int option = validNextInt("==>> ");
		return option;
	}
	
	private void runMemberProfile(Member member)
	{
		int option = memberProfile(member);
		while (option != 0)
		{
			switch (option)
			{
			case 1:
				String email = validNextString("\nEnter your E-mail address: ");		
				if(!email.matches("^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$"))
				{
					System.out.println("Error, please make sure email contains an @ and .");
				}
				else
				{
					member.setEmail(email);
					System.out.println("E-mail updated.");
				}
			break;
			case 2: 
				String name = validNextString("Enter your new name: ");
				if(!name.matches("^[ A-Za-z]+$"))
				{
					System.out.println("Error, please make sure name contains only letters and spaces.");
				}
				else
				{
					member.setName(name);
					System.out.println("Name updated.");
				}
			break;
			case 3: 
				String address = validNextString("Enter your Address: ");
				member.setAddress(address);
				System.out.println("Address updated.");
			break;
			case 4:
				String gender = validNextString("Enter your Gender: (M/F)");	
				if(!gender.toUpperCase().equals("M") && !gender.toUpperCase().equals("F"))
				{
					System.out.println("Error, please select M or F only.");
				}
				else
				{
					member.setGender(gender);
				}
				break;
			case 5:
				double height = validNextDouble("Enter your Height: ");
				if((height >= 1) && (height <=3))
				{
					member.setHeight(height);
					System.out.println("Height updated.");
				}
				else
				{
					System.out.println("Error, please enter a height between 1 and 3 metres.");
				}
			break;
			case 6:
				double weight = validNextDouble("Enter your Weight: ");
				if((weight >= 35) && (weight <= 250))
				{
					member.setHeight(weight);
					System.out.println("Weight updated");
				}
				else
				{
					System.out.println("Error, please enter a weight between 35 and 250 kgs.");
				}
			break;
			case 7:
				int studentId = validNextInt("Enter your Student Id: ");
				if((studentId >= 100001) && (studentId <= 999999))
				{
					//http://stackoverflow.com/questions/10021603/calling-a-subclass-method-from-superclass
					((StudentMember)member).setStudentId(studentId);
					System.out.println("Student Id updated.");
				}
				else
				{
					System.out.println("Error, please enter a number between 100001 and 999999");
				}
			break;
			case 8:
				String collegeName = validNextString("Please enter the name of your College? ");
				if(!collegeName.matches("^[ A-Za-z]+$"))
				{
					System.out.println("Error, please make sure college name contains only letters and spaces.");
				}
				else
				{
					//http://stackoverflow.com/questions/10021603/calling-a-subclass-method-from-superclass
					((StudentMember)member).setCollegeName(collegeName);
					System.out.println("College name updated");
				}
			break;
			case 9:
				String chosenPackage = validNextString("Is this membership a Premium or Student type membership? (P/S)");
				if(!chosenPackage.toUpperCase().equals("P") && !chosenPackage.toUpperCase().equals("S"))
				{
					System.out.println("Error, please select P or S only");
				}
				else if(chosenPackage.equals("P"))
				{//TODO fix this so it updates
					chosenPackage = "Premium Membership";
					member.setChosenPackage(chosenPackage);
					System.out.println("Chosen package updated");
				}
				else if(chosenPackage.equals("S"))
				{
					chosenPackage  = "Student Membership";
					member.setChosenPackage(chosenPackage);
					System.out.println("Chosen package updated");
				}
			break;
			}
				//pause the program so that the user can read what was printed to
				//the terminal window
				System.out.println("\nPress any key to continue...");
				input.nextLine();
				//display the main menu again
				option = memberProfile(member);
		}
			//The user chose option 0, so exit the program
			System.out.println("Exiting to Member menu...");
			runMemberMenu(null, member);
			
	}
	
	
	
	//TODO #2 Trainer Menu
	private void trainerMenu(String personClass, Person trainer)
	{
		
	}

}
