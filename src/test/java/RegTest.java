
import com.codeborne.selenide.SelenideElement;
import org.junit.Test;
import org.junit.Assert;
import static com.codeborne.selenide.Selenide.$x;

public class RegTest extends BaseTest {

    private final static String BASE_URL = "https://stage.prodly.ru";
    private final static String NAME = "Ivan";
    private final static String PHONE = "79673784120";
    private final static String PASS = "12345";
    private final static String ENTR = "Личный";
    private final SelenideElement finishRegMessage = $x("/html/body/div[3]/div/div[1]/div[2]/div/a/span");

    @Test
    public void registrationTest() throws InterruptedException {

        MainPage mainPage = new MainPage(BASE_URL);
        mainPage.registration(NAME, PHONE, PASS);
        Thread.sleep(2000);
        Assert.assertTrue(finishRegMessage.getOwnText().contains(ENTR));

   }
}
