package com.company;
import javax.swing.JOptionPane;
public class Main {

    public static void main(String[] args) {
        String first_value;
        first_value = JOptionPane.showInputDialog("first value");
        int a = Integer.parseInt(first_value);
        String last_value;
        last_value = JOptionPane.showInputDialog("last value");
        int b = Integer.parseInt(last_value);
        int c = a+b;
        JOptionPane.showMessageDialog(null,"The value of "+a+" + "+b+" is "+c);
//        JOptionPane.showMessageDialog(null,"The value of c is "+c);
    }
}
