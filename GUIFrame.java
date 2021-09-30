import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class GUIFrame extends JFrame implements ActionListener{
    //entry row for a,b,c
    JPanel row1 = new JPanel();
    JLabel numA = new JLabel("a", JLabel.RIGHT);
    JTextField aEntry = new JTextField("0");
    JLabel numB = new JLabel("b", JLabel.RIGHT);
    JTextField bEntry = new JTextField("0");
    JLabel numC = new JLabel("c", JLabel.RIGHT);
    JTextField cEntry = new JTextField("0");

    //row for buttons
    JPanel row2 = new JPanel();
    JButton calc = new JButton("Calculate");
    JButton draw = new JButton("Draw graph");

    //row for solutions
    JPanel row3 = new JPanel();
    JLabel numX1 = new JLabel("First solution", JLabel.RIGHT);
    JTextField outX1 = new JTextField("0");
    JLabel numX2 = new JLabel("Second solution", JLabel.RIGHT);
    JTextField outX2 = new JTextField("0");
    JLabel numX = new JLabel("One solution", JLabel.RIGHT);
    JTextField outX = new JTextField("0");


    public GUIFrame() {
        super("Quadratic equation solver");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BorderLayout layout = new BorderLayout();
        setLayout(layout);

        //layout for row1
        GridLayout layout1 = new GridLayout(1, 4, 10, 10);
        row1.setLayout(layout1);
        row1.add(numA);
        row1.add(aEntry);
        aEntry.addActionListener(this);
        row1.add(numB);
        row1.add(bEntry);
        bEntry.addActionListener(this);
        row1.add(numC);
        row1.add(cEntry);
        cEntry.addActionListener(this);
        add(row1, BorderLayout.NORTH);

        //layout for row2
        FlowLayout layout2 = new FlowLayout(FlowLayout.CENTER, 10, 10);
        row2.setLayout(layout2);
        calc.setEnabled(true);
        draw.setEnabled(false);
        row2.add(calc);
        calc.addActionListener(this);
        row2.add(draw);
        add(row2, BorderLayout.CENTER);

        //layout for row3
        GridLayout layout3 = new GridLayout(1, 4, 10, 10);
        row3.setLayout(layout3);
        row3.add(numX1);
        row3.add(outX1);
        row3.add(numX2);
        row3.add(outX2);
        row3.add(numX);
        row3.add(outX);
        add(row3, BorderLayout.SOUTH);

        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
        pack();
    }

    public void QuadraticSolver(){
        double a = Double.parseDouble(aEntry.getText());
        double b = Double.parseDouble(bEntry.getText());
        double c = Double.parseDouble(cEntry.getText());
        double delta = Math.pow(b,2.0) - (4.0*a*c);
        if(delta > 0.0){
            double x1 = ((-b) + Math.sqrt(delta))/(2.0 * a);
            double x2 = ((-b) - Math.sqrt(delta))/(2.0 * a);
            outX1.setText(String.valueOf(x1));
            outX2.setText(String.valueOf(x2));
            outX.setText("0");
        }
        else if(delta == 0.0){
            double x = (-b)/(2.0 * a);
            outX1.setText("0");
            outX2.setText("0");
            outX.setText(String.valueOf(x));
        }
        else{
            JOptionPane.showMessageDialog(new JFrame(), "No real roots!", "Error!",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == calc){
           QuadraticSolver();
        }
        else{
            // graph button goes here
        }
    }

    public static void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception exc) {
            //
        }
    }
}