package my.task24_25.atm25;

import org.w3c.dom.ls.LSOutput;

public class Atm {
    private int nominal20;
    private int nominal50;
    private int nominal100;
    private int allBanknotes;

    public Atm(int nominal20, int nominal50, int nominal100) {
        this.nominal20 = nominal20;
        this.nominal50 = nominal50;
        this.nominal100 = nominal100;

    }




    public int addBanknotes20(int number) {
        return nominal20 += number;
    }

    public int addBanknotes50(int number) {
        return nominal50 += number;
    }

    public int addBanknotes100(int number) {
        return nominal100 += number;
    }


    public String getAllBanknotes(){
        allBanknotes = nominal20*20 + nominal50 *50 + nominal100*100;
        return "Total is: " + allBanknotes + "RUB";

    }



    public boolean enterSum(int amount) {

            int amountBanknotes20 = nominal20;
            int amountBanknotes50 = nominal50;
            int amountBanknotes100 = nominal100;
            int nominal20 = 20;
            int nominal50 = 50;
            int nominal100 = 100;
            int amountAllBanknotes = nominal20 * amountBanknotes20 + nominal50 * amountBanknotes50
                    + nominal100 * amountBanknotes100;
            boolean check;


            System.out.println("Amount of all banknotes: " + amountAllBanknotes);
            if (amountAllBanknotes < amount || amount % 10 != 0 || amount == 0) {
                check = false;
            } else {
                while (amount > 0 && amountBanknotes100 > 0) {
                    amount -= nominal100;
                    amountBanknotes100--;
                }
                if (amount < 0) {
                    amount += nominal100;
                    amountBanknotes100++;
                }
                while (amount > 0 && amountBanknotes50 > 0) {
                    amount -= nominal50;
                    amountBanknotes50--;
                }
                if (amount < 0) {
                    amount += nominal50;
                    amountBanknotes50++;
                }
                while (amount > 0 && amountBanknotes20 > 0) {
                    amount -= nominal20;
                    amountBanknotes20--;
                }
                check = true;
            }
            return check;
        }

    }

