import java.util.ArrayList;

public class Number {

    private double x = 0;
    private int dp = 0;

    private ArrayList<CalculateListener> calculateListeners = new ArrayList<>();

    public Number() {

    }

    public Number(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
        notifyListeners();
    }

    public int getDp() {
        return dp;
    }


    public double calculate() {
        return x;
    }


    public String toString() {
        if(x != (long) x) {
            return String.format("%s",x);
        }
        else if(dp > 0) {
            return String.format("%d", (long) x) + ".";
        }
        else {
            return String.format("%d", (long) x);
        }
    }

    public void setDp() {
        if(dp == 0) {
            dp = 1;
            notifyListeners();
        }
    }

    public void addDigit(double y) {

        if (dp == 0) {
            setX(x * 10 + y);
        } else {
            setX(x + Math.pow(10, -(dp++)) * y);
        }
    }

    public void add(Number y) {
        setX(x + y.x);
    }

    public void subtract(Number y) {
        setX(x - y.x);
    }

    public void multiply(Number y) {
        setX(x * y.x);
    }

    public void divide(Number y) {
        setX(x / y.x);
    }

    public void percent(Number y) {
        setX(x / 100);
    }

    public void sqrt() {
        setX(Math.sqrt(x));
    }

    public void ln() {
        setX(Math.log(x));
    }

    public void log() {
        setX(Math.log10(x));
    }

    public void exp(Number y) {
        setX(Math.pow(x, y.x));
    }



    public void addListener(CalculateListener l) {
        calculateListeners.add(l);
    }


    public void removeListener(CalculateListener l) {
        calculateListeners.remove(l);
    }


    public void notifyListeners() {
        for (CalculateListener l : calculateListeners ) {
            l.performAction(this);
        }
    }


}
