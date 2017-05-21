package models;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MemberTest 
{
	private PremiumMember pmember1, pmember2, pmember3;
	private Assessment assessment1, assessment2, assessment3;

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
	public void getHeight() throws Exception
	{
		assertEquals(1.80, pmember1.getHeight(), 0);
		assertEquals(1.75, pmember2.getHeight(), 0);
		assertEquals(1.60, pmember3.getHeight(), 0);
	}

	@Test
	public void getStartingWeight() throws Exception
	{
		assertEquals(82.0, pmember1.getStartingWeight(), 0);
		assertEquals(90.0, pmember2.getStartingWeight(), 0);
		assertEquals(72.0, pmember3.getStartingWeight(), 0);
	}

	@Test 
	public void setHeight() throws Exception
	{
		//Between 1 and 3
		pmember1.setHeight(2.0);
		assertEquals(2.0, pmember1.getHeight(), 0);
		//Below 1
		pmember2.setHeight(0.9);
		assertEquals(1.75, pmember2.getHeight(), 0);
		//Above 3
		pmember3.setHeight(3.1);
		assertEquals(1.60, pmember3.getHeight(), 0);
	}
	
	@Test
	public void setStartingWeight() throws Exception
	{
		//Between 35 and 250
		pmember1.setStartingWeight(100.0);
		assertEquals(100.0, pmember1.getStartingWeight(), 0);
		//Below 35
		pmember2.setStartingWeight(34);
		assertEquals(90.0, pmember2.getStartingWeight(), 0);
		//Above 250
		pmember3.setStartingWeight(251);
		assertEquals(72.0, pmember3.getStartingWeight(), 0);
	}

}
