package button;

import calculable.CalculableNumber;

public class NumberDigitButton extends DigitButton {

    protected int digit;

    public NumberDigitButton(int digit, DigitButtonListener digitButtonListener) {
        super(digitButtonListener);
        this.digit = digit;
        this.setLabel(String.valueOf(digit));
    }
    @Override
    DigitOperation getDigitOperation() {
        return new DigitOperation() {
            @Override
            public CalculableNumber operate(CalculableNumber number) {
                number.addDigit(digit);
                return number;
            }
        };
    }
}
