package com.company;

import javax.swing.*;
import java.awt.event.ActionListener;

public class Panel2View {
    private JLabel textOutput;
    private Controller controller;
    private JPanel page1;
    public Panel2View(JFrame parentFrame, Controller controller, MasterView mv) {


        this.controller = controller;

        // Setup size and etc.
        page1 = new JPanel();
        page1.setBounds(0,0,400, 500);//400 width and 500 height

        textOutput = new JLabel();
        textOutput.setBounds(50,50, 150,20);
        page1.add(textOutput);//adding button in JFrame

        // Add panel to the parent
        parentFrame.add(page1);

    }

    private void refresh()
    {
        // update the UI base on the model
        textOutput.setText(controller.getMessage());

    }

    public void show() {
        refresh();
        page1.setVisible(true);
    }

}
