import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;


public class HoverForSolutions {
    @Test
    void BuildLikeTheBestAssertions() {
        //открыть главную страницу Github
        open("https://github.com");
        //поднести мышку к Solutions
        $(byText("Solutions")).hover();
        //в раскрывшемся меню кликнуть на Enterprise
        $(byText("Enterprise")).click();
        //убедиться, что на открывшейся страницу заголовок "Build like the best"
        $("h1").shouldHave(text( "Build like the best"));


    }

}