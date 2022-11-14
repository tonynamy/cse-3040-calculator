package operator;

import calculable.CalculableNumber;

public enum UnaryOperator {

    SQRT(0, "√(", ")"),
    FACTORIAL(1, "", "!"),
    LN(2, "ln(", ")"),
    LOG(3, "log(", ")"),
    PERCENTAGE(4, "", "%");

    private final int ordinal;
    private final String startString;
    private final String endString;
    private final IUnaryOperator operator;

    private UnaryOperator(int ordinal, String startString, String endString) {

        this.ordinal = ordinal;
        this.startString = startString;
        this.endString = endString;

        switch (ordinal) {
            case 0 -> this.operator = (a) -> new CalculableNumber(Math.sqrt(a.getValue()));
            case 1 -> this.operator = (a) -> new CalculableNumber(a.getValue());
            case 2 -> this.operator = (a) -> new CalculableNumber(a.getValue());
            case 3 -> this.operator = (a) -> new CalculableNumber(a.getValue());
            case 4 -> this.operator = (a) -> new CalculableNumber(a.getValue());
            default -> throw new AssertionError("지원하지 않는 연산자입니다.");
        }


    }

    public IUnaryOperator getOperator() {
        return operator;
    }

    public String toString(String item) {
        return this.startString + item + this.endString;
    }
}