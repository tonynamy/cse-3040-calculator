package operator;

import calculable.CalculableNumber;

public enum BinaryOperator {
    ADD("+"), SUBTRACT("-"), MULTIPLY("*"), DIVIDE("/"), MOD("%");

    private final String operator;
    private final IBinaryOperator operatorInterface;

    private BinaryOperator(String operator) {
        this.operator = operator;

        switch (operator) {
            case "+" -> this.operatorInterface = (a, b) -> new CalculableNumber(a.getValue() + b.getValue());
            case "-" -> this.operatorInterface = (a, b) -> new CalculableNumber(a.getValue() - b.getValue());
            case "*" -> this.operatorInterface = (a, b) -> new CalculableNumber(a.getValue() * b.getValue());
            case "/" -> this.operatorInterface = (a, b) -> new CalculableNumber(a.getValue() / b.getValue());
            case "%" -> this.operatorInterface = (a, b) -> new CalculableNumber(a.getValue() % b.getValue());
            default -> throw new AssertionError("지원하지 않는 연산자입니다.");
        }


    }

    public IBinaryOperator getOperatorInterface() {
        return operatorInterface;
    }

    public String toString() {
        return this.operator;
    }
}