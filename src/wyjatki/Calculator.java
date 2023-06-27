package wyjatki;

class Calculator {
    public double add(double x, double y) {
        return x + y;
    }

    public double subtraction(double x, double y) {
        return x - y;
    }

    public double multiply(double x, double y) {
        return x * y;
    }

    public double divide(double x, double y) throws ArithmeticException {
        if (y == 0)
            throw new ArithmeticException("The divisor can't be 0");
        else
            return x / y;
    }

    public void chooseMathematicalOperation(String option, double x, double y) throws UnknownOperationException {
        if (option.equals("+") || option.equals("-") || option.equals("*") || option.equals("/"))
            switch (option) {
                case "+":
                    double add = add(x,y);
                    System.out.println(add);
                    break;
                case "-":
                    double subtraction = subtraction(x,y);
                    System.out.println(subtraction);
                    break;
                case "*":
                    double multiply = multiply(x,y);
                    System.out.println(multiply);
                    break;
                case "/":
                    double divide = divide(x,y);
                    System.out.println(divide);
                    break;
            }
        else
            throw new UnknownOperationException("Arithmetic operator is different than +, -, * or /. Enter correct operator.");
    }
}
