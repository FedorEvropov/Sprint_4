import page.Objects.MainPage;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;
import static page.Objects.MainPage.dropDownAnswers;
import static page.Objects.MainPage.dropDownQuestions;

//Параметризованный тест соответствия текста в выпадающем списке ожидаемому тексту
@RunWith(Parameterized.class)
public class DropDownMenuTests extends BaseTests {
    private static String question;
    private static String answer;
    private String answerText;
    //Конструктор
    public DropDownMenuTests(String question, String answer, String answerText){
        this.question = question;
        this.answer = answer;
        this.answerText = answerText;
    }
    //Массив с параметрами
    @Parameterized.Parameters
    public static Object[][] expectedAnswers(){
        return new Object[][]{
                {dropDownQuestions[0], dropDownAnswers[0], "Сутки — 400 рублей. Оплата курьеру — наличными или картой."},
                {dropDownQuestions[1], dropDownAnswers[1], "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим."},
                {dropDownQuestions[2], dropDownAnswers[2], "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30."},
                {dropDownQuestions[3], dropDownAnswers[3], "Только начиная с завтрашнего дня. Но скоро станем расторопнее."},
                {dropDownQuestions[4], dropDownAnswers[4], "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010."},
                {dropDownQuestions[5], dropDownAnswers[5], "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится."},
                {dropDownQuestions[6], dropDownAnswers[6], "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои."},
                {dropDownQuestions[7], dropDownAnswers[7], "Да, обязательно. Всем самокатов! И Москве, и Московской области."},
        };
    }
    @Test
    public void dropDownTest(){
        //создание объекта класса главной страницы
        MainPage objMainPage = new MainPage(driver);
        //принять куки
        objMainPage.acceptCookie();
        //скролл до FAQ
        objMainPage.scrollToFaq();
        //клик по кнопке вопроса
        objMainPage.clickQuestionButton(question);
        //Сверка текста
        String actualAnswerText = driver.findElement(By.id(answer)).getText();
        assertEquals("Текст не соответствует ожидаемому",answerText,actualAnswerText);
    }
}
