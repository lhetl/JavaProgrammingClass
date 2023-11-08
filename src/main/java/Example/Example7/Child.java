package Example.Example7;

class Child extends Parent {
    static void who() { System.out.println("Child의 정적메소드 who"); } // 숨김
    void show() { System.out.println("Child의 인스턴스메소드 show"); } //재정의
}