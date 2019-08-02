package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel1View {
    public Panel1View(JFrame parentFrame, ActionListener onButtonClicked) {

        // Setup size and etc.
        JPanel page1 = new JPanel();
        page1.setBounds(0,0,400, 500);//400 width and 500 height

        final JTextField tf=new JTextField();
        tf.setBounds(50,50, 150,20);

        JButton b=new JButton("click");//creating instance of JButton
        b.setBounds(130,100,100, 40);//x axis, y axis, width, height
        b.addActionListener(onButtonClicked);

        page1.add(b);//adding button in JFrame
        page1.add(tf);
        page1.setLayout(null);

        // Add panel to the parent
        parentFrame.add(page1);

    }
}
