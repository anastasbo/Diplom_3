package praktikum.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.junit.Assert;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static org.hamcrest.Matchers.containsString;

public class MainPage {
    //TODO переделать локатор конструктора
    private final SelenideElement constructorButton = $(byXpath(".//p[text() = 'Конструктор']"));
    private final SelenideElement loginButtonMainPage = $(byXpath("//button[text()='Войти в аккаунт']"));
    private final SelenideElement personalAccountButton = $(byXpath(".//p[text()='Личный Кабинет']"));
    private final SelenideElement checkoutButton = $(byXpath(".//button[text() = 'Оформить заказ']"));
    private final SelenideElement burgerConstructorLabel = $(byXpath(".//h1[text() = 'Соберите бургер']"));
    private final SelenideElement sauceButton = $(byXpath(".//span[text() = 'Соусы']"));
    private final SelenideElement bunButton = $(byXpath(".//span[text() = 'Булки']"));
    private final SelenideElement ingredientsButton = $(byXpath(".//span[text() = 'Начинки']"));
    private final SelenideElement fluorescentPageActive = $(byXpath("//*[@id=\"root\"]/div/main/section[1]/div[1]/div[1]"));
    private final SelenideElement ingredientsPageActive = $(byXpath("//*[@id=\"root\"]/div/main/section[1]/div[1]/div[3]"));
    private final SelenideElement saucePageActive = $(byXpath("//*[@id=\"root\"]/div/main/section[1]/div[1]/div[2]"));
    private final SelenideElement enterText = $(byXpath(".//h2[text() = 'Вход']"));

    @Step("нажать на кнопку Булки")
    public MainPage clickBunButton() {
        sauceButton.click();
        bunButton.click();
        return this;
    }
    @Step("нажать на кнопку Соусы")
    public MainPage clickSauceButton() {
        sauceButton.click();
        return this;
    }
    @Step("нажать на кнопку Соусы")
    public MainPage clickIngredientsButton() {
        ingredientsButton.click();
        return this;
    }
    @Step("Нажать на кнопку личного кабинет")
    public MainPage clickPersonalAccountButton() {
        personalAccountButton.click();
        return this;
    }
    @Step("Проверка перехода на страницу входа")
    public MainPage checkLoginPage() {
        Assert.assertThat(enterText.getText(), containsString("Вход"));
        return this;
    }
    @Step("Проверка перехода на вкладку Булки")
    public MainPage checkingTransitionToBun() {
        Assert.assertThat(fluorescentPageActive.getAttribute("class"), containsString("tab_tab_type_current__2BEPc"));
        return this;
    }
    @Step("Проверка перехода на вкладку Булки")
    public MainPage checkingTransitionToSauce() {
        Assert.assertThat(saucePageActive.getAttribute("class"), containsString("tab_tab_type_current__2BEPc"));
        return this;
    }
    @Step("Проверка перехода на вкладку Булки")
    public MainPage checkingTransitionToIngredients() {
        Assert.assertThat(ingredientsPageActive.getAttribute("class"), containsString("tab_tab_type_current__2BEPc"));
        return this;
    }
}
