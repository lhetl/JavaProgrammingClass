package Assignment.Assignment4.B.Question10_9;

public class Test10_9 {
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
