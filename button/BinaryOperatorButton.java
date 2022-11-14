package button;


import calculable.BinaryCalculableObject;
import calculable.CalculableObject;
import operator.BinaryOperator;

public class BinaryOperatorButton extends OperatorButton {

    protected BinaryOperator operator;

    public BinaryOperatorButton(BinaryOperator operator, OperatorButtonListener operatorButtonListener) {
        super(operatorButtonListener);
        this.operator = operator;
        this.setLabel(operator.toString());
    }

    @Override
    BinaryCalculableObject getCalculableObject() {
        return new BinaryCalculableObject(operator);
    }
}
