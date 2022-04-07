package my.tasks32;

public class InductionCooker extends Cooker implements Turnable{

    float lenght= 120.5f;

    public float getLenght(){
        return lenght;
    }

    @Override
    public void turnOn() {

        System.out.println("Please, turn on your induction cooker");
    }

    public String getName(){

        name = " Induction Cooker";
        return name;
    }

}
