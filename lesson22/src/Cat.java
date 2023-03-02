 public class Cat {
    double weight;
    String name;
    int age;
    String color;
    void meow () {
        System.out.println("meow");
    }
 void pee () {
        weight -= 20;

 }
 void eat () {
        weight += 50;
 }
 void main() {
        Cat Barsik = new Cat();
        Barsik.meow();
     Barsik.weight = 3000;
     Barsik.color = "Orange";

 }
}

