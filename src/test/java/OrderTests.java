import page.Objects.MainPage;
import org.junit.Test;
import page.Objects.Header;
import page.Objects.OrderForm;
import page.Objects.RentForm;

import static org.junit.Assert.assertTrue;

public class OrderTests extends BaseTests {

    @Test
    //тест с использованием кнопки "Заказать" в хеддере
    public void orderInHeader(){
        MainPage objManePage = new MainPage(driver);
        objManePage.acceptCookie();
        Header objHeader = new Header(driver);
        objHeader.createFromHedder();
        OrderForm objOrderForm = new OrderForm(driver);
        objOrderForm.fillFirstName("Тест");
        objOrderForm.fillLastname("Тестов");
        objOrderForm.fillAdress("Главная улица, 9");
        objOrderForm.choseMetro("Лубянка");
        objOrderForm.fillPhone("+79996668877");
        objOrderForm.clickNext();
        RentForm objRentForm = new RentForm(driver);
        objRentForm.fillDeliveryTime("25.04.2023");
        objRentForm.fillRentTime();
        objRentForm.choseBlackScooter();
        objRentForm.fillMassageForCourier("Осторожнее на дорогах!");
        objRentForm.clickOrderButton();
        objRentForm.clickConfirmButton();
        objRentForm.isStatusButtonDisplayed();
        assertTrue("Что-то пошло не так", objRentForm.isStatusButtonDisplayed());
    }
    @Test
    //тест с использованием кнопки "Заказать" в середине страницы
    public void orderInBody(){
        MainPage objManePage = new MainPage(driver);
        objManePage.acceptCookie();
        objManePage.clickCreateInBody();
        OrderForm objOrderForm = new OrderForm(driver);
        objOrderForm.fillProfile("Тест","Тестов","Главная 8","Лубянка","+79991231456");
        RentForm objRentForm = new RentForm(driver);
        objRentForm.fillRentForm("11.04.2024","Привезите");
        objRentForm.clickOrderButton();
        objRentForm.clickConfirmButton();
        objRentForm.isStatusButtonDisplayed();
        assertTrue("Что-то пошло не так", objRentForm.isStatusButtonDisplayed());
    }
}
