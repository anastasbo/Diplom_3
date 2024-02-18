package praktikum;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static com.codeborne.selenide.WebDriverRunner.setWebDriver;

public class TestBase {

    public void optionBrowser(String browser) {
        if ("yandex".equals(browser)) {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
            Configuration.browser = "chrome";
            ChromeOptions options = new ChromeOptions();
            options.setBinary("/Applications/Yandex.app/Contents/MacOS/Yandex");
            WebDriver webDriver = new ChromeDriver(options);
            setWebDriver(webDriver);
        }
    }
}
