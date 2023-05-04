package Model;

import Controller.iGetModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * класс предоставляет функционал для работы с моделью данных
 * список студентов реализован через библиотечный класс JAVA HashMap
 */
public class ModelHashMap implements iGetModel {
    private HashMap<Long, Student> students;///< список студентов

    /**
     * конструктор
     *
     * @param students список студентов
     *                 ключ типа long - это studentID
     */
    public ModelHashMap(HashMap<Long, Student> students) {
        this.students = students;
    }

    /**
     * метод возвращает список студентов
     *
     * @return список студентов
     * метод перебирает карту по элементам ключ-значение
     * ключ типа long содержит studentID
     * значение - это объект класса Student
     * надо заменить в объекте поле studentID на ключ из карты
     * и вернуть список объектов класса Student
     */
    @Override
    public List<Student> getAllStudent() {
        List<Student> allStudents = new ArrayList<Student>();

        for (Map.Entry<Long, Student> item : students.entrySet()) {
            long key = item.getKey();
            Student value = item.getValue();
            value.setStudentID(key);

            allStudents.add(value);
        }
        return allStudents;
    }

    /**
     * @return
     */
    @Override
    public long deleteStudent(long id) {
        return id;
    }
}