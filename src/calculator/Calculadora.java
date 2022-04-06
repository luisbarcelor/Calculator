package calculator;

public class Calculadora {
    public static final String[] CALC_CARACTERES = new String[] {"%", "/", "x", "7", "8", "9", "4", "5", "6",
            "1", "2", "3", "0", ",", "-", "+", "=", "C", "AC", "Mod", "Sqrt", "+/-"};
    private double operando1;
    private double operando2;

    //Getters and setters//

    public double getOperando1() {
        return operando1;
    }

    public double getOperando2() {
        return operando2;
    }

    public void setOperando1(double operando1) {
        this.operando1 = operando1;
    }

    public void setOperando2(double operando2) {
        this.operando2 = operando2;
    }

    //Getters and setters END//

    //Operaciones//
    public double suma() {
        return operando1 + operando2;
    }

    public double resta() {
        return operando1 - operando2;
    }

    public double multiplicacion() {
        return  operando1 * operando2;
    }

    public double division() {
        return operando1 / operando2;
    }

    public double modulo() {
        return operando1 % operando2;
    }

    public double sqrt() {
        return Math.sqrt(operando1);
    }

    //Operaciones END//
}
