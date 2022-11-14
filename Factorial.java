//import calculable.Calculable;
//
//import java.util.HashMap;
//
//public class Factorial {
//
//    protected Calculable calculable;
//
//    protected static HashMap<Double, Double> factorialDp = new HashMap<Double, Double>() {
//        {
//            put(1.0, 1.0);
//            put(0.0, 1.0);
//        }
//    };
//
//
//    public Factorial(Calculable calculable) {
//        this.calculable = calculable;
//    }
//
//    public static double calculateFactorial(double x) {
//
//        if(!factorialDp.containsKey(x)) {
//
//            factorialDp.put(x, x * calculateFactorial(x-1));
//
//        }
//
//        return factorialDp.get(x);
//    }
//
//    @Override
//    public double calculate() {
//        return calculateFactorial(calculable.calculate());
//    }
//
//    @Override
//    public String toString() {
//        return String.format("%s!", calculate());
//    }
//
//    @Override
//    public Boolean isValid() {
//        if(calculable == null || !calculable.isValid()) {
//            return false;
//        }
//        double x = calculable.calculate();
//
//        return x >= 0 && x != (long) x;
//    }
//}
