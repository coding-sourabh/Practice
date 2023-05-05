public class Main {
    public static void main(String [] args) {
        Director engineeringStudentDirector = new Director(new EngineerStudentBuilder());
        Student engineerStudent = engineeringStudentDirector.createStudent();

        Director mbaStudentDirector = new Director(new MBAStudentBuilder());
        Student mbaStudent = mbaStudentDirector.createStudent();

        System.out.println(engineerStudent);
        System.out.println(mbaStudent);
    }
}
