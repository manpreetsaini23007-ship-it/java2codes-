
class LivingBeing {
    void brain() {
        System.out.println("All living beings have a brain.");
    }
}


class Animal extends LivingBeing {
    void animalType() {
        System.out.println("All animals are living beings.");
    }
}


class Bird extends Animal {
    void fly() {
        System.out.println("All birds can fly.");
    }
}

public class animaltest{
    public static void main(String[] args) {
        LivingBeing living = new LivingBeing();
        living.brain();

        Animal animal = new Animal();
        animal.brain();      
        animal.animalType();

        Bird bird = new Bird();
        bird.brain();        
        bird.animalType();   
        bird.fly();          
    }
}

