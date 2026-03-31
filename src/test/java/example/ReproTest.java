package example;

import io.qameta.allure.Allure;
import org.junit.jupiter.api.Test;

public class ReproTest {

    @Test
    void testLoginSuccess() {
        Allure.step("Проверить предусловие выполнения: страница входа открыта");
        Allure.step("Выполнить действие: попытаться войти");
        Allure.step("Ожидаемый результат: логин успешен");
        Allure.step("Ожидаемый результат: отображается имя пользователя");
    }
}