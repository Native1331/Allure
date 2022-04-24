

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class LabelTest {


    @Owner("eroshenkoam")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Мой любимый тест")
    @Feature("Задачи в репозитории")
    @Story("Просмотр созданных задач в репозитории")
    @Link(value = "Тестинг", url = "https://github.com")
    public void testAnnotated() {
    }
    @Test
    public void testCode(){
        Allure.label("owner", "eroshenroam");
        Allure.label("severity", SeverityLevel.CRITICAL.value());
        Allure.feature("Задачи в репозитории");
        Allure.story("Просмотр созданных задач в репозитории");
        Allure.link("Тестинг", "https://github.com");
    }
}




