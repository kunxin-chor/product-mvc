package com.company;

import javax.swing.*;

public class ProductView {

    private final Controller controller;
    private JPanel page1;
    private JLabel productName;
    private JLabel productDesc;
    private JLabel productPrice;

    public ProductView(JFrame f, Controller c, MasterView masterView) {
        this.controller = c;

        // Setup size and etc.
        page1 = new JPanel();
        page1.setBounds(0,0,400, 500);//400 width and 500 height

        productName = new JLabel();
        productName.setBounds(50,50, 150,20);
        page1.add(productName);//adding button in JFrame

        productDesc = new JLabel();
        productDesc.setBounds(50,60, 150,20);
        page1.add(productDesc);//adding button in JFrame

        productPrice = new JLabel();
        productPrice.setBounds(50,120, 150,20);
        page1.add(productPrice);//adding button in JFrame

        // Add panel to the parent
        f.add(page1);
    }

    public void refresh()
    {
        var product = controller.getSelectedProduct();
        productName.setText(product.getName());
        productDesc.setText(product.getDescription());
        productPrice.setText(product.getPrice() + "");

    }

    public void hide() {
        page1.setVisible(false);
    }

    public void show() {
        page1.setVisible(true);
        refresh();
    }

}
