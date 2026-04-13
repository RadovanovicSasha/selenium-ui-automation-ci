import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FailedLogPage extends BasePage {

    private final By usernameInput = By.id("username");
    private final By passwordInput = By.id("password");
    private final By loginButton = By.name("login");
    private final By errorMessage = By.cssSelector(".woocommerce-error");

    public FailedLogPage(WebDriver driver) {
        super(driver);
    }

    // stabilno otvaranje login stranice za CI
    public void openMyAccount() {
        driver.get("https://www.militaryshop.rs/moj-nalog/");
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

    public String getErrorText() {
        return driver.findElement(errorMessage).getText();
    }
}