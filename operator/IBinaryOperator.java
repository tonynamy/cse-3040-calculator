package operator;

import calculable.CalculableNumber;

public interface IBinaryOperator {
    public CalculableNumber operate(CalculableNumber a, CalculableNumber b);
}
