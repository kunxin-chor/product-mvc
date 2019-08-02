package com.company;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    static String message;
    public static void main(String[] args) {
        JFrame f=new JFrame();//creating instance of JFrame

        // Create the callback which Panel1View needs
        var onButtonClicked = new ActionListener(){
            public void actionPerformed(ActionEvent e){


            }
        };

        var panel1 = new Panel1View(f, onButtonClicked);
        var panel2 = new Panel2View(f);

        f.setSize(400,500);//400 width and 500 height
        f.setLayout(null);//using no layout managers
        f.setVisible(true);//making the frame visible
    }
}  