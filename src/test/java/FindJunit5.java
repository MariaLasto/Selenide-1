import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;


public class FindJunit5 {
    @Test
    void JUnit5inSoftAssertions() {
        //открыть страницу Selenide в Github
        open("https://github.com/search?q=selenide");
        //перейти в раздел Wikis
        $(byText("Wikis")).pressEnter();
        //в списке страниц найти страницу SoftAssertions и открыть её
        $("#wiki_search_results").$(byText("SoftAssertions")).pressEnter();
        //проверить, что внутри есть пример кода для JUnit5
        $("#wiki-content").shouldHave(text( "JUnit5"));


    }

}