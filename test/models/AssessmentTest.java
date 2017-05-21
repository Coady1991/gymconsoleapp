package models;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AssessmentTest {
	
	private Assessment assessment1, assessment2, assessment3;
	private Trainer trainer1, trainer2, trainer3;

	@Before
	public void setUp() throws Exception 
	{
		assessment1 = new Assessment(80, 40, 20, 10, 30, 45, "Well done", trainer1);
		assessment2 = new Assessment(81, 41, 21, 11, 31, 46, "Keep working", trainer2);
		assessment3 = new Assessment(82, 42, 22, 12, 32, 47, "Good work", trainer3);
	}

	@After
	public void tearDown() throws Exception 
	{
		
	}
	
	@Test
	public void getWeight() throws Exception
	{
		assertEquals(80, assessment1.getWeight(), 0);
		assertEquals(81, assessment2.getWeight(), 0);
		assertEquals(82, assessment3.getWeight(), 0);
		
	}
	
	@Test
	public void getChest() throws Exception
	{
		assertEquals(40, assessment1.getChest(), 0);
		assertEquals(41, assessment2.getChest(), 0);
		assertEquals(42, assessment3.getChest(), 0);
	}
	
	@Test
	public void getThigh() throws Exception
	{
		assertEquals(20, assessment1.getThigh(), 0);
		assertEquals(21, assessment2.getThigh(), 0);
		assertEquals(22, assessment3.getThigh(), 0);
	}
	
	@Test
	public void getUpperArm() throws Exception
	{
		assertEquals(10, assessment1.getUpperArm(), 0);
		assertEquals(11, assessment2.getUpperArm(), 0);
		assertEquals(12, assessment3.getUpperArm(), 0);
	}
	
	@Test
	public void getWaist() throws Exception
	{
		assertEquals(30, assessment1.getWaist(), 0);
		assertEquals(31, assessment2.getWaist(), 0);
		assertEquals(32, assessment3.getWaist(), 0);
	}
	
	@Test
	public void getHips() throws Exception
	{
		assertEquals(45, assessment1.getHips(), 0);
		assertEquals(46, assessment2.getHips(), 0);
		assertEquals(47, assessment3.getHips(), 0);
	}
	
	@Test
	public void getComment() throws Exception
	{
		assertEquals("Well done", assessment1.getComment());
		assertEquals("Keep working", assessment2.getComment());
		assertEquals("Good work", assessment3.getComment());
	}
	
	@Test
	public void getTrainer() throws Exception
	{
		assertEquals(trainer1, assessment1.getTrainer());
		assertEquals(trainer2, assessment2.getTrainer());
		assertEquals(trainer3, assessment3.getTrainer());
	}
	
	@Test
	public void setWeight() throws Exception
	{
		assessment1.setWeight(90);
		assertEquals(90, assessment1.getWeight(), 0);
		assessment2.setWeight(91);
		assertEquals(91, assessment2.getWeight(), 0);
		assessment3.setWeight(92);
		assertEquals(92, assessment3.getWeight(), 0);
	}
	
	@Test
	public void setChest() throws Exception
	{
		assessment1.setChest(43);
		assertEquals(43, assessment1.getChest(), 0);
		assessment2.setChest(44);
		assertEquals(44, assessment2.getChest(), 0);
		assessment3.setChest(45);
		assertEquals(45, assessment3.getChest(), 0);
	}
	
	@Test
	public void setThigh() throws Exception
	{
		assessment1.setThigh(23);
		assertEquals(23, assessment1.getThigh(), 0);
		assessment2.setThigh(24);
		assertEquals(24, assessment2.getThigh(), 0);
		assessment3.setThigh(25);
		assertEquals(25, assessment3.getThigh(), 0);
	}
	
	@Test
	public void setUpperArm() throws Exception
	{
		assessment1.setUpperArm(13);
		assertEquals(13, assessment1.getUpperArm(), 0);
		assessment2.setUpperArm(14);
		assertEquals(14, assessment2.getUpperArm(), 0);
		assessment3.setUpperArm(15);
		assertEquals(15, assessment3.getUpperArm(), 0);
	}
	
	@Test
	public void setWaist() throws Exception
	{
		assessment1.setWaist(33);
		assertEquals(33, assessment1.getWaist(), 0);
		assessment2.setWaist(34);
		assertEquals(34, assessment2.getWaist(), 0);
		assessment3.setWaist(35);
		assertEquals(35, assessment3.getWaist(), 0);
	}
	
	@Test
	public void setHips() throws Exception
	{
		assessment1.setHips(48);
		assertEquals(48, assessment1.getHips(), 0);
		assessment2.setHips(49);
		assertEquals(49, assessment2.getHips(), 0);
		assessment3.setHips(50);
		assertEquals(50, assessment3.getHips(), 0);
	}
	
	@Test
	public void setComment() throws Exception
	{
		assessment1.setComment("Good stuff");
		assertEquals("Good stuff", assessment1.getComment());
		assessment2.setComment("Good session");
		assertEquals("Good session", assessment2.getComment());
		assessment3.setComment("Brilliant");
		assertEquals("Brilliant", assessment3.getComment());
		
	}
	
	@Test
	public void setTrainer() throws Exception
	{
		assessment1.setTrainer(trainer3);
		assertEquals(trainer3, assessment1.getTrainer());
		assessment2.setTrainer(trainer1);
		assertEquals(trainer1, assessment2.getTrainer());
		assessment3.setTrainer(trainer2);
		assertEquals(trainer2, assessment3.getTrainer());
	}
}
