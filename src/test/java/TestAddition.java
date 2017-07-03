import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.Addition;

public class TestAddition {

	Addition obj;

	@Before
	public void init() {
		obj = new Addition();
	}

	@Test
	public void testAddition() {

		System.out.println("Test about to start....");
		int result = obj.add(10, 20);
		Assert.assertTrue("add not working", result == 30);
	}
}
