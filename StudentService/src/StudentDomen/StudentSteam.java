package StudentDomen;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * класс порождает группы студентов
 * список групп студентов, итерируемый и сортируемый
 * по числу студентов в группе
 * и по идентификаторы группы
 */
public class StudentSteam implements Iterable<StudentGroup>{

 private List<StudentGroup> groups;///< список групп на курсе
 private String name;///< название курса

  /**
   * constructor
   */
  public StudentSteam(List<StudentGroup> groups, String name) {
    this.groups = groups;
    this.name = name;
  }

  public String getSteamName() {
    return name;
  }

  public void setSteamName(String name) {
    this.name = name;
  }

  public List<StudentGroup> getGroups() {
    return groups;
  }

  public void setGroups(List<StudentGroup> groups) {
    this.groups = groups;
  }

  /**
   * @return an Iterator for objects of StudentGroup.
   */
  @Override
  public Iterator<StudentGroup> iterator() {
    return new StudentSteamIterator(groups);
  }
  public int getCountOfGroups(){
    return groups.size();
  }

  /**
   * nice print выводить номер потока, количество групп
   * и список студентов с указанием идентификатора группы
   */
  @Override
  public String toString(){
    String res = "\nStream is " + this.getSteamName();
    res += " count of groups is " + this.getCountOfGroups() + "\n";

    Collections.sort(this.getGroups());

    for ( StudentGroup group: this){
      for (Student stud: group.getStudents()){
        res += stud.toString() + group.getGroupGroupID() + "\n";
      }
    }

    return res;
  }
}
