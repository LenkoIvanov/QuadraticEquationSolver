import java.awt.*;
import javax.swing.*;

public class GUIFrame extends JFrame{
    //entry row for a,b,c
    JPanel row1 = new JPanel();
    JLabel numA = new JLabel("a", JLabel.RIGHT);
    JTextField aEntry = new JTextField("0");
    JLabel numB = new JLabel("b", JLabel.RIGHT);
    JTextField bEntry = new JTextField("0");
    JLabel numC = new JLabel("c",JLabel.RIGHT);
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
        GridLayout layout1 = new GridLayout(1, 4,10,10);
        row1.setLayout(layout1);
        row1.add(numA);
        row1.add(aEntry);
        row1.add(numB);
        row1.add(bEntry);
        row1.add(numC);
        row1.add(cEntry);
        add(row1,BorderLayout.NORTH);

        //layout for row2
        FlowLayout layout2 = new FlowLayout(FlowLayout.CENTER,10,10);
        row2.setLayout(layout2);
        calc.setEnabled(false);
        draw.setEnabled(false);
        row2.add(calc);
        row2.add(draw);
        add(row2,BorderLayout.CENTER);

        //layout for row3
        GridLayout layout3 = new GridLayout(1,4,10,10);
        row3.setLayout(layout3);
        row3.add(numX1);
        row3.add(outX1);
        row3.add(numX2);
        row3.add(outX2);
        row3.add(numX);
        row3.add(outX);
        add(row3,BorderLayout.SOUTH);

        setVisible(true);
        pack();
        setResizable(false);
    }

    public static void setLookAndFeel(){
        try{
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        }catch(Exception exc){
            //
        }
    }

}
