package example;

import io.qameta.allure.Allure;
import io.qameta.allure.AllureId;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class ReproTest {

    @Test
    @Tag("repro")
    @AllureId("382103")
    void launchMergeTestInProgressPassed() {
        Allure.step("Проверить предусловие выполнения: страница входа открыта");
        Allure.step("Выполнить действие: попытаться войти");
        Allure.step("Ожидаемый результат: логин успешен");
        Allure.step("Ожидаемый результат: отображается имя пользователя");
    }
}
