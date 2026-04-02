package example;

import io.qameta.allure.Allure;
import io.qameta.allure.AllureId;
import org.junit.jupiter.api.Test;

public class ReproTest {

    @Test
    @AllureId("381082")
    void testLoginSuccess() {
        Allure.step("Проверить предусловие выполнения: страница входа открыта");
        Allure.step("Выполнить действие: попытаться войти");
        Allure.step("Ожидаемый результат: логин успешен");
        Allure.step("Ожидаемый результат: отображается имя пользователя");

        throw new RuntimeException("Intentional broken for repro");
    }
}
