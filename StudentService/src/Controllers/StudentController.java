package Controllers;

import StudentDomen.Student;
import StudentService.StudentGroupService;
import StudentService.StudentService;

/**
 * класс-контроллер с матодами для Студентов
 */
public class StudentController implements iUserController<Student> {

    private final StudentService dataService = new StudentService();
    private final StudentGroupService groupService = new StudentGroupService();

    /**
     * метод создает Студента
     * @param firstName  Фамилия
     * @param secondName Имя
     * @param age        Возраст
     */
    @Override
    public void create(String firstName, String secondName, int age) {
        dataService.create(firstName, secondName, age);
    }
    
}
