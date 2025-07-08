package Animals;

public class Dog extends Animals{
    private String breed;

    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }
    @Override
    public  void makeNoise (){
        System.out.println("Woof woof woof");
    }

    public void runAfterMailman (){
        System.out.println("Run, mailman. I'm chasing you. Woof");
    }
}
