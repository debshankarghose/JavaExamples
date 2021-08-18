class Animal {
    public void animalSound() { //animalSound method is created claiming all animals make sound.
        System.out.println("All animals make sounds");
    }
}
class Dog extends Animal {
    public void animalSound() { // Same method name is used and classified for dogs
        System.out.println("Dog makes bow bow sound");
    }
}
class Cat extends Animal{
    public void animalSound() { // Same method name is used and classified for cats
        System.out.println("Cat makes mew mew sound");
    }
}
public class PolymorphismExample {
    public static void main(String[] args) {
        //Animal animals = new Animal();
        Dog dog = new Dog(); //note here object dog is created with Animal for accessing dog sound from animalSound method.
        dog.animalSound();
    }

}
