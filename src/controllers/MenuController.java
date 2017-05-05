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
 * @version 1.01 05/05/2017
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
			memberMenu(personClass, gymapi.searchMembersByEmail(loginEmail));
		}
		else if(personClass.contains("T") && gymapi.searchTrainersByEmail(loginEmail) != null)
		{
			trainerMenu(personClass, gymapi.searchTrainersByEmail(loginEmail));
		}
		else
		{
			System.out.println("You entered and invalid email: " + loginEmail +
					           "\nReturning to login menu!");
		}
	}
	
	private void register()
	{
		
	}
	//TODO #1 Register menu
	
	//TODO #2 member or trainer
	
	//TODO #3 Member menu
	private void memberMenu(String personClass, Member member)
	{
		System.out.println();
	}
	
	//TODO #4 Trainer Menu
	private void trainerMenu(String personClass, Person trainer)
	{
		
	}

}
