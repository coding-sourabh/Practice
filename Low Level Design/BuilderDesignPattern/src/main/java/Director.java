public class Director {
    StudentBuilder studentBuilder;
    public  Director(StudentBuilder studentBuilder) {
        this.studentBuilder = studentBuilder;
    }

    public Student createStudent() {
        if(studentBuilder instanceof EngineerStudentBuilder) {
            return createEngineeringStudent();
        }
        else if(studentBuilder instanceof MBAStudentBuilder) {
            return createMBAStudent();
        }
        return null;
    }

    private Student createEngineeringStudent() {
        studentBuilder.setRollNo(1);
        studentBuilder.setName("Sourabh");
        studentBuilder.setCity("FBD");
        studentBuilder.setSchool("ABC");
        studentBuilder.setSubjects();
        return studentBuilder.build();
    }

    private Student createMBAStudent() {
        studentBuilder.setRollNo(2);
        studentBuilder.setName("Sam");
        studentBuilder.setSchool("XYZ");
        studentBuilder.setCity("Jaipur");
        studentBuilder.setSubjects();
        return studentBuilder.build();
    }
}
