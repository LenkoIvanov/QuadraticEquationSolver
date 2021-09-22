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
        pack();
        setResizable(false);
    }

    public void actionPerformed(ActionEvent e){
        String s1 = aEntry.getText();
        String s2 = bEntry.getText();
        String s3 = cEntry.getText();
        //int a = Integer.parseInt(s1);
       // int b = Integer.parseInt(s2);
        //int c = Integer.parseInt(s3);
       // int x1 = 0;
       // int x2 = 0;
       // int x = 0;
        if(e.getSource() == calc){
           // EntryPoint.quadraticSolver(a,b,c,x1,x2,x);
            //String s4 = String.valueOf(x1);
           // String s5 = String.valueOf(x2);
            //String s6 = String.valueOf(x);
            outX1.setText(s1);
            outX2.setText(s2);
            outX.setText(s3);
        }
        else{
            //

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