package proj.tests;

//import junit.framework.Assert;
import proj.props.*;
import org.junit.Test;
import org.junit.Assert;

public class TestMethods {
	
	@Test
	public void isCorrectTriangleTest() {
		
		MyTriangle testTriangleProps = new MyTriangle();
		
		boolean isTrue = testTriangleProps.isCorrectTriangle(3, 4, 6);
		if (!isTrue) Assert.fail();
		
	}
	
	@Test
	public void isRectTriangleTest() {
		
		MyTriangle testTriangleProps = new MyTriangle();
		
		boolean isTrue2 = testTriangleProps.isRectTriangle(3, 4, 5);
		if (!isTrue2) Assert.fail();
		
	}

}
