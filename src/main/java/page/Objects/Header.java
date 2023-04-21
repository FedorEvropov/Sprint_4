package page.Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Header {
    private final WebDriver driver;
    public Header(WebDriver driver) {
        this.driver = driver;
    }
    //Кнопка "Заказать" в хеддере
    private By createOrderInHeadder = By.className("Button_Button__ra12g");
    //Статус заказа
    private By statusOrder = By.className("Header_Link__1TAG7");
    //поле "Введите номер заказа"
    private By inputOrderNumber = By.className("Input_InputContainer__3NykH");
    //кнопка Go!
    private By buttonGo = By.xpath(".//input[@placeholder = 'Введите номер заказа']");

    //Методы
    public void createFromHedder(){
        driver.findElement(createOrderInHeadder).click();
    }
}
