package my.tasks43_45;

public class NullException {

    public void doSomething() throws Exception{
        throw new Exception();

    }
public static void main(String[] args){

    NullException nullException = new NullException();
    try {
        nullException.doSomething();
    } catch (Exception e) {
//        System.out.println(e.toString());
        e.printStackTrace();
    }
}
}

