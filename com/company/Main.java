package com.company;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    static String message;
    public static void main(String[] args) {
       Controller c = new Controller();
       MasterView view = new MasterView(c);
    }
}  