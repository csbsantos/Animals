package Animals;

public class AnimalsZoo {
    public static void main(String[] args) {
        Pig joe = new Pig("Joseph");
        Dog charles = new Dog("Charlie", "Golden");
        Bird pet = new Bird("Peter");

        pet.eat("leaves");
        charles.runAfterMailman();
        pet.makeNoise();
        charles.makeNoise();
        joe.makeNoise();


        Animals johny = new Dog("Johny", "Labrador");
        johny.makeNoise();
        if (johny instanceof Dog d) {
            d.runAfterMailman();
        }
    }
}
