package ru.mirea.praktika4;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class PrimerGUI extends JFrame{
    JTextField t1 = new JTextField(10);
    JTextField t2 = new JTextField(10);
    JButton s1 = new JButton("Addition");
    JButton s2 = new JButton("Subtraction");
    JButton s3 = new JButton("Multiplication");
    JButton s4 = new JButton("Division");
    JButton s5 = new JButton("Clear");
    double a, k;
    double result;

    PrimerGUI(){
        super("Example");
        setLayout(new FlowLayout());
        setSize(250,160); //задаю размер окну
        eHandler handler = new eHandler();
        add(t1);
        add(t2);
        add(s1);
        add(s2);
        add(s3);
        add(s4);
        add(s5);
        setVisible(true); //чтоб окно видным было
        setLocationRelativeTo(null); //окно по центру появлялось
        setResizable(false);      //Размер окна не меняется
        s5.addActionListener(handler);
        s1.addActionListener(handler);
        s2.addActionListener(handler);
        s3.addActionListener(handler);
        s4.addActionListener(handler);
    }
    public class eHandler implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            try{
                a = Double.parseDouble(t1.getText());
                k = Double.parseDouble(t2.getText());
                if(e.getSource() == s5){
                    t1.setText(null);
                    t2.setText(null);
                }
                else if(e.getSource() == s1){
                    result = a + k;
                    JOptionPane.showMessageDialog(null,
                            "Result = "+ result);
                }
                else if(e.getSource() == s2){
                    result = a - k;
                    JOptionPane.showMessageDialog(null,
                            "Result = "+ result);
                }
                else if(e.getSource() == s3){
                    result = a * k;
                    JOptionPane.showMessageDialog(null,
                            "Result = "+ result);
                }
                else if(e.getSource() == s4){
                    result = a / k;
                    JOptionPane.showMessageDialog(null,
                            "Result = "+ result);
                }else
                    JOptionPane.showMessageDialog(null,
                            "Error! Enter the number.",
                            "alert" , JOptionPane.ERROR_MESSAGE);
            }catch (Exception ex){
                //  if(e.getSource() == s5){
                //    t1.setText(null);
                //  t2.setText(null);
                //}
                JOptionPane.showMessageDialog(null,
                        "Error! Enter the number.",
                        "alert" , JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        new PrimerGUI();
    }

}