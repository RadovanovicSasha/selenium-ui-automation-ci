import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {


    // LOKATORI:
    private final By myAccountLink = By.cssSelector("a[href*='moj-nalog']");
    private final By usernameInput = By.id("username");
    private final By passwordInput = By.id("password");
    private final By loginButton   = By.name("login");

    // PROSLEĐUJEMO DRIVER (ka BasePage) - POM KONSTRUKTOR
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    // BIZNIS METODA:

    public void logovanje() {
        driver.findElement(myAccountLink).click();
        driver.findElement(usernameInput).clear();
        driver.findElement(usernameInput).sendKeys("radovanovicsasha@yahoo.com");
        driver.findElement(passwordInput).clear();
        driver.findElement(passwordInput).sendKeys("skolskimilitari");
        driver.findElement(loginButton).click();
    }
}
