package com.company;

import java.util.Vector;

public class Controller {
    protected Data model;

    public Controller() {
        model = new Data();
    }

    public Controller(Data m) {
        model = m;
    }

    public void setMessage(String message) {
        model.setMessage(message);
    }

    public String getMessage()
    {
        return model.getMessage();
    }

    public Vector<Product> getProducts()
    {
        return model.getAllProducts();
    }


}
