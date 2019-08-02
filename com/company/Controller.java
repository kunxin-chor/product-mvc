package com.company;

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


}
