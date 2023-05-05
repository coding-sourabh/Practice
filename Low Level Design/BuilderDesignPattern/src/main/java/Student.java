import java.util.List;

public class Student {
    private int rollNo;
    private String name;
    private String city;
    private String school;

    private List<String> subjects;

    public Student(StudentBuilder studentBuilder) {
        this.rollNo = studentBuilder.getRollNo();
        this.name = studentBuilder.getName();
        this.city = studentBuilder.getCity();
        this.school = studentBuilder.getSchool();
        this.subjects = studentBuilder.getSubjects();
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", school='" + school + '\'' +
                ", subjects=" + subjects +
                '}';
    }
}
