package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel1View {
    JPanel page1;
    private JComboBox<Product> products;
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

        // add products
        products = new JComboBox<>(controller.getProducts());
        products.setBounds(50, 300,200,50);
        page1.add(products);

        JButton b2=new JButton("See More");//creating instance of JButton
        b2.setBounds(50, 360, 100, 50);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.setSelectedProduct(products.getItemAt(products.getSelectedIndex()));
                mv.gotoProductView();
            }
        });
        page1.add(b2);

        // Add panel to the parent
        parentFrame.add(page1);

    }

    public void hide()
    {
        page1.setVisible(false);
    }
}
