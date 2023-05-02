package StudentDomen;

import java.util.Iterator;
import java.util.List;

/**
 * класс-итерратор для перечисления групп студентов
 */
public class StudentGroupIterator implements Iterator<Student> {
    private int counter;///< счетчик студентов в группе
    private final List<Student> students;///< список студентов в группе

    /**
     * конструктор
     * @param students список студентов
     */
    public StudentGroupIterator(List<Student> students) {
        this.students = students;
        this.counter = 0;
    }

    /**
     * @return true if Student has index in collection
     */
    @Override
    public boolean hasNext() {
       return counter<students.size();
    }

    /**
     * @return index of current Student in the collection
     */
    @Override
    public Student next() {
        if(!hasNext())
        {
            return null;
        }
        //counter++;
        return students.get(counter++);        
    }
}
