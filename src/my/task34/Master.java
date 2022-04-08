package my.task34;

public class Master extends Staff {

    int percent;

    public double calcSalary() {

        return wage * percent;
    }

    public String getPosition() {

        return "Master";
    }
}
