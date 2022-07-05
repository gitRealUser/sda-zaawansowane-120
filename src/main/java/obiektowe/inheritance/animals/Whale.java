package obiektowe.inheritance.animals;

public class Whale extends Animal{

    private double weight;


    public Whale(String name, int age, double weight) {
        super(name,age);
        this.weight = weight;
    }

    public Whale() {
        super("Kraken",60);
        weight = 4.5;
    }

    public void booing(){
        System.out.println("<donośne buczenie wieloryba!>");
    }

    public void swim() {
        System.out.println(name + " płynie majestatycznie");
    }


    public void eat(){
        super.eat();
        System.out.println("Czyli je plankton");
    }

    public void makeSound() {
        booing();
    }




}
