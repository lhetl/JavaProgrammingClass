package Assignment.Assignment3.B.Question10_9;

public class Test {
    public static void main(String[] args) {
        Course course= new Course("Test");
        String[] studentList={"first","second","third"};
        for(String tmp:studentList){
            course.addStudent(tmp);
        }
        course.dropStudent("first");
        for(String tmp:course.getStudents()){
            System.out.println(tmp+"  ");
        }
    }
}
