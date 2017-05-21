package models;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TrainerTest 
{
	private Trainer trainer1, trainer2, trainer3;
	

	@Before
	public void setUp() throws Exception 
	{
		trainer1 = new Trainer("trainer1@mail.com", "trainer1", "Tramore", "M", "Strength");
		trainer2 = new Trainer("trainer2@mail.com", "trainer2", "Waterford", "M", "Cardio");
		trainer3 = new Trainer("trainer3@mail.com", "trainer3", "Butlerstown", "F", "Pilates");
	}

	@After
	public void tearDown() throws Exception 
	{
		
	}
	
	@Test
	public void getSpeciality() throws Exception
	{
		assertEquals("Strength", trainer1.getSpeciality());
		assertEquals("Cardio", trainer2.getSpeciality());
		assertEquals("Pilates", trainer3.getSpeciality());
	}
	
	

	

}
