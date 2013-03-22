package triangle;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

/**
 * TriangleTest for testing the Triangle class.
 * This template is used in the exercise phase 1.
 * Students should add relevant unit test cases related to the Triangle 
 * class to this class.
 */
public class TriangleTest
{
	
	private Triangle eqiliteralTriangle;
	private Triangle aboveEqiliteralTriangle;
	private Triangle belowEqiliteralTriangle;
	private Triangle isoscelesTriangle;
	private Triangle aboveIsoscelesTriangle;
	private Triangle belowIsoscelesTriangle;
	private Triangle scaleneTriangle;
	private Triangle notScaleneTriangle;
	private Triangle rightAngledTriangle;
	private Triangle aboveRightAngledTriangle;
	private Triangle belowRightAngledTriangle;
	private Triangle impossibleLBTriangle;
	private Triangle notImpossibleALBTriangle;
	private Triangle impossibleUBTriangle;
	private Triangle notImpossibleBUBTriangle;
	
	@Before
	public void setUp()
	{
		eqiliteralTriangle = new Triangle(200,200,200);
		aboveEqiliteralTriangle = new Triangle(201,200,200);
		belowEqiliteralTriangle = new Triangle(199,200,200);
		isoscelesTriangle = new Triangle(300,300,200);
		aboveIsoscelesTriangle = new Triangle(300,200,201);
		belowIsoscelesTriangle = new Triangle(300,200,199);
		scaleneTriangle = new Triangle(199,200,201);
		notScaleneTriangle = new Triangle(200,200,201);
		rightAngledTriangle = new Triangle(300,400,500);
		aboveRightAngledTriangle = new Triangle(300,400,499);
		belowRightAngledTriangle = new Triangle(300,400,501);
		impossibleLBTriangle = new Triangle(0,200,200);
		notImpossibleALBTriangle = new Triangle(1,200,200);
		impossibleUBTriangle = new Triangle(300,400,700);
		notImpossibleBUBTriangle = new Triangle(300,400,699);
		
	}

	/**
	 * Cleanup method. The JUnit framework automatically invokes
	 * this method after each test is run.
	 */
	@After	
	public void tearDown()
	{
		rightAngledTriangle = null;
	}

	@Test
	public void testGetSideLengths()
	{
		assertEquals("Should return '300,400,500'", "300,400,500", rightAngledTriangle.getSideLengths());
	}
	
	@Test
	public void testSetSideLengths()
	{
		rightAngledTriangle.setSideLengths(100, 200, 250);
		assertEquals("Should return '100,200,250'", "100,190,250", rightAngledTriangle.getSideLengths());
	}
	@Test
	public void testGetPerimiter()
	{
		assertEquals("Should return '1200'", 1200, rightAngledTriangle.getPerimeter());
	}
	//@Test
	//public void testGetPerimiterUB()
	//{
	//	assertEquals("Should return '-1'", -1, impossibleUBTriangle.getPerimeter());
	//}
	//@Test
	//public void testGetPerimiterLB()
	//{
	//	assertEquals("Should return '-1'", -1, impossibleLBTriangle.getPerimeter());
	//}
	
