package my.task38;

public class Garage <T> {

    private T name;

    public T getName(){
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    Car myCar = new Car("BMW");
    Motorcycle myMotorcycle = new Motorcycle("Honda");

}
