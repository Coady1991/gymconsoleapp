package models;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StudentMemberTest 
{
	private StudentMember smember1, smember2, smember3;

	@Before
	public void setUp() throws Exception
	{
		smember1 = new StudentMember("smember1@mail.com", "smember1", "Donegal", "M", 1.8, 80, "Student", 100001, "WIT");
		smember2 = new StudentMember("smember2@mail.com", "smember2", "Mayo", "M", 1.6, 90, "Student", 100002, "LIT");
		smember3 = new StudentMember("smember3@mail.com", "smember3", "Clare", "F", 1.7, 86, "Student", 100003, "CIT");
	}

	@After
	public void tearDown() throws Exception 
	{
		
	}
	@Test
	public void getChosenPackage() throws Exception
	{
		assertEquals("Student", smember1.getChosenPackage());
		assertEquals("Student", smember2.getChosenPackage());
		assertEquals("Student", smember3.getChosenPackage());
	}	

	@Test
	public void getStudentId() throws Exception
	{
		assertEquals(100001, smember1.getStudentId());
		assertEquals(100002, smember2.getStudentId());
		assertEquals(100003, smember3.getStudentId());
	}
	
	public void getCollegeName() throws Exception
	{
		assertEquals("WIT", smember1.getCollegeName());
		assertEquals("CIT", smember2.getCollegeName());
		assertEquals("LIT", smember3.getCollegeName());
		
	}
	
	@Test
	public void setStudentId() throws Exception
	{
		//Between 100001 and 999999
		smember1.setStudentId(500000);
		assertEquals(500000, smember1.getStudentId());
		//Below 100001
		smember2.setStudentId(000000);
		assertEquals(100002, smember2.getStudentId());
		//Above 999999
		smember3.setStudentId(1000000);
		assertEquals(100003, smember3.getStudentId());
	}
	
	@Test
	public void setCollegeName() throws Exception
	{
		smember1.setCollegeName("UCD");
		assertEquals("UCD", smember1.getCollegeName());
		smember2.setCollegeName("DCU");
		assertEquals("DCU", smember2.getCollegeName());
		smember3.setCollegeName("UCC");
		assertEquals("UCC", smember3.getCollegeName());
	}
}
