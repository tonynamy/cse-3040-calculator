package calculable;

import operator.BinaryOperator;

public class BinaryCalculableObject extends CalculableObject {

    protected BinaryOperator operator;

    public BinaryCalculableObject(CalculableObject object, BinaryOperator operator) {
        super(object);
        this.operator = operator;
    }

    public BinaryCalculableObject(BinaryOperator operator) {
        this(null, operator);
    }

    @Override
    public CalculableNumber calculate() {
        return operator.getOperatorInterface().operate(number, object.calculate());
    }

    @Override
    public String toString() {
        if(number == null) {
            return object.toString() + " " + operator.toString();
        } else {
            return object.toString() + " " + operator.toString() + " " + number.toString();
        }
    }
}
