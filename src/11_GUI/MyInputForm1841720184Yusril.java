package com.gui.myinputform;

import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;

public class MyInputForm1841720184Yusril extends JFrame {

    private static final int sFRAME_WIDTH = 800;
    private static final int sFRAME_HEIGHT = 200;
    private JLabel mALabel;
    private JLabel mBLabel;
    private JLabel mCLabel;
    private JTextField mAField;
    private JTextField mBField;
    private JButton mButton1;
    private JButton mButton2;
    private JPanel mPanel;

    public MyInputForm1841720184Yusril() {
        createTextFieldYusril();
        createButtonYusril();
        createPanelYusril();
        setSize(sFRAME_WIDTH, sFRAME_HEIGHT);
    }

    private void createTextFieldYusril() {
        mALabel = new JLabel("Nilai A: ");
        mBLabel = new JLabel("Nilai B: ");
        mCLabel = new JLabel("Hasil: ");

        final int FIELD_WIDTH = 10;
        mAField = new JTextField(FIELD_WIDTH);
        mAField.setText("0");
        mBField = new JTextField(FIELD_WIDTH);
        mBField.setText("0");
    }

    private void createButtonYusril() {
        mButton1 = new JButton("Hitung Kali");
        mButton2 = new JButton("Hitung Jumlah");
        class AddInterestListener1841720184Yusril implements ActionListener {

            //untuk event klik
            @Override
            public void actionPerformed(ActionEvent event) {
                int a = Integer.valueOf(mAField.getText());
                int b = Integer.valueOf(mBField.getText());
                int c = a * b;
                mCLabel.setText("Hasil: " + c);
            }
        }
        class AddInterestListener_21841720184Yusril implements ActionListener {

            //untuk event klik
            @Override
            public void actionPerformed(ActionEvent event) {
                int a = Integer.valueOf(mAField.getText());
                int b = Integer.valueOf(mBField.getText());
                int c = a + b;
                mCLabel.setText("Hasil: " + c);
            }
        }
        ActionListener listener = new AddInterestListener1841720184Yusril();
        ActionListener listener2 = new AddInterestListener_21841720184Yusril();
        mButton1.addActionListener(listener);
        mButton2.addActionListener(listener2);
    }
    private void createPanelYusril(){
        mPanel = new JPanel();
        mPanel.add(mALabel);
        mPanel.add(mAField);
        mPanel.add(mBLabel);
        mPanel.add(mBField);
        mPanel.add(mButton1);
        mPanel.add(mButton2);
        mPanel.add(mCLabel);
        add(mPanel);
    } 

}
