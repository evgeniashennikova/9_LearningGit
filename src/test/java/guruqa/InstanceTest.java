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
        String expectedResult = "-4";

        open("https://www.google.ru/");
        $("[name='q']").setValue(quest);
        $("[name='btnK']").click();
        String actualResult = $("#cwos").getText();
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void thirdTest() {

        String quest = "2/0";
        String expectedResult = "undefined";

        open("https://www.google.ru/");
        $("[name='q']").setValue(quest);
        $("[name='btnK']").click();
        String actualResult = $(".dDoNo").getText();
        Assertions.assertEquals(expectedResult, actualResult);
    }

}
