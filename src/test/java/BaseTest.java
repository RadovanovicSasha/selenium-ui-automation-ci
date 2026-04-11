import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {

    protected WebDriver driver;

    @BeforeEach
    public void setup() {
        ChromeOptions options = new ChromeOptions();

        // Headless samo na GitHub Actions
        if (System.getenv("GITHUB_ACTIONS") != null) {
            options.addArguments("--headless=new");
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-dev-shm-usage");
        }

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.militaryshop.rs/");
        System.out.println("Entered successfully on testing web-site");
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
//import org.junit.jupiter.api.*;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class BaseTest {
//
//    protected WebDriver driver;
//
//    @BeforeEach
//    public void setUp() {
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://www.militaryshop.rs/");
//        System.out.println("Entered succesfully on testing web-site");
//    }
//
//    @AfterEach
//    public void tearDown() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }
//}