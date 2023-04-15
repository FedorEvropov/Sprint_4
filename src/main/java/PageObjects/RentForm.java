package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class RentForm {
    private static WebDriver driver;
    public RentForm(WebDriver driver){
        RentForm.driver = driver;
    }
    //------------------------------------Локаторы:-----------------------------------
    //Поле "Когда привезти самокат"
    private By deliveryTime = By.xpath(".//input[@placeholder = '* Когда привезти самокат']");
    //Поле "Срок Аренды"
    private By rentTimeField = By.className("Dropdown-placeholder");
    //Локатор из списка со сроком аренды
    private By rentTime = By.xpath(".//*[(@role ='option' and text()='четверо суток')]");
    //Чекбокс черного самоката
    private By blackScooter = By.id("black");
    //Чекбокс серого самоката
    private By greyScooter = By.id("grey");
    //Поле "Комментарий для курьера"
    private By massageForCourier = By.xpath(".//input[@placeholder = 'Комментарий для курьера']");
    //Кнопка "Назад"
    private By buttonBackspace = By.xpath(".//button[(@class='Button_Button__ra12g Button_Middle__1CSJM Button_Inverted__3IF-i' and text()='Назад')]");
    //Кнопка "Заказать"
    private By buttonOrder = By.xpath(".//button[(@class='Button_Button__ra12g Button_Middle__1CSJM' and text()='Заказать')]");
    //Кнопка "Да" в модальном окне
    private By buttonConfirm = By.xpath(".//button[(@class='Button_Button__ra12g Button_Middle__1CSJM' and text()='Да']");
    //Кнопка "Нет" в модальном окне
    private By buttonRefuse = By.xpath(".//button[(@class='Button_Button__ra12g Button_Middle__1CSJM Button_Inverted__3IF-i' and text()='Нет']");
    //Кнопка "Посмотреть статус в модальном окне"
    private By checkStatus = By.xpath(".//button[(@class='Button_Button__ra12g Button_Middle__1CSJM' and text()='Посмотреть статус']");
    //------------------------------------Методы:-----------------------------------
    //Заполнить "Когда привезти самокат"
    public void fillDeliveryTime(String date){
        driver.findElement(deliveryTime).sendKeys(date);
        driver.findElement(deliveryTime).sendKeys(Keys.ENTER);
    }
    //Заполнить "Срок аренды"
    public void fillRentTime(){
        driver.findElement(rentTimeField).click();
        driver.findElement(rentTime).click();
    }
    //Выбрать черный самокат
    public void choseBlackScooter(){
        driver.findElement(blackScooter).click();
    }
    //Выбрать серый самокат
    public void choseGreyScooter(){
        driver.findElement(greyScooter).click();
    }
    //Заполнить "Комментарий для курьера"
    public void fillMassageForCourier(String massage){
        driver.findElement(massageForCourier).sendKeys(massage);
    }
    //Нажать "Назад"
    public void clickBackButton(){
        driver.findElement(buttonBackspace).click();
    }
    //Нажать "Заказать"
    public void clickOrderButton(){
        driver.findElement(buttonOrder).click();
    }
    //Нажать "Да" в модальном окне
    public void clickConfirmButton(){
        driver.findElement(buttonConfirm).click();
    }
    //Нажать "Нет" в модальном окне
    public void clickRefuseButton(){
        driver.findElement(buttonRefuse).click();
    }
    //Нажать "Посмотреть статус" в модальном окне
    public void clickStatusButton(){
        driver.findElement(checkStatus).click();
    }
    //Появление кнопки "Посмотреть статус" в модальном окне
    public boolean isStatusButtonDisplayed() {
        return driver.findElement(checkStatus).isDisplayed();
    }
}
