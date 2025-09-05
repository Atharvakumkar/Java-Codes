class ArithmeticExceptionMaths extends Exception {
    public ArithmeticExceptionMaths(String message) {
        super(message);
    }
}

class ArithmeticCalculator {

    double num1;
    double num2;

    public ArithmeticCalculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void add() throws ArithmeticExceptionMaths {
        double sum = num1 + num2;
        if (num1 < 0 || num2 < 0) {
            throw new ArithmeticExceptionMaths("Number is negative: invalid operation");
        } else {
        System.out.println("Addition: " + sum);
        }
    }

    public void subtract() throws ArithmeticExceptionMaths {
        if (num1 < 0 || num2 < 0) {
            throw new ArithmeticExceptionMaths("Number is negative: invalid operation");
        }
        double diff = num1 - num2;
        System.out.println("Subtraction: " + diff);
    }

    public void multiply() throws ArithmeticExceptionMaths {
        if (num1 == 0 || num2 == 0) {
            throw new ArithmeticExceptionMaths("Multiplying by zero is not allowed");
        }
        double mult = num1 * num2;
        System.out.println("Multiplication: " + mult);
    }

    public void divide() throws ArithmeticExceptionMaths {
        if (num2 == 0) {
            throw new ArithmeticExceptionMaths("Division by zero is not allowed");
        }
        double division = num1 / num2;
        System.out.println("Division: " + division);
    }
}

public class calculator {
    public static void main(String[] args) {
        ArithmeticCalculator mathCalculator = new ArithmeticCalculator(-12,20);

        try {
            mathCalculator.add();
    
        } catch (ArithmeticExceptionMaths e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
