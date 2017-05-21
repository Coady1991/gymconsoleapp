package controllers;

import models.*;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GymApiTest 
{
	private GymApi gymapi;
	private PremiumMember pmember1;
	private StudentMember smember1;
	private Trainer trainer1;
	private Assessment assessment1, assessment2;

	@Before
	public void setUp() throws Exception 
	{
		pmember1 = new PremiumMember("pmember1@mail.com", "pmember1", "Waterford", "M", 1.80, 82, "Premium");
		smember1 = new StudentMember("smember1@mail.com", "smember1", "Donegal", "M", 1.8, 80, "Student", 100001, "WIT");
		trainer1 = new Trainer("trainer1@mail.com", "trainer1", "Tramore", "M", "Strength");
		assessment1 = new Assessment(80, 40, 20, 10, 30, 45, "Well done", trainer1);
		assessment2 = new Assessment(81, 41, 21, 11, 31, 46, "Keep working", trainer1);
		gymapi = new GymApi();
	}

	@After
	public void tearDown() throws Exception {
	}

	

}
