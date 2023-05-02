package StudentService;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.Employee;
import StudentDomen.Student;
import StudentDomen.UserComparator;

/**
 * класс пораждает список студентов
 */
public class StudentService implements iUserService<Student> {
    private int count;///< count of Students
    private List<Student> students;///< list of Students

  /**
   * constructor
   */
    public StudentService() {
        this.students = new ArrayList<Student>();
    }

  /**
   * метод создает нового студента и добавляет его в список
   * @param firstName  Фамилия
   * @param secondName Имя
   * @param age        возраст
   */
    @Override
    public void create(String firstName, String secondName, int age) {
       Student per = new Student(firstName, secondName, age, count);
       count++;  
       students.add(per);      
    }

  /**
   * @return список студентов
   */
    @Override
    public List<Student> getAll() {
        return students;
    }

    /**
     * @param numberGroup номер группы
     * @return отсортированный список студентов по ФИО
     */
    public List<Student> getSortedByFIOStudentGroup(int numberGroup) {
        List<Student> students = new ArrayList<>(this.students);
        students.sort(new UserComparator<Student>());
        return students;
    }
}
