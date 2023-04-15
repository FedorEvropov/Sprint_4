package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {
    public MainPage(WebDriver driver) {
        MainPage.driver = driver;
    }
    private static WebDriver driver;
    //Локаторы
    //Кнопка принять куки
    private By clickCookieButton = By.id("rcc-confirm-button");
    //Кнопка "Заказать" в body
    private By createOrderInBody = By.cssSelector(".Button_Button__ra12g.Button_Middle__1CSJM");
    //блок FAQ
    private By faq = By.className("Home_FAQ__3uVm4");
    //вопросы
    private By questions = By.className("accordion__button");
    //ответы
    private By answers = By.className("accordion__panel");
    //массив локаторов кнопок с вопросами
    private static final String[] dropDownQuestions = new String[]{
            "accordion__heading-0",
            "accordion__heading-1",
            "accordion__heading-2",
            "accordion__heading-3",
            "accordion__heading-4",
            "accordion__heading-5",
            "accordion__heading-6",
            "accordion__heading-7"
    };
    //Массив локаторов кнопок с ответами
    private static final String[] dropDownAnswers = new String[]{
            "accordion__panel-0",
            "accordion__panel-1",
            "accordion__panel-2",
            "accordion__panel-3",
            "accordion__panel-4",
            "accordion__panel-5",
            "accordion__panel-6",
            "accordion__panel-7"
    };
    //Методы
    //метод принятия куки
    public void acceptCookie(){
        driver.findElement(clickCookieButton).click();
    }
    //метод скролла до блока FAQ
    public void scrollToFaq(){
        WebElement element = driver.findElement(faq);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
    }
    //Клик по кнопке вопроса
    public void clickQuestionButton(String questionLocator) {
        new WebDriverWait(driver, 5)
                .until(ExpectedConditions.elementToBeClickable(By.id(questionLocator)));
        driver.findElement(By.id(questionLocator)).click();
    }
    //Клик по "Заказать" в середине страницы
    public void clickCreateInBody(){
        driver.findElement(createOrderInBody).click();
    }
}
