package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel1View {
    JPanel page1;
    public Panel1View(JFrame parentFrame, Controller controller, MasterView mv) {

        // Setup size and etc.
        page1 = new JPanel();
        page1.setBounds(0,0,400, 500);//400 width and 500 height

        final JTextField tf=new JTextField();
        tf.setBounds(50,50, 150,20);

        JButton b=new JButton("click");//creating instance of JButton
        b.setBounds(130,100,100, 40);//x axis, y axis, width, height
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // update the model
                controller.setMessage( tf.getText());
                mv.gotoPanel2();

            }
        });

        page1.add(b);//adding button in JFrame
        page1.add(tf);
        page1.setLayout(null);

        // Add panel to the parent
        parentFrame.add(page1);

    }

    public void hide()
    {
        page1.setVisible(false);
    }
}
