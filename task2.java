import javax.swing.*;
import java.awt.event.*;

public class SimpleCalculator {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JTextField num1 = new JTextField();
        num1.setBounds(50, 30, 200, 25);

        JTextField num2 = new JTextField();
        num2.setBounds(50, 70, 200, 25);

        JLabel resultLabel = new JLabel("Result: ");
        resultLabel.setBounds(50, 110, 200, 25);

        JButton add = new JButton("+");
        add.setBounds(50, 150, 50, 30);

        JButton subtract = new JButton("-");
        subtract.setBounds(120, 150, 50, 30);

        JButton multiply = new JButton("*");
        multiply.setBounds(50, 200, 50, 30);

        JButton divide = new JButton("/");
        divide.setBounds(120, 200, 50, 30);

        ActionListener action = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double n1 = Double.parseDouble(num1.getText());
                    double n2 = Double.parseDouble(num2.getText());
                    double result = 0;

                    if (e.getSource() == add) result = n1 + n2;
                    else if (e.getSource() == subtract) result = n1 - n2;
                    else if (e.getSource() == multiply) result = n1 * n2;
                    else if (e.getSource() == divide) result = n1 / n2;

                    resultLabel.setText("Result: " + result);
                } catch (Exception ex) {
                    resultLabel.setText("Error");
                }
            }
        };

        add.addActionListener(action);
        subtract.addActionListener(action);
        multiply.addActionListener(action);
        divide.addActionListener(action);

        frame.add(num1);
        frame.add(num2);
        frame.add(resultLabel);
        frame.add(add);
        frame.add(subtract);
        frame.add(multiply);
        frame.add(divide);

        frame.setVisible(true);
    }
}
