package Animals;

public class Animals {
    private String name;
    private int hungerLevel;
    private int age;

    public Animals(String name) {
        this.name = name;
        this.hungerLevel=20;
        this.age=0;

    }
    public void eat (String food){
        if (hungerLevel<10){
            System.out.println("I'm not hungry, thanks");
            return;
        }
        System.out.println("Huuum. This " + food + " is delicious!");
    }

    public void getOlder (){
        age++;
    }
    public void makeNoise (){

    }
}
