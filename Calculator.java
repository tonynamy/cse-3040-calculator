
import button.*;
import calculable.BaseCalculableObject;
import calculable.CalculableNumber;
import calculable.CalculableObject;
import operator.BinaryOperator;
import operator.UnaryOperator;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends Frame {

    protected CalculableObject result;

    protected TextField extraResultTextField = new TextField();
    protected TextField resultTextField = new TextField();

    protected Button factorialButton = new Button();
    protected Button parenthesisOpenButton = new Button();
    protected Button parenthesisCloseButton = new Button();
    protected Button percentageButton = new Button();
    protected Button ACButton = new Button();
    protected Button lnButton = new Button();
    protected Button logButton = new Button();
    protected Button sqrtButton = new Button();
    protected Button expButton = new Button();
    protected Button divideButton = new Button();
    protected Button multiplyButton = new Button();
    protected Button subtractButton = new Button();
    protected Button addButton = new Button();
    protected Button calculateButton = new Button();
    protected Button decimalButton = new Button();

    protected OperatorButtonListener operatorButtonListener = new OperatorButtonListener() {
        @Override
        public void onClicked(CalculableObject a) {
            a.setObject(result);
            result = a;
            resultTextField.setText(result.toString());
        }
    };

    protected DigitButtonListener digitButtonListener = new DigitButtonListener() {
        @Override
        public void updateNumber(DigitOperation operation) {
            result.setNumber(operation.operate(result.getNumberOrCreate()));
            resultTextField.setText(result.toString());
        }
    };

    public Calculator(String str) {
        super(str);
        result = new BaseCalculableObject(new CalculableNumber(0));
        setLayout();

    }

    public void setLayout() {
        this.setSize(1200, 1200);

        Panel mainPanel = new Panel(new GridBagLayout());

        Panel resultPanel = new Panel(new GridBagLayout());

        GridBagConstraints extraResultTextFieldConstraints = new GridBagConstraints();
        extraResultTextFieldConstraints.fill = GridBagConstraints.BOTH;
        extraResultTextFieldConstraints.gridx = 0;
        extraResultTextFieldConstraints.gridy = 0;
        extraResultTextFieldConstraints.weightx = 1;
        extraResultTextFieldConstraints.weighty = 0.1;

        GridBagConstraints resultTextFieldConstraints = new GridBagConstraints();
        resultTextFieldConstraints.fill = GridBagConstraints.BOTH;
        resultTextFieldConstraints.gridx = 0;
        resultTextFieldConstraints.gridy = 1;
        resultTextFieldConstraints.weightx = 1;
        resultTextFieldConstraints.weighty = 0.9;

        extraResultTextField.setEditable(false);
        resultTextField.setEditable(false);

        resultPanel.add(extraResultTextField, extraResultTextFieldConstraints);
        resultPanel.add(resultTextField, resultTextFieldConstraints);

        GridBagConstraints resultPanelConstraints = new GridBagConstraints();
        resultPanelConstraints.fill = GridBagConstraints.BOTH;
        resultPanelConstraints.gridx = 0;
        resultPanelConstraints.gridy = 0;
        resultPanelConstraints.weightx = 1;
        resultPanelConstraints.weighty = 0.3;

        mainPanel.add(resultPanel, resultPanelConstraints);

        Panel buttonPanel = new Panel();
        buttonPanel.setLayout(new GridLayout(5, 5));


        buttonPanel.add(new UnaryOperatorButton(UnaryOperator.FACTORIAL, operatorButtonListener));
        buttonPanel.add(new Button("1"));
        buttonPanel.add(new Button("1"));
        buttonPanel.add(new Button("1"));
        buttonPanel.add(new Button("1"));

        buttonPanel.add(new UnaryOperatorButton(UnaryOperator.LN, operatorButtonListener));
        buttonPanel.add(new NumberDigitButton(7, digitButtonListener));
        buttonPanel.add(new NumberDigitButton(8, digitButtonListener));
        buttonPanel.add(new NumberDigitButton(9, digitButtonListener));
        buttonPanel.add(new BinaryOperatorButton(BinaryOperator.DIVIDE, operatorButtonListener));

        buttonPanel.add(new Button("1"));
        buttonPanel.add(new NumberDigitButton(4, digitButtonListener));
        buttonPanel.add(new NumberDigitButton(5, digitButtonListener));
        buttonPanel.add(new NumberDigitButton(6, digitButtonListener));
        buttonPanel.add(new BinaryOperatorButton(BinaryOperator.MULTIPLY, operatorButtonListener));

        buttonPanel.add(new Button("1"));
        buttonPanel.add(new NumberDigitButton(1, digitButtonListener));
        buttonPanel.add(new NumberDigitButton(2, digitButtonListener));
        buttonPanel.add(new NumberDigitButton(3, digitButtonListener));
        buttonPanel.add(new BinaryOperatorButton(BinaryOperator.SUBTRACT, operatorButtonListener));

        buttonPanel.add(new Button("1"));
        buttonPanel.add(new NumberDigitButton(0, digitButtonListener));
        buttonPanel.add(new DpDigitButton(digitButtonListener));
        buttonPanel.add(new Button("1"));
        buttonPanel.add(new BinaryOperatorButton(BinaryOperator.ADD, operatorButtonListener));

        WindowDestroyer listener = new WindowDestroyer(); // window destroy button
        this.addWindowListener(listener);

        GridBagConstraints buttonPanelConstraints = new GridBagConstraints();
        buttonPanelConstraints.fill = GridBagConstraints.BOTH;
        buttonPanelConstraints.gridx = 0;
        buttonPanelConstraints.gridy = 1;
        buttonPanelConstraints.weightx = 1;
        buttonPanelConstraints.weighty = 0.7;

        mainPanel.add(buttonPanel, buttonPanelConstraints);

        this.add(mainPanel);
        this.pack();


        this.setVisible(true);
    }

    protected ActionListener getFactorialListener() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        };
    }

    protected ActionListener getDigitActionListener() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Button button = (Button) e.getSource();
                double x = Double.valueOf(button.getLabel());
            }
        };
    }

    protected ActionListener getDpActionListener() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        };
    }

    public static void main(String args[]) {
        new Calculator("Calc");
    }

}