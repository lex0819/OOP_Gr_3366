package StudentDomen;

import java.util.Iterator;
import java.util.List;

/**
 * класс-итератор для объектов класса StudentSteam
 */
public class StudentSteamIterator implements Iterator<StudentGroup> {
  private int counter;///< счетчик групп в потоке
  private final List<StudentGroup> groups;///< список групп в потоке

  /**
   * конструктор
   * @param groups список групп в потоке
   */
  public StudentSteamIterator(List<StudentGroup> groups) {
    this.groups = groups;
    this.counter = 0;
  }

  /**
   * @return {@code true} if the iteration has more elements
   */
  @Override
  public boolean hasNext() {
     return counter < groups.size();
  }

  /**
   * @return the next element in the iteration
   */
  @Override
  public StudentGroup next() {
    if(!hasNext())
    {
      return null;
    }
    return groups.get( counter++ );
  }
}
