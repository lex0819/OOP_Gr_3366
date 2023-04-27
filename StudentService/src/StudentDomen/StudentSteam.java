package StudentDomen;

import java.util.Iterator;
import java.util.List;

/**
 * класс порождает группы студентов
 * список студентов, итерируемый и сортируемый по числу студентов в группе
 */
public class StudentSteam implements Iterable<StudentGroup>{

  /**
   * список групп на курсе
   */
  private List<StudentGroup> groups;
  /**
   * название курса
   */
  private String name;

  /**
   * constructor
   */
  public StudentSteam(List<StudentGroup> groups, String name) {
    this.groups = groups;
    this.name = name;
  }

  public String getCourseName() {
    return name;
  }

  public void setCourseName(String name) {
    this.name = name;
  }

  public List<StudentGroup> getGroups() {
    return groups;
  }

  public void setGroups(List<StudentGroup> groups) {
    this.groups = groups;
  }

  /**
   * @return an Iterator.
   */
  @Override
  public Iterator<StudentGroup> iterator() {
    return new StudentSteamIterator(groups);
  }
}
