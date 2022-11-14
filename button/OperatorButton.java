package button;

import calculable.CalculableObject;

import java.awt.event.ActionEvent;

abstract class OperatorButton extends CalculatorButton {
    protected OperatorButtonListener operatorButtonListener;

    public OperatorButton(OperatorButtonListener operatorButtonListener) {
        super();
        this.operatorButtonListener = operatorButtonListener;
        this.addActionListener(this);
    }

    abstract CalculableObject getCalculableObject();

    @Override
    public void actionPerformed(ActionEvent e) {
        this.operatorButtonListener.onClicked(getCalculableObject());
    }
}