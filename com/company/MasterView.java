package com.company;

import javax.swing.*;

public class MasterView {
    Panel1View panel1;
    Panel2View panel2;
    public MasterView(Controller c) {
        JFrame f=new JFrame();//creating instance of JFrame

        panel1 = new Panel1View(f, c, this);
        panel2 = new Panel2View(f, c, this);

        f.setSize(400,500);//400 width and 500 height
        f.setLayout(null);//using no layout managers
        f.setVisible(true);//making the frame visible
    }

    public void gotoPanel2() {
        panel1.hide();
        panel2.show();
    }
}
