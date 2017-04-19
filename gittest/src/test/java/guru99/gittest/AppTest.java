package guru99.gittest;

import org.openqa.selenium.chrome.ChromeDriver;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.openqa.selenium.WebDriver;


/**
 * Unit test for simple App.
 */
public class AppTest {
	protected WebDriver driver;

	public void guru99tutorials() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 String eTitle = "Meet Guru99";
		 String aTitle="";
		 driver.get("http://www.guru99.com");
		 driver.manage().window().maximize();
		 aTitle=driver.getTitle();
		 if(aTitle.contentEquals(eTitle)) {
			 System.out.println("Test is passed"); 
		 }
		 else {
			 System.out.println("Test is failed"); 
		 }
		 driver.close();
	}
	/*

     * Create the test case
     *
     * @param testName name of the test case

    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
 
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)

    public void testApp()
    {
        assertTrue( true );
    }
	*/
}
