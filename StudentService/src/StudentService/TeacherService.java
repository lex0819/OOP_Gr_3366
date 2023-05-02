package StudentService;

import StudentDomen.Employee;
import StudentDomen.Teacher;
import StudentDomen.UserComparator;

import java.util.ArrayList;
import java.util.List;

/**
 * класс порождает список преподавателей
 */
public class TeacherService implements iUserService<Teacher>{
  private int count;///< count of Teachers
  private String degree;///< academic degree of the teacher
  private List<Teacher> teachers;///< list of Teachers

  /**
   * constructor
   */
  public TeacherService() {
    this.teachers = new ArrayList<Teacher>();
  }


  /**
   * @return list of teachers
   */
  @Override
  public List getAll() {
    return teachers;
  }

  /**
   * метод создания нового преподавателя
   *
   * @param firstName  Фамилия
   * @param secondName Имя
   * @param age        возраст
   */
  @Override
  public void create(String firstName, String secondName, int age) {
    Teacher teacher = new Teacher(firstName, secondName, age, count, degree);
    count++;
    teachers.add(teacher);
  }

  /**
   * метод сортирует список преподавателей по ФИО,
   * используя класс UserComparator
   * @return list of teachers
   */
  public List<Teacher> getSortedByFIOTeachers(){
    List<Teacher> teachers = new ArrayList<>(this.teachers);
    teachers.sort(new UserComparator<Teacher>());
    return teachers;
  }
}
