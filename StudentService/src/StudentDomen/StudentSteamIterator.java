package StudentDomen;

import java.util.Iterator;
import java.util.List;

public class StudentSteamIterator implements Iterator<StudentGroup> {
  private int counter;
  private final List<StudentGroup> groups;
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
