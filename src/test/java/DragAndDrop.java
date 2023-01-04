import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class DragAndDrop {
    @Test
    void dragAndDropTest() {
        //Открыть https://the-internet.herokuapp.com/drag_and_drop
        open("https://the-internet.herokuapp.com/drag_and_drop");

        //В Selenide есть команда $(element).dragAndDrop($(to-element)). Проверите работает ли тест, если использовать её вместо actions()
        $("#column-a").dragAndDropTo($("#column-b"));

        //Проверьте, что прямоугольники действительно поменялись
        $("#column-b header").shouldHave(text("A"));
        $("#column-a header").shouldHave(text("B"));
    }
}

