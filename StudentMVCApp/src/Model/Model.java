package Model;

import java.util.List;

import Controller.iGetModel;

/**
 * класс предоставляет функционал для работы с моделью данных
 * список студентов реализован через библиотечный класс JAVA List
 */
public class Model implements iGetModel {
    private List<Student> students;///< список студентов

    /**
     * конструктор
     * @param students список студентов
     */
    public Model(List<Student> students) {
        this.students = students;
    }

    /**
     * метод возвращает список студентов
     * @return список студентов
     */
    @Override
    public List<Student> getAllStudent()
    {
        return students;
    }

    /**
     * @return
     */
    @Override
    public long deleteStudent(long id) {
        return id;
    }
}