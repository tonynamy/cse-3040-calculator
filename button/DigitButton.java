package button;

import calculable.CalculableNumber;
import calculable.CalculableNumber;
import calculable.CalculableObject;

import java.awt.event.ActionEvent;

abstract class DigitButton extends CalculatorButton {
    protected DigitButtonListener digitButtonListener;

    public DigitButton(DigitButtonListener digitButtonListener) {
        super();
        this.digitButtonListener = digitButtonListener;
        this.addActionListener(this);
    }

    abstract DigitOperation getDigitOperation();

    @Override
    public void actionPerformed(ActionEvent e) {
        this.digitButtonListener.updateNumber(getDigitOperation());
    }
}
