package Controller;

import java.util.List;
import Model.Student;

/**
 * интерфейс для реализации методов работы пользователя в консоли
 */
public interface iGetView {
    /**
     * метод реализует красивый вывод в консоль списка студентов
     * @param students список студентов
     */
    void printAllStudent(List<Student> students);

    /**
     * метод предоставляет возможность взаимодействия пользователя с приложением в консоли
     * @param message содержит вопрос к пользователю, на который ожидает ответа
     * @return возвращает ответ пользователя
     */
    String prompt(String message);

    /**
     * реализует prompt на нужном языке (русский, английский ...)
     */
    String getPrompt();

    /**
     * реализует exit на нужном языке (русский, английский ...)
     */
    String getExit();
}