package com.company;

import javax.swing.*;

public class MasterView {
    private final ProductView productView;
    private final Panel1View panel1;
    private final Panel2View panel2;
    public MasterView(Controller c) {
        JFrame f=new JFrame();//creating instance of JFrame

        panel1 = new Panel1View(f, c, this);
        panel2 = new Panel2View(f, c, this);
        productView = new ProductView(f,c, this);

        f.setSize(400,500);//400 width and 500 height
        f.setLayout(null);//using no layout managers
        f.setVisible(true);//making the frame visible
    }

    public void gotoPanel2() {
        panel1.hide();
        productView.hide();
        panel2.show();
    }

    public void gotoProductView(){
        panel1.hide();
        panel2.hide();
        productView.show();
    }
}
