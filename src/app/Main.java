package app;

public class Main {

    public static void main(String[] args) {

        Substance substance = new Substance();

        System.out.println("Substance temperature +25 ");
        substance.setState(25);

        System.out.println("Substance temperature -5 ");
        substance.setState(-5);
    }
}
