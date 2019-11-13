package com.gui.hellogui;

import javax.swing.*;

public class HelloGui1841720184Yusril {

    public static void main(String[] args) {
        JFrame frame;
        frame = new JFrame("Ini percobaan HelloGui Frame");
                        // program akan berhenti jika ditutup
                        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        //lebar, tinggi windows
                        frame.setSize(600, 300);
                        //x,y tampilan pada windows
                        frame.setLocationRelativeTo(null);//menempatkan frame di tengah-tengah layar
                        frame.setLocation(200, 200);
                        frame.setVisible(true);//untuk menampilkan frame
    }
}
