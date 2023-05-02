package StudentService;

import StudentDomen.User;
import java.util.List;

/**
 * интерфейс создания пользователей-наследников класса User
 * @param <T> тип класса User и его наследников
 */
public interface iUserService<T extends User> {

    /**
     * @return list of objects User
     */
    List<T> getAll();

    /**
     * метод создания нового пользователя
     * @param firstName Фамилия
     * @param secondName Имя
     * @param age возраст
     */
    void create(String firstName, String secondName, int age);
}
