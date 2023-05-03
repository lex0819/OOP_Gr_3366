package Model;

/**
 * класс порождает студента и возможность сортировать студентов по возрасту и по ID
 */
public class Student extends User implements Comparable<Student> {

  private long studentID;///< ID студента

  /**
   * конструктор
   *
   * @param firstName  Фамилия
   * @param secondName Имя
   * @param age        возраст
   * @param studentID  ID студента
   */
  public Student(String firstName, String secondName, int age, long studentID) {
    super(firstName, secondName, age);
    this.studentID = studentID;
  }

  /**
   * @return ID студента
   */
  public long getStudentID() {
    return studentID;
  }

  /**
   * @param studentID ID студента присваивает ID студента
   */
  public void setStudentID(long studentID) {
    this.studentID = studentID;
  }

  /**
   * @return nice print Student
   */
  @Override
  public String toString() {
    return "Student{"

        + "firstName=" + super.getFirstName()
        + ", secondName=" + super.getSecondName()
        + ", age=" + super.getAge() +
        ", studentID=" + studentID +
        '}';
  }

  /**
   * для сортировки студентов по возрасту и по ID
   */
  @Override
  public int compareTo(Student o) {

//        System.out.println(super.getFirstName()+" - "+o.getFirstName());
    if (super.getAge() == o.getAge()) {
      if (this.studentID == o.studentID) {
        return 0;
      }
      if (this.studentID < o.studentID) {
        return -1;
      }
      return 1;
    }
    if (super.getAge() < o.getAge()) {
      return -1;
    }
    return 1;
  }
}
