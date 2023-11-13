package Assignment.Assignment3.D;

import java.util.Arrays;

public class Subject{
    private int requiredGrade;
    private String subjectCode;
    private String subjectName;
    private int[] credit = new int[4];
    private int semester;
    private String description;
    private SubjectType subjectType;

    public Subject(int requiredGrade, String subjectCode, String subjectName, String credit, int semester,String description,SubjectType subjectType) {
        this.requiredGrade = requiredGrade;
        this.subjectCode = subjectCode;
        this.subjectName =subjectName;
        try {
            String[] tmp = credit.split("-");
            for (int i = 0; i < 4; i++) {
                this.credit[i] = Integer.parseInt(tmp[i]);
            }
        }catch (Exception e){
            throw new RuntimeException("잘못된 입력입니다");
        }
        this.semester = semester;
        this.description=description;
        this.subjectType=subjectType;
    }

    public int getRequiredGrade() {
        return requiredGrade;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public int[] getCredit() {
        return credit;
    }

    public int getSemester() {
        return semester;
    }

    public String getDescription() {
        return description;
    }

    public SubjectType getSubjectType() {
        return subjectType;
    }
    public String reBuild(){
        String tmp=String.valueOf(credit[0]);
        for(int i=0;i<3;i++){
            tmp+="-"+String.valueOf(credit[i+1]);
        }
        return tmp;
    }
    public String toString() {
        return "과목명: " +subjectName+
                ", 학년: " + requiredGrade +
                ", 과목코드: " + subjectCode + '\'' +
                ", 학점: " + reBuild() + ", "+semester+"학기" +
                ", 과목 종류: " + subjectType;
    }
}
