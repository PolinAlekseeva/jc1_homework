package my.task33;

public abstract class BankCards {
    long cardNumber;
    String region;

    abstract String getRegion();
    abstract long getCardNumber();


    public static void main(String[] args) {

        CardRegion myCardRegion = new CardRegion();
        System.out.print("Cards with 4 first numbers like on this card " + myCardRegion.getCardNumber() + " " + "are always from ");
        System.out.println(myCardRegion.getRegion());

        CardCountry myCardCountry = new CardCountry();
        System.out.println(" For cards from " + myCardCountry.getRegion() + " the original country of these bankcards is " + myCardCountry.getCountry());

    }
}
