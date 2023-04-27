package StudentDomen;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup> {

  /**
   * списов студентов в группе
   */
  private List<Student> students;
  /**
   * название группы
   */
  private String groupID;

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
   * сравнение двух групп студентов по числу студентов в каждой группе
   */
  @Override
  public int compareTo(StudentGroup o) {
    if (this.getCountOfStudents() == o.getCountOfStudents()) {
      return 0;
    }
    if (this.getCountOfStudents() < o.getCountOfStudents()) {
      return -1;
    }
    return 1;
  }

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
