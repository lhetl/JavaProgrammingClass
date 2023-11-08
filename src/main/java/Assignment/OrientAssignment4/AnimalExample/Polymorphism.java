package Assignment.OrientAssignment4.AnimalExample;

public class Polymorphism {
    public static void main(String[] args) {
        Animal[] animals={
                new Cat(),
                new Dog(),
                new Cow(),
                new Cat()
        };
        for (Animal x : animals){
            hear(x);
        }
    }
    static void hear(Animal a){
        System.out.println(a.cry());
    }
}
