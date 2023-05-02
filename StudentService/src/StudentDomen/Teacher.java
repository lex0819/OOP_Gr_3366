package StudentDomen;

/**
 * класс  Преподаватель
 */
public class Teacher extends User {

    private int teacherId;///< ID преподавателя
    private String academicDegree;///< Ученая степень преподавателя

    public Teacher(String firstName, String secondName, int age, int teacherId, String academicDegree) {
        super(firstName, secondName, age);
        this.teacherId = teacherId;
        this.academicDegree = academicDegree;
    }

    /**
     * @return ID преподавателя
     */
    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    /**
     * @return Ученую степень преподавателя
     */
    public String getAcademicDegree() {
        return academicDegree;
    }

    public void setAcademicDegree(String academicDegree) {
        this.academicDegree = academicDegree;
    }

    @Override
    public String toString() {
        return "Teacher{"
                + "firstName=" + super.getFirstName()
                + ", secondName=" + super.getSecondName()
                + ", age=" + super.getAge() +
                ", teacherID=" + this.teacherId +
                ", academic degree=" + this.academicDegree +
                '}';
    }
}
