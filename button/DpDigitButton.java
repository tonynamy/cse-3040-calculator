package button;

import calculable.CalculableNumber;
import calculable.CalculableObject;

public class DpDigitButton extends DigitButton {

    public DpDigitButton(DigitButtonListener digitButtonListener) {
        super(digitButtonListener);
        this.setLabel(".");
    }

    @Override
    DigitOperation getDigitOperation() {
        return new DigitOperation() {
            @Override
            public CalculableNumber operate(CalculableNumber number) {
                number.setDp();
                return number;
            }
        };
    }

}
