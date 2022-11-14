package calculable;

public class CalculableNumber {
    protected double value = 0;
    private int dp = 0;

    public CalculableNumber() {}
    public CalculableNumber(double value){
        this.value = value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        if(value != (long) value) {
            return String.format("%s", value);
        }
        else if(dp > 0) {
            return String.format("%d", (long) value) + ".";
        }
        else {
            return String.format("%d", (long) value);
        }
    }

    public void setDp() {
        if(dp == 0) {
            dp = 1;
        }
    }

    public void addDigit(double y) {

        if (dp == 0) {
            value = value * 10 + y;
        } else {
            value = value + Math.pow(10, -(dp++)) * y;
        }
    }
}
