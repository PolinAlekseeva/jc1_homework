package my.task34;

abstract class Staff {
    String position;
    double wage;

    abstract double calcSalary();
    abstract String getPosition();


    public static void main(String[] args) {
        Manager myManager = new Manager();
        System.out.println("This is " + myManager.getPosition() + " and his salary depends on worked hours. Salary is "  + myManager.calcSalary());

        Master myMaster = new Master();
        System.out.println("This is " + myMaster.getPosition() + " and his salary depends on done work in percent. Salary is " + myMaster.calcSalary());


        Worker myWorker = new Worker();
        System.out.println("This is " + myWorker.getPosition() + " and his salary depends on worked hours and on done work in percent. Salary is " + myWorker.calcSalary());
    }
}
