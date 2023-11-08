package Example.Example7;

public class TestOfMethodBinding {
    public static void main(String[] args) {
        Child c = new Child();
        c.who();
        c.show();
        Parent p = new Child();
        p.who();
        p.show();
        Child c2 = new Child();
        ((Parent)c2).who();
        ((Parent)c2).show();
    }
}

