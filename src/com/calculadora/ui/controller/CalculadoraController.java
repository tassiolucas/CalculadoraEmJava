package com.calculadora.ui.controller;

import com.calculadora.ui.view.CalculadoraFrame;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraController {

    private CalculadoraFrame calculadoraFrame;
    private JButton button1;
    private JButton button0;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton buttonDivision;
    private JButton buttonMultiplication;
    private JButton buttonSubtraction;
    private JButton buttonAddition;
    private JButton buttonResult;
    private JTextField visorTextFiel;

    public CalculadoraController() {
        initComponents();
        initListeners();
    }

    public void showCalculadoraFrameWindow() {
        calculadoraFrame.setVisible(true);
    }

    private void initComponents() {
        calculadoraFrame = new CalculadoraFrame();
        button0 = calculadoraFrame.getButton0();
        button1 = calculadoraFrame.getButton1();
        button2 = calculadoraFrame.getButton2();
        button3 = calculadoraFrame.getButton3();
        button4 = calculadoraFrame.getButton4();
        button5 = calculadoraFrame.getButton5();
        button6 = calculadoraFrame.getButton6();
        button7 = calculadoraFrame.getButton7();
        button8 = calculadoraFrame.getButton8();
        button9 = calculadoraFrame.getButton9();
        buttonDivision = calculadoraFrame.getButtonDivision();
        buttonMultiplication = calculadoraFrame.getButtonMultiplication();
        buttonSubtraction = calculadoraFrame.getButtonSubtraction();
        buttonAddition = calculadoraFrame.getButtonAddition();
        buttonResult = calculadoraFrame.getButtonResult();
        visorTextFiel = calculadoraFrame.getVisorTextFiel();
    }

    private void initListeners() {
        button0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                visorTextFiel.setText(visorTextFiel.getText() + '0');
            }
        });

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                visorTextFiel.setText(visorTextFiel.getText() + '1');
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                visorTextFiel.setText(visorTextFiel.getText() + '2');
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                visorTextFiel.setText(visorTextFiel.getText() + '3');
            }
        });

        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                visorTextFiel.setText(visorTextFiel.getText() + '4');
            }
        });

        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                visorTextFiel.setText(visorTextFiel.getText() + '5');
            }
        });

        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                visorTextFiel.setText(visorTextFiel.getText() + '6');
            }
        });

        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                visorTextFiel.setText(visorTextFiel.getText() + '7');
            }
        });

        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                visorTextFiel.setText(visorTextFiel.getText() + '8');
            }
        });

        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                visorTextFiel.setText(visorTextFiel.getText() + '9');
            }
        });

        button0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                visorTextFiel.setText(visorTextFiel.getText() + '0');
            }
        });

        buttonAddition.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                visorTextFiel.setText(visorTextFiel.getText() + '+');
            }
        });

        buttonDivision.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                visorTextFiel.setText(visorTextFiel.getText() + '/');
            }
        });

        buttonMultiplication.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                visorTextFiel.setText(visorTextFiel.getText() + '*');
            }
        });

        buttonSubtraction.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                visorTextFiel.setText(visorTextFiel.getText() + '-');
            }
        });

        buttonResult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                visorTextFiel.setText(visorTextFiel.getText() + '=');
            }
        });
    }
}
