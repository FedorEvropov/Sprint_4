import PageObjects.MainPage;
import org.junit.Test;
import PageObjects.Header;
import PageObjects.OrderForm;
import PageObjects.RentForm;

import static org.junit.Assert.assertTrue;

public class OrderTests extends BaseTests {

    @Test
    //тест с использованием кнопки "Заказать" в хеддере
    public void OrderTest1(){
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
    public void OrderTest2(){
        MainPage objManePage = new MainPage(driver);
        objManePage.acceptCookie();
        objManePage.clickCreateInBody();
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
}
