package Example.Example9;

public class Test {
    public static void main(String[] args) {
        IAnimal h1 = new Animal();
        Animal h2 = new Animal();
        h1.eat();
//        h1.think(); //에러발생
        h2.eat();
        h2.think();
    }
}
