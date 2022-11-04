import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

/**
 * Главная страница
 */


public class MainPage {

    public MainPage(String url) {
        Selenide.open(url);
    }

    private final SelenideElement logRegButton = $x("/html/body/div[3]/div/div[1]/a");
    private final SelenideElement regButton = $x("/html/body/div[4]/div/div/div[1]/form/div[1]/a");
    private final SelenideElement nameField = $x("/html/body/div[4]/div/div/div/form/div[2]/div[1]/input");
    private final SelenideElement phoneField = $x("/html/body/div[4]/div/div/div/form/div[2]/div[2]/input");
    private final SelenideElement passField = $x("/html/body/div[4]/div/div/div/form/div[2]/div[4]/input");
    private final SelenideElement okRegButton = $x("/html/body/div[4]/div/div/div/form/button");
    private final SelenideElement codeField = $x("/html/body/dialog/div[2]/div/div/form/div[2]/input");
    private final SelenideElement accountButton = $x("/html/body/div[3]/div/div[1]/div[2]/div/a");
    private final SelenideElement logOutButton = $x("/html/body/div[3]/div/div[1]/div[2]/div/div/div[2]/ul/li[6]/a");
    private final static String CODE = "9724";

    // Login
    private final SelenideElement phoneLog = $x("/html/body/div[4]/div/div/div[1]/form/div[2]/div[1]/input");
    private final SelenideElement passLog = $x("/html/body/div[4]/div/div/div[1]/form/div[2]/div[2]/input");
    private final SelenideElement okLog = $x("/html/body/div[4]/div/div/div[1]/form/button");
    private final SelenideElement closeMessage = $x("/html/body/dialog/div[1]/a");


    /**
     * Прохождение регистрации
     */


    public void registration(String name, String phone, String pass) throws InterruptedException {
        Thread.sleep(2000);
        logRegButton.click();
        Thread.sleep(2000);
        regButton.click();
        Thread.sleep(2000);
        nameField.click();
        Thread.sleep(2000);
        nameField.setValue(name);
        Thread.sleep(2000);
        phoneField.setValue(phone);
        Thread.sleep(2000);
        passField.setValue(pass);
        Thread.sleep(2000);
        okRegButton.click();
        Thread.sleep(2000);
        codeField.setValue(CODE);

    }


    /**
     * Вход в аккаунт
     */

    public void login(String phone, String pass) throws InterruptedException {
        Thread.sleep(2000);
        logRegButton.click();
        Thread.sleep(1000);
        phoneLog.setValue(phone);
        Thread.sleep(1000);
        passLog.setValue(pass);
        Thread.sleep(1000);
        okLog.click();

    }


    /**
     * Выход из аккаунта
     */

    public void logOut(String phone, String pass) throws InterruptedException{

        // need wait
        Thread.sleep(2000);
        logRegButton.click();
        Thread.sleep(1000);
        phoneLog.setValue(phone);
        Thread.sleep(1000);
        passLog.setValue(pass);
        Thread.sleep(1000);
        okLog.click();
        Thread.sleep(1000);
        closeMessage.click();

        accountButton.click();
        logOutButton.click();

    }
}