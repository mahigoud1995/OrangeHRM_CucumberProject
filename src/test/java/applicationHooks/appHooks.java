package applicationHooks;

import com.OrangeHRM.TestBase.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class appHooks extends BaseClass{
	public appHooks() throws Exception{
		super();
	}

	@Before
	public void initializationApplication() {
		Initialization();
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}

}
