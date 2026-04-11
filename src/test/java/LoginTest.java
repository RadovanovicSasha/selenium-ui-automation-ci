import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginTest extends BaseTest {

    @Test
    public void metodalogovanja() {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.logovanje();

        System.out.println(driver.getCurrentUrl());
    }
}
