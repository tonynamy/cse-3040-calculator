package button;


import calculable.BinaryCalculableObject;
import calculable.CalculableObject;
import calculable.UnaryCalculableObject;
import operator.BinaryOperator;
import operator.UnaryOperator;

public class UnaryOperatorButton extends OperatorButton {

    protected UnaryOperator operator;

    public UnaryOperatorButton(UnaryOperator operator, OperatorButtonListener operatorButtonListener) {
        super(operatorButtonListener);
        this.operator = operator;
        this.setLabel(operator.toString());
    }

    @Override
    UnaryCalculableObject getCalculableObject() {
        return new UnaryCalculableObject(operator);
    }
}
