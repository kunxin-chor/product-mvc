package com.company;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    static String message;
    public static void main(String[] args) {
        JFrame f=new JFrame();//creating instance of JFrame
        JPanel page1 = new JPanel();
        JPanel page2 = new JPanel();

        page1.setBounds(0,0,400, 500);//400 width and 500 height
        page2.setBounds(0,0, 400, 500);//400 width and 500 height

        final JTextField tf=new JTextField();
        tf.setBounds(50,50, 150,20);

        var textOutput = new JLabel();
        textOutput.setBounds(50,50, 150,20);

        JButton b=new JButton("click");//creating instance of JButton
        b.setBounds(130,100,100, 40);//x axis, y axis, width, height
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                message = tf.getText();
                page1.setVisible(false);
                textOutput.setText(message);
                page2.setVisible(true);

            }
        });

        page1.add(b);//adding button in JFrame
        page1.add(tf);
        page1.setLayout(null);

        page2.add(textOutput);
        page2.setSize(400, 500);
        page2.setLayout(null);
        page2.setVisible(false);

        f.add(page1);
        f.add(page2);
        f.setSize(400,500);//400 width and 500 height
        f.setLayout(null);//using no layout managers
        f.setVisible(true);//making the frame visible
    }
}  