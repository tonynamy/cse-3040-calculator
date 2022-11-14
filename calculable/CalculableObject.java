package calculable;

public abstract class CalculableObject {
    protected CalculableObject object;
    protected CalculableNumber number;

    {
        new CalculableNumber();
    }

    public CalculableObject(CalculableObject object, CalculableNumber number) {
        this.object=object;
        this.number=number;
    }
    public CalculableObject(CalculableObject object) {
        this(object, null);
    }
    public abstract CalculableNumber calculate();
    public abstract String toString();

    public void setObject(CalculableObject object) {
        this.object = object;
    }

    public void setNumber(CalculableNumber number) {
        this.number = number;
    }

    public CalculableObject getObject() {
        return object;
    }

    public CalculableNumber getNumber() {
        return this.number;
    }

    public CalculableNumber getNumberOrCreate() {
        if(number == null) {
            this.number = new CalculableNumber();
        }

        return this.number;
    }
}
