package my.tasks43_45;

public class ExampleException extends Exception {

    private String exampleText;

    public ExampleException(String exampleText) {
        this.exampleText = exampleText;
    }

    public String getExampleText() {
        return exampleText;
    }

    public void doThing() throws ExampleException {
            throw new ExampleException("Text");
        }


    public static void main(String[] args) {
        ExampleException exampleException = new ExampleException(" ");
        try {
            exampleException.doThing();
        } catch (ExampleException e) {
            e.printStackTrace();
            System.out.println(e.getExampleText());
        }
    }
}