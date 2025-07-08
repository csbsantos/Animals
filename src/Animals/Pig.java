package Animals;

public class Pig extends Animals{

    public Pig(String name) {
        super(name);
    }

    @Override
    public void makeNoise (){
        System.out.println("Oink oink oink");
    }
}
