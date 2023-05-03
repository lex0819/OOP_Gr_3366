package Controller;

import java.util.List;
import Model.Student;

/**
 * интерфейс на реализацию методов для раоты с Моделью
 */
public interface iGetModel {
    /**
     * метод возвращает список студентов
     * @return список студентов
     */
    public List<Student> getAllStudent();
}