package calculable;

public class BaseCalculableObject extends CalculableObject{
    public BaseCalculableObject(CalculableNumber number) {
        super(null, number);
    }

    @Override
    public CalculableNumber calculate() {
        return number;
    }

    @Override
    public String toString() {
        return number.toString();
    }
}
