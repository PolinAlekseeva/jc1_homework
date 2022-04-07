package my.tasks32;

public abstract class HomeTechnics {

    String name;

    abstract String getName();

    abstract float getWeight();


    public static void main(String[] args) {

        Cooker myCooker = new Cooker();
        System.out.println(myCooker.getName() + " weights " + myCooker.getWeight() + " kg.");

        InductionCooker myInduction = new InductionCooker();
        System.out.println(myInduction.getName() + " has " + myInduction.getLenght() + " sm of lenght and weights " + myInduction.getWeight() + " kg");
        myInduction.turnOn();
    }
}
