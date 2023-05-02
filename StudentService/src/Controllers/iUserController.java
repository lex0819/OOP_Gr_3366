package Controllers;

import StudentDomen.User;

/**
 * интерфейс создания объектов-наследников класса User
 * @param <T> объект-наследник от класса User
 */
public interface iUserController<T extends User> {

    /**
     * метод создает объект-наследник типа User
     * @param firstName Фамилия
     * @param secondName Имя
     * @param age Возраст
     */
    void create(String firstName, String secondName, int age);
}
