package saucedemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class homepage {
	
	@Test
	public void homepage()
	{
		Assert.assertEquals("a", "b");
		System.out.println("second class executed");
	}

}
