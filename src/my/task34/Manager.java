package my.task34;

public class Manager extends Staff {
    long workHours;

    public double calcSalary() {

        return wage * workHours;
    }

    public String getPosition() {
        return "Manager";
    }
}
