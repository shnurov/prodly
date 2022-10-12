import com.codeborne.selenide.SelenideElement;
import org.junit.Assert;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.$x;

public class LogOutTest {
    private final static String BASE_URL = "https://stage.prodly.ru";
    private final static String PHONE = "79673784120";
    private final static String PASS = "12345";

    private final SelenideElement finishLogMessage = $x("/html/body/div[3]/div/div[1]/div[2]/div/a");

    private final static String ENTR = "Личный";

    @Test
    public void logOutTest() throws InterruptedException {

        MainPage mainPage = new MainPage(BASE_URL);
        mainPage.logOut(PHONE, PASS);

        Assert.assertFalse(finishLogMessage.getOwnText().contains(ENTR));
    }
}
