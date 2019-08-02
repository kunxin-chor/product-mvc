package com.company;

import javax.swing.*;
import java.awt.event.ActionListener;

public class Panel2View {
    public Panel2View(JFrame parentFrame, ActionListener onButtonClicked) {

        // Setup size and etc.
        JPanel page1 = new JPanel();
        page1.setBounds(0,0,400, 500);//400 width and 500 height

        var textOutput = new JLabel();
        textOutput.setBounds(50,50, 150,20);
        page1.add(textOutput);//adding button in JFrame

        // Add panel to the parent
        parentFrame.add(page1);

    }
}
