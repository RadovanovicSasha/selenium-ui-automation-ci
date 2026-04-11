import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.assertTrue;

public class FailedLogTest extends BaseTest {

    @Test
    public void loginWithNoValidCredentialsTest() {

        FailedLogPage failedLogPage = new FailedLogPage(driver);

        failedLogPage.openMyAccount();
        failedLogPage.enterUsername("mojikredencijali");
        failedLogPage.enterPassword("nekasifra");
        failedLogPage.clickLogin();
        System.out.println(failedLogPage.getErrorText());
        System.out.println(driver.getCurrentUrl());

    }
}