package Assignment.Assignment4.B.Question10_9;

public class Course {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents=0;

    public Course(String courseName) {
        this.courseName = courseName;
    }
    public void addStudent(String student){
        if (numberOfStudents>=students.length-1){
            String[] tmp=new String[students.length*2];
            for (int i=0;i<numberOfStudents;i++){
                tmp[i]=students[i];
            }
            students=tmp;
        }
        students[numberOfStudents]=student;
        numberOfStudents++;
    }

    public String getCourseName() {
        return courseName;
    }

    public String[] getStudents() {
        String[] arr=new String[numberOfStudents];
        for (int i=0;i<numberOfStudents;i++){
            arr[i]=students[i];
        }
        return arr;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }
    public void dropStudent(String student){
        for(int i=0;i<numberOfStudents;i++){
            if(students[i].equals(student)){
                students[i]=null;
                break;
            }
        }
    }
    public void clear(){
        this.students=new String[100];
        this.numberOfStudents=0;
    }
}