	//@Test
	//public void testGetArea()
	//{
	//	assertEquals("Should return '60000.0'", 60000.0, rightAngledTriangle.getArea(), 0.1);
	//}
	//@Test
	//public void testGetAreaUB()
	//{
	//		assertEquals("Should return '-1.0'", -1.0, impossibleUBTriangle.getArea(), 0.1);
	//}
	@Test
	public void testGetAreaLB()
	{
		assertEquals("Should return '-1.0'", -1.0, impossibleLBTriangle.getArea(), 0.1);
	}
	@Test
	public void testClassifyEqi()
	{
		assertEquals("Should return 'equilateral'", "equilaterall", eqiliteralTriangle.classify());
	}
	@Test
	public void testClassifyEqiUB()
	{
		assertNotSame("Should not return 'equilateral'", "equilateral", aboveEqiliteralTriangle.classify());
	}
	@Test
	public void testClassifyEqiLB()
	{
		assertNotSame("Should not return 'equilateral'", "equilateral", belowEqiliteralTriangle.classify());
	}
	//@Test	
	//public void testClassifyIso()
	//{
	//	assertEquals("Should return 'isosceles'", "isosceles", isoscelesTriangle.classify());
	//}
	@Test
	public void testClassifyIsoUB()
	{
		assertNotSame("Should not return 'isosceles'", "isosceles", aboveIsoscelesTriangle.classify());
	}
	@Test
	public void testClassifyIsoLB()
	{
		assertNotSame("Should not return 'isosceles'", "isosceles", belowIsoscelesTriangle.classify());
	}
	@Test
	public void testClassifyRightAngled()
	{
		assertEquals("Should return 'right-angled'", "right-angled", rightAngledTriangle.classify());
	}
	@Test
	public void testClassifyRightAngledUB()
	{
		assertNotSame("Should not return 'right-angled'", "right-angled", aboveRightAngledTriangle.classify());
	}
	@Test
	public void testClassifyRightAngledLB()
	{
		assertNotSame("Should not return 'right-angled'", "right-angled", belowRightAngledTriangle.classify());
	}
	@Test
	public void testClassifyScaleneTriangle()
	{
		assertEquals("Should return 'scalene'", "scalene", scaleneTriangle.classify());
	}
	@Test
	public void testClassifyNotScaleneTriangle()
	{
		assertNotSame("Should not return 'scalene'", "scalene", notScaleneTriangle.classify());
	}
	@Test
	public void testClassifyImpossibleLB()
	{
		assertEquals("Should return 'impossible'", "impossible", impossibleLBTriangle.classify());
	}
	//@Test
	//public void testClassifyImpossibleUB()
	//{
	//	assertEquals("Should return 'impossible'", "impossible", impossibleUBTriangle.classify());
	//}
	@Test
	public void testClassifyNotImpossibleBUB()
	{
		assertNotSame("Should not return 'impossible'", "impossible", notImpossibleBUBTriangle.classify());
	}
	@Test
	public void testClassifyNotImpossibleALB()
	{
		assertNotSame("Should not return 'impossible'", "impossible", notImpossibleALBTriangle.classify());
	}

	
	/**
	 * Test whether the triangle specified in the fixture (setUp) 
	 * is right-angled. 	
	 */
	@Test
	public void testIsRightAngledTrue()
	{
		assertTrue("Should be true", rightAngledTriangle.isRightAngled());
	}
	@Test
	public void testIsRightAngledFalseAbove()
	{
		assertFalse("Should be false", aboveRightAngledTriangle.isRightAngled());
	}
	@Test
	public void testIsRightAngledBelow()
	{
		assertFalse("Should be false'", belowRightAngledTriangle.isRightAngled());
	}
	
	@Test
	public void testIsIsoTrue()
	{
		assertTrue("Should be true", isoscelesTriangle.isIsosceles());
	}
	@Test
	public void testIsIsoFalseAbove()
	{
		assertFalse("Should be false", aboveIsoscelesTriangle.isIsosceles());
	}
	@Test
	public void testIsIsoBelow()
	{
		assertFalse("Should be false'", belowIsoscelesTriangle.isIsosceles());
	}
	
	
	@Test
	public void testIsEqiTrue()
	{
		assertTrue("Should be true", eqiliteralTriangle.isEquilateral());
	}
	@Test
	public void testIsEqiFalseAbove()
	{
		assertFalse("Should be false", aboveEqiliteralTriangle.isEquilateral());
	}
	@Test
	public void testIsEqiBelow()
	{
		assertFalse("Should be false'", belowEqiliteralTriangle.isEquilateral());
	}
	
	@Test
	public void testIsScaleneTrue()
	{
		assertTrue("Should be true", scaleneTriangle.isScalene());
	}
	@Test
	public void testIsScaleneFalse()
	{
		assertFalse("Should be false", notScaleneTriangle.isScalene());
	}
	
	@Test
	public void testIsImpossibleFalseALB()
	{
		assertFalse("Should be false", notImpossibleALBTriangle.isImpossible());
	}
	@Test
	public void testIsImpossibleFalseBUB()
	{
		assertFalse("Should be false", notImpossibleBUBTriangle.isImpossible());
	}
	//@Test
	//public void testIsImpossibleTrueUB()
	//{
	//	assertTrue("Should be true'", impossibleUBTriangle.isImpossible());
	//}
	@Test
	public void testIsImpossibleTrueLB()
	{
		assertTrue("Should be true", impossibleLBTriangle.isImpossible());
	}
}
