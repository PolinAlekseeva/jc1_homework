package my.tasks32;

public class HomeTechnics {

    String name;

    public static void main(String[] args) {

        Cooker myCooker = new Cooker();
        System.out.println(myCooker.getName() + " weights " + myCooker.getWeight() + " kg.");

        InductionCooker myInduction = new InductionCooker();
        System.out.println(myInduction.getName() + " has " + myInduction.getLenght() + " sm of lenght and weights " + myInduction.getWeight() + " kg");
        myInduction.turnOn();
    }
}
