package pagesObject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.logging.Logger;

@DefaultUrl("http://automationpractice.com/index.php")
public class AutomationPageObject extends PageObject {

    @FindBy(xpath = "//a[@class='login']")
    WebElementFacade btnLogin;

    @FindBy(xpath = "//*[@id='email_create']")
    WebElementFacade txtEmailCreate;

    @FindBy(xpath = "//button[@id='SubmitCreate']")
    WebElementFacade btnEmailCreate;

    @FindBy(xpath = "//input[@id='id_gender1']")
    WebElementFacade chkGenderMale;

    @FindBy(xpath = "//input[@id='customer_firstname']")
    WebElementFacade txtFirstName;

    @FindBy(xpath = "//input[@id='customer_lastname']")
    WebElementFacade txtLastName;

    @FindBy(xpath = "//input[@id='firstname']")
    WebElementFacade txtFirstNameYourAddress;

    @FindBy(xpath = "//input[@id='lastname']")
    WebElementFacade txtLastNameYourAddress;

    @FindBy(xpath = "//input[@id='email']")
    WebElementFacade txtEmailPersonalInformation;

    @FindBy(xpath = "//input[@id='passwd']")
    WebElementFacade txtPasswdPersonalInformation;

    @FindBy(xpath = "//div[@id='uniform-days']")
    WebElementFacade cmbDaysBirth;

    @FindBy(xpath = "//select[@id='days']/option[3]")
    WebElementFacade txtSelectDaysNum;

    @FindBy(xpath = "//div[@id='uniform-months']")
    WebElementFacade cmbMonthBirth;

    @FindBy(xpath = "//select[@id='months']/option[3]")
    WebElementFacade txtSelectMonthsOption;

    @FindBy(xpath = "//div[@id='uniform-years']")
    WebElementFacade cmbYearsBirth;

    @FindBy(xpath = "//select[@id='years']/option[26]")
    WebElementFacade txtSelectYearsOption;

    @FindBy(xpath = "//label[text()='Sign up for our newsletter!']")
    WebElementFacade txtNewsletter;

    @FindBy(xpath = "//label[text()='Receive special offers from our partners!']")
    WebElementFacade txtReceiveOffers;

    @FindBy(xpath = "//input[@id='company']")
    WebElementFacade txtCompany;

    @FindBy(xpath = "//input[@id='address1']")
    WebElementFacade txtAddress;

    @FindBy(xpath = "//input[@id='address2']")
    WebElementFacade txtAddressTwo;

    @FindBy(xpath = "//input[@id='city']")
    WebElementFacade txtCity;

    @FindBy(xpath = "//*[@id='uniform-id_state']")
    WebElementFacade selectState;

    @FindBy(xpath = "//*[@id='id_state']/option[3]")
    WebElementFacade selectStateOption;

    @FindBy(xpath = "//input[@id='postcode']")
    WebElementFacade txtPostalCode;

    @FindBy(xpath = "//div[@id='uniform-id_country']")
    WebElementFacade selectCountry;

    @FindBy(xpath = "//select[@id='id_country']/option[2]")
    WebElementFacade selectCountryOption;

    @FindBy(xpath = "//textarea[@id='other']")
    WebElementFacade txtAddInformation;

    @FindBy(xpath = "//input[@id='phone']")
    WebElementFacade txtHomePhone;

    @FindBy(xpath = "//input[@id='phone_mobile']")
    WebElementFacade txtMobilePhone;

    @FindBy(xpath = "//input[@id='alias']")
    WebElementFacade txtAliasReference;

    @FindBy(xpath = "//span[text()='Register']")
    WebElementFacade btnRegister;

    @FindBy(xpath = "//h1[@class='page-heading']")
    WebElementFacade labelWelcomeAccount;


    @FindBy(xpath = "//input[@id='email']")
    WebElementFacade txtEmailRegister;

    @FindBy(xpath = "//input[@id='passwd']")
    WebElementFacade txtPasswdRegister;

    @FindBy(xpath = "//button[@id='SubmitLogin']")
    WebElementFacade btnSignInRegister;

    @FindBy(xpath = "//ul[contains(@class,'active')]//a[contains(text(),'Faded Short Sleeve T-shirt')]")
    WebElementFacade txtProduct;


