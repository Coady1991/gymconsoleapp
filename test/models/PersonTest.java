package models;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PersonTest 
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
	public void getEmail() throws Exception
	{
		assertEquals("pmember1@mail.com", pmember1.getEmail());
		assertEquals("pmember2@mail.com", pmember2.getEmail());
		assertEquals("pmember3@mail.com", pmember3.getEmail());
	}
	
	@Test
	public void getName() throws Exception
	{
		assertEquals("pmember1", pmember1.getName());
		assertEquals("pmember2", pmember2.getName());
		assertEquals("pmember3", pmember3.getName());
	}

	@Test
	public void getAddress() throws Exception
	{
		assertEquals("Waterford", pmember1.getAddress());
		assertEquals("Dublin", pmember2.getAddress());
		assertEquals("Cork", pmember3.getAddress());
	}
	
	@Test
	public void getGender() throws Exception
	{
		assertEquals("M", pmember1.getGender());
		assertEquals("M", pmember2.getGender());
		assertEquals("F", pmember3.getGender());
	}
	
	@Test
	public void setEmail() throws Exception
	{
		pmember1.setEmail("memberp1@mail.com");
		assertEquals("memberp1@mail.com", pmember1.getEmail());
		pmember2.setEmail("memberp2@mail.com");
		assertEquals("memberp2@mail.com", pmember2.getEmail());
		pmember3.setEmail("memberp3@mail.com");
		assertEquals("memberp3@mail.com", pmember3.getEmail());
	}
	
	@Test
	public void setName() throws Exception
	{
		//30 characters
		pmember1.setName("pmember11111111111111111111111");
		assertEquals("pmember11111111111111111111111", pmember1.getName());
		//31 characters
		pmember2.setName("pmember222222222222222222222220");
		assertEquals("pmember22222222222222222222222", pmember2.getName());
		//29 characters
		pmember3.setName("pmember3333333333333333333333");
		assertEquals("pmember3333333333333333333333", pmember3.getName());
	}
	
	@Test
	public void setAddress() throws Exception
	{
		pmember1.setAddress("Limerick");
		assertEquals("Limerick", pmember1.getAddress());
		pmember2.setAddress("Galway");
		assertEquals("Galway", pmember2.getAddress());
		pmember3.setAddress("Kerry");
		assertEquals("Kerry", pmember3.getAddress());
	}
	
	@Test
	public void setGender() throws Exception
	{
		pmember1.setGender("F");
		assertEquals("F", pmember1.getGender());
		pmember2.setGender("Y");
		assertEquals("M", pmember2.getGender());
		pmember3.setGender("");
		assertEquals("F", pmember3.getGender());
	}

}
