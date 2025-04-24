class CalculatorConundrum {

    public String calculate(int operand1, int operand2, String operation) {
        if (operation == null) {
            throw new IllegalArgumentException("Operation cannot be null");
        }

        if (operation.isEmpty()) {
            throw new IllegalArgumentException("Operation cannot be empty");
        }

        switch (operation) {
            case "+":
                int additionResult = operand1 + operand2;
                return operand1 + " + " + operand2 + " = " + additionResult;

            case "*":
                int multiplicationResult = operand1 * operand2;
                return operand1 + " * " + operand2 + " = " + multiplicationResult;

            case "/":
                try {
                    int divisionResult = operand1 / operand2;
                    return operand1 + " / " + operand2 + " = " + divisionResult;
                } catch (ArithmeticException e) {
                    throw new IllegalOperationException("Division by zero is not allowed", e);
                }

            default:
                throw new IllegalOperationException("Operation '" + operation + "' does not exist");
        }
    }
}