    @FindBy(xpath = "//span[text()='Add to cart']")
    WebElementFacade btnAddCart;

    @FindBy(xpath = "//span[contains(text(),'Proceed to checkout')]")
    WebElementFacade btnProceedChk;

    @FindBy(xpath = "//p//span[contains(text(),'Proceed to checkout')]")
    WebElementFacade btnProceedChkSummary;

    @FindBy(xpath = "//div[@class='checker']")
    WebElementFacade btnTermsService;


    @FindBy(xpath = "//a[@class='bankwire']")
    WebElementFacade txtBankWire;

    @FindBy(xpath = "//span[contains(text(),'I confirm my order')]")
    WebElementFacade btnConfirmOrder;

    @FindBy(xpath = "//p[@class='cheque-indent']")
    WebElementFacade txtOrderComplete;





    public void signIn() {
        btnLogin.click();
    }

    public void userEnterEmail(List<String> parameters) {
        txtEmailCreate.waitUntilVisible();
        txtEmailCreate.type(parameters.get(0));
    }

    public void sendCreateAccount() {
        btnEmailCreate.click();
    }


    public void fillsAllForm(List<String> parameters) {
        String firstName1=parameters.get(0);
        chkGenderMale.click();
        txtFirstName.sendKeys(firstName1);
        txtLastName.sendKeys(parameters.get(1));
        txtEmailPersonalInformation.type(parameters.get(2));
        txtPasswdPersonalInformation.sendKeys(parameters.get(3));
        cmbDaysBirth.waitUntilClickable();
        cmbDaysBirth.click();
        txtSelectDaysNum.click();
        cmbMonthBirth.click();
        txtSelectMonthsOption.click();
        cmbYearsBirth.click();
        txtSelectYearsOption.click();
        txtNewsletter.click();
        txtReceiveOffers.click();


        txtFirstNameYourAddress.sendKeys(parameters.get(0));
        txtLastNameYourAddress.sendKeys(parameters.get(1));
        txtCompany.sendKeys(parameters.get(4));
        txtAddress.sendKeys(parameters.get(5));
        txtAddressTwo.sendKeys(parameters.get(6));
        txtCity.sendKeys(parameters.get(7));
        selectState.click();
        selectStateOption.click();
        txtPostalCode.sendKeys(parameters.get(8));
        selectCountry.click();
        selectCountryOption.click();
        txtAddInformation.sendKeys(parameters.get(9));
        txtHomePhone.sendKeys(parameters.get(10));
        txtMobilePhone.sendKeys(parameters.get(11));
        txtAliasReference.type(parameters.get(12));
    }




    public void userRegister() {
        btnRegister.click();
    }


    public void verifyMyAccount(List<String> parameters) {

        String textToVerify = labelWelcomeAccount.getText();
        if (textToVerify.equals(parameters.get(0))) {
            Logger.getLogger("TEST SUCCESS");
        } else {
            Assert.fail("TEST FAILED");
        }
    }

    public void emailRegister(List<String> parameters) {
        txtEmailRegister.sendKeys(parameters.get(0));
    }


    public void enterPassword(List<String> parameters) {
        txtPasswdRegister.sendKeys(parameters.get(0));
    }



    public void selectProductoAddCart() {
        txtProduct.isVisible();
        Actions actions = new Actions(getDriver());
        actions.moveToElement(txtProduct).perform();
        btnAddCart.click();
    }

    public void clickOnPreceed() {
        btnProceedChk.isVisible();
        btnProceedChk.click();
        btnProceedChkSummary.click();
    }

    public void signInPayAuthentication(List<String> parameters) {
        txtEmailRegister.sendKeys(parameters.get(0));
        txtPasswdRegister.sendKeys(parameters.get(1));
    }

    public void clickSignInRegister() {
        btnSignInRegister.click();
    }

    public void goPaymentProduct() {
        btnProceedChkSummary.click();
        btnTermsService.click();
        btnProceedChkSummary.click();
        txtBankWire.click();
        btnConfirmOrder.click();

    }

    public void verifyMyOrder(List<String> parameters) {
        String textToVerify = txtOrderComplete.getText();
        if (textToVerify.equals(parameters.get(0))) {
            Logger.getLogger("TEST SUCCESS");
        } else {
            Assert.fail("TEST FAILED");
        }
    }
}
