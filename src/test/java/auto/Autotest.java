package auto;

import org.testng.annotations.Test;

import base.BaseClass;

public class Autotest extends BaseClass{
	@Test
	public void test() {
		homePage.autoStep();
	}

}
