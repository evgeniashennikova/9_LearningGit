package guruqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class InstanceTest {

    @Test
    void simpleTest() {

        String quest = "2+6";
        String expectedResult = "8";

        open("https://www.google.ru/");
        $("[name='q']").setValue(quest);
        $("[name='btnK']").click();
        String actualResult = $("#cwos").getText();
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void secondTest() {

        String quest = "2-6";
        String expectedResult = "0";

        open("https://www.google.ru/");
        $("[name='q']").setValue(quest);
        $("[name='btnK']").click();
        String actualResult = $("#cwos").getText();
        Assertions.assertEquals(expectedResult, actualResult);
    }

}
