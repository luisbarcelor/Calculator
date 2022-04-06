package calculator;

public class Run {
    public static void main(String[] args) {
        new Window("Calculadora");
        Calculadora calculadora = new Calculadora();
    }

    public static void ejecutarEnEvento() {
        System.out.println(MyListener.getOrigenEvento());
    }
}
