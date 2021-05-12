package seleniumtests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.FormsPage;
import pages.MainPage;

class DemoTest extends BaseTest {

    MainPage mainPage = new MainPage(driver);
    FormsPage formsPage = new FormsPage(driver);

    @Test
    void start() {
        Assertions.assertEquals("ToolsQA", driver.getTitle());
    }

    @Test
    void goToRegistrationForm() throws InterruptedException {
        mainPage.clickOnFormsElement();
        formsPage.clickOnPracticeForm();
        formsPage.fillInName("MojeIme", "MojePrezime");
        formsPage.enterEmail("mojemail@email.com");
        formsPage.chooseFemaleGender();
        formsPage.enterPhoneNumber("0631457892");
        formsPage.selectYourDateOfBirth();
        formsPage.chooseHobbies();
        formsPage.enterAddress("Knez Mihajlova 100");
        formsPage.chooseStateAndCity();
        formsPage.clickOnSubmit();
        Assertions.assertTrue(formsPage.isFormIsSubmittedMessageDisplayed(), "Form is not properly submitted");
        // this thread sleep is only to see the final state of web page before closing the browser
        // this is used only while practising
        Thread.sleep(5000);
    }
}
