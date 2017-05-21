package models;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PremiumMemberTest 
{
	
	private PremiumMember pmember1, pmember2, pmember3;

	@Before
	public void setUp() throws Exception 
	{
		pmember1 = new PremiumMember("pmember1@mail.com", "pmember1", "Waterford", "M", 1.80, 82, "Premium");
		pmember2 = new PremiumMember("pmember2@mail.com", "pmember2", "Dublin", "M", 1.75, 90, "Premium");
		pmember3 = new PremiumMember("pmember3@mail.com", "pmember3", "Cork", "F", 1.60, 72, "Premium");
	}

	@After
	public void tearDown() throws Exception 
	{
		
	}
	
	@Test
	public void getChosenPackage() throws Exception
	{
		assertEquals("Premium", pmember1.getChosenPackage());
		assertEquals("Premium", pmember2.getChosenPackage());
		assertEquals("Premium", pmember3.getChosenPackage());
	}	
}
