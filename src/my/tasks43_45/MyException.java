package my.tasks43_45;

public class MyException extends Throwable {

    public void doSome() {
        try {
                throw new MyException();

        } catch (MyException e) {
            System.out.println("My exception is surrounded with try catch " + e);
            e.printStackTrace();

        }
    }
        public static void main (String[]args){
            MyException myException = new MyException();
            myException.doSome();
        }
    }
