package co.com.choucair.certification.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestRegisterPage extends PageObject {
    public static final Target REGISTER_BUTTON = Target.the("button register")
            .located(By.xpath("//a[contains(text(), 'Join Today')]"));

    public static final Target INPUT_FIRST_NAME = Target.the("where do we write the first name")
            .located(By.id("firstName"));

    public static final Target INPUT_LAST_NAME = Target.the("where do we write the last name")
            .located(By.id("lastName"));

    public static final Target INPUT_EMAIL_ADDRESS = Target.the("where do we write the email")
            .located(By.id("email"));

    public static final Target SELECT_DATE_MONTH = Target.the("where do we write the month")
            .located(By.id("birthMonth"));

    public static final Target OPTION_DATE_MONTH = Target.the("where do we write the month")
            .located(By.xpath("//option[contains(text(), 'May')]"));

    public static final Target SELECT_DATE_DAY = Target.the("where do we write the day")
            .located(By.id("birthDay"));

    public static final Target OPTION_DATE_DAY = Target.the("where do we write the day")
            .located(By.xpath("//option[contains(text(), '15')]"));

    public static final Target SELECT_DATE_YEAR = Target.the("where do we write the year")
            .located(By.id("birthYear"));

    public static final Target OPTION_DATE_YEAR = Target.the("where do we write the year")
            .located(By.xpath("//option[contains(text(), '2000')]"));

    public static final Target NEXT_LOCATION = Target.the("next button")
            .located(By.xpath("//span[contains(text(), 'Next: Location')]"));

    public static final Target INPUT_CITY = Target.the("Enter the city")
            .located(By.id("city"));

    public static final Target INPUT_ZIP_CODE = Target.the("where do we write the zip code")
            .located(By.id("zip"));

    public static final Target SELECT_COUNTRY = Target.the("where do we write the country")
            .located(By.xpath("//span[contains(text(), 'Colombia')]"));

    public static final Target NEXT_DEVICES = Target.the("next button")
            .located(By.xpath("//span[contains(text(), 'Next: Devices')]"));

    //
    public static final Target NEXT_LAST_STEP = Target.the("Final button")
            .located(By.xpath("//span[contains(text(), 'Next: Last Step')]"));
    //

    public static final Target INPUT_PASSWORD1 = Target.the("where do we write the password")
            .located(By.id("password"));

    public static final Target INPUT_PASSWORD2 = Target.the("where do we write the confirmPassword")
            .located(By.id("confirmPassword"));

    public static final Target SELECT_TERMS = Target.the("where do we select the terms")
            .located(By.id("termOfUse"));

    public static final Target SELECT_PRIVACY = Target.the("where do we select the privacy")
            .located(By.id("privacySetting"));

    public static final Target BUTTON_REGISTER = Target.the("button register")
            .located(By.xpath("//span[contains(text(), 'Complete Setup')]"));
}
