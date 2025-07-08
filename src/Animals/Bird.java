package Animals;

public class Bird extends Animals {

    public Bird(String name) {
        super(name);
    }

    @Override
    public void makeNoise (){
        System.out.println("piu piu piu");
    }
}
