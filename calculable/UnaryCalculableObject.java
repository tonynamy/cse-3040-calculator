package calculable;

import operator.UnaryOperator;

public class UnaryCalculableObject extends CalculableObject {

    protected UnaryOperator operator;

    public UnaryCalculableObject(CalculableObject object, UnaryOperator operator) {
        super(object);
        this.operator = operator;
    }

    public UnaryCalculableObject(UnaryOperator operator) {
        this(null, operator);
    }

    @Override
    public CalculableNumber calculate() {
        return operator.getOperator().operate(object.calculate());
    }

    @Override
    public String toString() {
        return object.toString() + operator.toString();
    }
}

"ln("
")"
