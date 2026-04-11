import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FailedLogPage extends BasePage {

    private final By myAccountLink = By.cssSelector("a[href*='moj-nalog']");
    private final By usernameInput = By.id("username");
    private final By passwordInput = By.id("password");
    private final By loginButton   = By.name("login");
    private final By errorMessage = By.cssSelector(".woocommerce-error");

    public FailedLogPage(WebDriver driver) {
        super(driver);
    }

    public void openMyAccount() {
        driver.findElement(myAccountLink).click();
    }

    public void enterUsername(String username) {
        driver.findElement(usernameInput).clear();
        driver.findElement(usernameInput).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordInput).clear();
        driver.findElement(passwordInput).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }

    // Getter za error
    public String getErrorText() {
        return driver.findElement(errorMessage).getText();
    }
}
