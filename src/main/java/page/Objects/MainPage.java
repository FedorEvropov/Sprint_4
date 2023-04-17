package page.Objects;

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
    //Локаторы открытия вопросов
    private static By question1 = By.id("accordion__heading-0");
    private static By question2 = By.id("accordion__heading-1");
    private static By question3 = By.id("accordion__heading-2");
    private static By question4 = By.id("accordion__heading-3");
    private static By question5 = By.id("accordion__heading-4");
    private static By question6 = By.id("accordion__heading-5");
    private static By question7 = By.id("accordion__heading-6");
    private static By question8 = By.id("accordion__heading-7");
    //массив локаторов кнопок с вопросами
    public static final String[] dropDownQuestions = new String[]{
            "accordion__heading-0",
            "accordion__heading-1",
            "accordion__heading-2",
            "accordion__heading-3",
            "accordion__heading-4",
            "accordion__heading-5",
            "accordion__heading-6",
            "accordion__heading-7",
    };
    //Локаторы элементов с текстом ответов
    private static By answer1 = By.className("accordion__panel-0");
    private static By answer2 = By.className("accordion__panel-1");
    private static By answer3 = By.className("accordion__panel-2");
    private static By answer4 = By.className("accordion__panel-3");
    private static By answer5 = By.className("accordion__panel-4");
    private static By answer6 = By.className("accordion__panel-5");
    private static By answer7 = By.className("accordion__panel-6");
    private static By answer8 = By.className("accordion__panel-7");
    //Массив локаторов кнопок с ответами
    public static final String[] dropDownAnswers = new String[]{
            "accordion__panel-0",
            "accordion__panel-1",
            "accordion__panel-2",
            "accordion__panel-3",
            "accordion__panel-4",
            "accordion__panel-5",
            "accordion__panel-6",
            "accordion__panel-7",
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
