package example;

import io.qameta.allure.Allure;
import io.qameta.allure.AllureId;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class ReproTest {

    @Test
    @Tag("repro")
    @AllureId("385326")
    void launchTestPlanWithEnvironmentParameters() {
        Allure.step("Открыть тест-план");
        Allure.step("Нажать кнопку Запустить");
        Allure.step("В блоке Окружение нажать Добавить");
        Allure.step("Изменить значение одного параметра окружения");
        Allure.step("Оставить остальные параметры окружения незаполненными");
        Allure.step("Нажать кнопку Отправить");
        Allure.step("Проверить, что запуск стартовал, а незаполненные параметры не заблокировали форму");
    }
}
