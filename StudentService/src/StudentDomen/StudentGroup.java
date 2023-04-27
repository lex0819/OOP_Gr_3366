package StudentDomen;

import java.util.Iterator;
import java.util.List;

/**
 * класс порождает Группу Студентов
 * с возможностью итерирования по Студентам
 * и возможностью сортировки групп по числу студентов
 * и по идентификатору группы
 */
public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup> {

  /**
   * списов студентов в группе
   */
  private List<Student> students;
  /**
   * идентификатор группы
   */
  private String groupID;

  /**
   * конструктор
   */
  public StudentGroup(List<Student> students, String groupID) {
    this.students = students;
    this.groupID = groupID;
  }

  public String getGroupGroupID(){return this.groupID;}

  public void setGroupGroupID(String groupID) {
    this.groupID = groupID;
  }

  public List<Student> getStudents() {
    return students;
  }

  public void setStudents(List<Student> students) {
    this.students = students;
  }

  // @Override
  // public Iterator<Student> iterator() {
  //     return new StudentGroupIterator(students);
  // }

  @Override
  public Iterator<Student> iterator() {
    return new Iterator<Student>() {
      private int index = 0;

      @Override
      public boolean hasNext() {
        return index < students.size();
      }

      @Override
      public Student next() {
        if (!hasNext()) {
          return null;
        }
        //counter++;
        return students.get(index++);
      }

    };
  }

  /**
   * @return число студентов в группе
   */
  public int getCountOfStudents() {
    return students.size();
  }

  /**
   * сравнение двух групп студентов
   * по числу студентов в каждой группе
   * и по идентификатору группы
   */
  @Override
  public int compareTo(StudentGroup o) {
    if (this.getCountOfStudents() == o.getCountOfStudents()) {
      if(this.groupID.equals(o.groupID) ){
        return 0;
      }
      return this.groupID.compareTo(o.groupID);
    }
    if (this.getCountOfStudents() < o.getCountOfStudents()) {
      return -1;
    }
    return 1;
  }

  /**
   * nice print идентификатор группы, число студентов в группе
   * и список самих студентов из группы
   */
  @Override
  public String toString(){
    String res = "\nGroupID is " + this.getGroupGroupID();
    res += " count of students is " + this.getCountOfStudents() + "\n";

    for (Student stud: this.getStudents()){
      res += stud.toString() + "\n";
    }

    return res;
  }
}
