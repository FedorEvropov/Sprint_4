package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class OrderForm {
    private static WebDriver driver;
    public OrderForm(WebDriver driver) {
        OrderForm.driver = driver;
    }
    //------------------------------------Локаторы:-----------------------------------
    //поле Имя
    private By inputName = By.xpath(".//input[@placeholder = '* Имя']");
    //поле фамилия
    private By inputLastName = By.xpath(".//input[@placeholder = '* Фамилия']");
    //поле Адрес
    private By inputAdress = By.xpath(".//input[@placeholder = '* Адрес: куда привезти заказ']");
    //поле Метро
    private By inputMetro = By.xpath(".//input[@placeholder = '* Станция метро']");
    //Поле Телефон
    private By inputPhone = By.xpath(".//input[@placeholder = '* Телефон: на него позвонит курьер']");
    //Кнопка "Далее"
    private By buttonNext = By.xpath(".//button[(@class ='Button_Button__ra12g Button_Middle__1CSJM' and text()='Далее')]");
    //------------------------------------Методы:-----------------------------------
    //Заполнить Имя
    public void fillFirstName(String firstName){
        driver.findElement(inputName).sendKeys(firstName);
    }
    //Заполнить фамилию
    public void fillLastname(String lastName){
        driver.findElement(inputLastName).sendKeys(lastName);
    }
    //Заполнить адрес
    public void fillAdress(String adress){
        driver.findElement(inputAdress).sendKeys(adress);
    }
    //Выбрать станцию метро
    public void choseMetro(String metroStation){
        driver.findElement(inputMetro).click();
        driver.findElement(inputMetro).sendKeys(metroStation);
        driver.findElement(inputMetro).sendKeys(Keys.DOWN, Keys.ENTER);
    }
    //Заполнить телефон
    public void fillPhone(String phone){
        driver.findElement(inputPhone).sendKeys(phone);
    }
    //Нажать "Далее"
    public void clickNext(){
        driver.findElement(buttonNext).click();
    }
}
