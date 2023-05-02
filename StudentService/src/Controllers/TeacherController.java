package Controllers;

import StudentDomen.Teacher;
import StudentService.TeacherService;

public class TeacherController implements iUserController<Teacher>{
    private final TeacherService teachService = new TeacherService();
    /**
     * метод создает объект-наследник типа User
     * создание нового преподавателя
     * @param firstName  Фамилия
     * @param secondName Имя
     * @param age        Возраст
     */
    @Override
    public void create(String firstName, String secondName, int age) {
        teachService.create(firstName, secondName, age);
    }
}
