package TestBDD.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class HomePage extends BasePage {
    @FindBy(how = How.XPATH, using = "//*[@id=\"user_info\"]/a")
    WebElement logIn;
    @FindBy(how = How.ID, using = "iqitcookielaw-accept")
    WebElement getCookieConfirmation;
    @FindBy(how = How.ID, using = "field-email")
    WebElement emailInput;
    @FindBy(how = How.ID, using = "field-password")
    WebElement passwordInput;

    @FindBy(how = How.ID_OR_NAME, using = "submit-login")
    WebElement loginButton;

    @FindBy(how = How.CSS, using = "h1[class='h1 page-title'] span")
    WebElement welcomeInscriptionIsVisible;


    public void openHomePage() {
        String HOMEPAGE_URL = "https://goryszanka.com/";
        driver.get(HOMEPAGE_URL);
    }
    public void clickLogIn() {
        logIn.click();
    }


    public void clickCookieConfirmation(){
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(getCookieConfirmation));
        getCookieConfirmation.click();
    }
    public void inputEmail(String name) {
        emailInput.clear();
        emailInput.sendKeys(name);
    }
    public void inputPassword(String password) {
        passwordInput.clear();
        passwordInput.sendKeys(password);
    }
    public void clickLoginButton() {
        loginButton.click();
    }
    public String welcomeInscriptionIsVisible() {
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(welcomeInscriptionIsVisible));
        String message = welcomeInscriptionIsVisible.getText();
        System.out.println(message);
        return message;
    }
    public void waitForLoginButton() {
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(loginButton));
    }





}


