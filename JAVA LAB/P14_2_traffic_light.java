import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class P14_2_traffic_light extends JFrame implements ActionListener {
    private JRadioButton redButton, yellowButton, greenButton;
    private JPanel trafficPanel, buttonPanel;
    private ButtonGroup buttonGroup;

    public P14_2_traffic_light() {
        setTitle("Traffic Light Simulator");
        setSize(200, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        trafficPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                drawTrafficLight(g);
            }
        };
        trafficPanel.setPreferredSize(new Dimension(100, 300));

        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(3, 1));
        
        redButton = new JRadioButton("Red");
        redButton.addActionListener(this);
        
        yellowButton = new JRadioButton("Yellow");
        yellowButton.addActionListener(this);
        
        greenButton = new JRadioButton("Green");
        greenButton.addActionListener(this);
        
        buttonGroup = new ButtonGroup();
        buttonGroup.add(redButton);
        buttonGroup.add(yellowButton);
        buttonGroup.add(greenButton);

        buttonPanel.add(redButton);
        buttonPanel.add(yellowButton);
        buttonPanel.add(greenButton);

        add(trafficPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.EAST);

        setVisible(true);
    }

    private void drawTrafficLight(Graphics g) {
        int diameter = 50;
        int centerX = (trafficPanel.getWidth() - diameter) / 2;
        int startY = 20;
        
        g.setColor(Color.black);
        g.fillOval(centerX, startY, diameter, diameter);
        g.fillOval(centerX, startY + diameter + 10, diameter, diameter);
        g.fillOval(centerX, startY + (diameter + 10) * 2, diameter, diameter);
        
        if (redButton.isSelected()) {
            g.setColor(Color.red);
            g.fillOval(centerX, startY, diameter, diameter);
        } else if (yellowButton.isSelected()) {
            g.setColor(Color.yellow);
            g.fillOval(centerX, startY + diameter + 10, diameter, diameter);
        } else if (greenButton.isSelected()) {
            g.setColor(Color.green);
            g.fillOval(centerX, startY + (diameter + 10) * 2, diameter, diameter);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        trafficPanel.repaint();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new P14_2_traffic_light());
    }
}
