package lazada.vn.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import lazada.vn.base.TestBase;
import lazada.vn.pages.HomePage;
import lazada.vn.pages.LoginPage;

public class HomePageTest extends TestBase{
	
	HomePage homePage;
	LoginPage loginPage;
	
	public HomePageTest() throws IOException{
		
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		
		initialization();
		homePage = new HomePage();
		
	}
	
	@AfterMethod
	public void tearDown(){
		
		//driver.quit();
	}
	
	@Test(priority = 2)
	public void checkTitleHomePageTest(){
		
		String checkTitleHP = homePage.checkTitleHomePage();
		Assert.assertEquals(checkTitleHP, "Shopping online - Buy online on Lazada.vn");
		
	}
	
	@Test(priority = 1)
	public void searchProductWithKeywordTest(){
		
		homePage.searchProductWithKeyword();
		
	}

}
