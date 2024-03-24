import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class P14_1_calculator extends JFrame implements ActionListener {
    private JTextField textField;
    private JButton[] buttons;
    private String[] buttonLabels = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+",
            "Clear", "%"
    };
    private double num1, num2, result;
    private char operator;

    public P14_1_calculator() {
        setTitle("Calulator ans");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        textField = new JTextField();
        // textField.setEditable(false);

        JPanel buttonPanel = new JPanel(new GridLayout(5, 4));

        buttons = new JButton[buttonLabels.length];
        for (int i = 0; i < buttonLabels.length; i++) {
            buttons[i] = new JButton(buttonLabels[i]);
            buttons[i].addActionListener(this);
            buttonPanel.add(buttons[i]);
        }

        add(textField, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        try {
            switch (command) {
                case "Clear":
                    textField.setText("");
                    break;
                case "=":
                    if (operator != '\u0000') {
                        num2 = Double.parseDouble(textField.getText());
                        result = calculate();
                        textField.setText(String.valueOf(result));
                    }
                    break;
                case "%":
                    num1 = Double.parseDouble(textField.getText());
                    result = num1 / 100;
                    textField.setText(String.valueOf(result));
                    break;
                case "+":
                case "-":
                case "*":
                case "/":
                    num1 = Double.parseDouble(textField.getText());
                    operator = command.charAt(0);
                    textField.setText("");
                    break;
                default:
                    textField.setText(textField.getText() + command);
            }
        } catch (NumberFormatException ex) {
            textField.setText("Error");
        } catch (ArithmeticException ex) {
            textField.setText("Cannot divide by zero");
        }
    }

    private double calculate() {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 == 0)
                    throw new ArithmeticException();
                return num1 / num2;
        }
        return 0;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            P14_1_calculator calculator = new P14_1_calculator();
            calculator.setVisible(true);
        });
    }
}
