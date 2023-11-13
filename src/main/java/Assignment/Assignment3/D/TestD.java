package Assignment.Assignment3.D;

public class TestD {
    public static void main(String[] args) {
        Subject s1= new Subject(0,"FP0001","지도교수상담","0-0-0-0",1,
                "학교육인증과정 대상학부의 인증과정 및 비인증과정 학생의 지도교수는...",SubjectType.MAJOR_SELECT);
        Subject s2=new Subject(1,"CS0005","논리회로","3-2-0-2",2," 기본 논리 Gate와 조합 논리 회로를 다루고 부울 함수의 간략화 및 플립플롭을 기초로.....",SubjectType.MAJOR_REQUIRED);
        Subject s3 = new Subject(1,"CS0007","창의공학셜계입문","2-0-2-0",1,"프로젝트 기반의 접근방법을 통해, 팀별 작업과 고객 지향적 설계 프로젝트를 효과적으로 수행하기 위한......",SubjectType.MAJOR_REQUIRED);
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());
    }
}
