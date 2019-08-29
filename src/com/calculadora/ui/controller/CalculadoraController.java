package com.calculadora.ui.controller;

import com.calculadora.ui.model.CalculadoraManager;
import com.calculadora.ui.view.CalculadoraFrame;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.calculadora.ui.controller.interfaces.CalculadoraListener;

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
    private JTextField visorTextField;

    private CalculadoraListener calculadoraListener;

    private CalculadoraManager calculadoraManager;

    public CalculadoraController() {
        initComponents();
        initListeners();

        calculadoraManager = new CalculadoraManager();

        this.calculadoraListener = entrada -> visorTextField.setText(calculadoraManager.makeACount(entrada));
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
        visorTextField = calculadoraFrame.getVisorTextFiel();
    }

    private void initListeners() {
        button0.addActionListener(e -> visorTextField.setText(visorTextField.getText() + '0'));

        button1.addActionListener(e -> visorTextField.setText(visorTextField.getText() + '1'));

        button2.addActionListener(e -> visorTextField.setText(visorTextField.getText() + '2'));

        button3.addActionListener(e -> visorTextField.setText(visorTextField.getText() + '3'));

        button4.addActionListener(e -> visorTextField.setText(visorTextField.getText() + '4'));

        button5.addActionListener(e -> visorTextField.setText(visorTextField.getText() + '5'));

        button6.addActionListener(e -> visorTextField.setText(visorTextField.getText() + '6'));

        button7.addActionListener(e -> visorTextField.setText(visorTextField.getText() + '7'));

        button8.addActionListener(e -> visorTextField.setText(visorTextField.getText() + '8'));

        button9.addActionListener(e -> visorTextField.setText(visorTextField.getText() + '9'));

        buttonAddition.addActionListener(e -> {
            if (!visorTextField.getText().equals("")) {
                visorTextField.setText(visorTextField.getText() + '+');
            }
        });

        buttonDivision.addActionListener(e -> {
            if (!visorTextField.getText().equals("")) {
                visorTextField.setText(visorTextField.getText() + '/');
            }
        });

        buttonMultiplication.addActionListener(e -> {
            if (!visorTextField.getText().equals("")) {
                visorTextField.setText(visorTextField.getText() + '*');
            }
        });

        buttonSubtraction.addActionListener(e -> {
            if (!visorTextField.getText().equals("")) {
                visorTextField.setText(visorTextField.getText() + '-');
            }
        });

        buttonResult.addActionListener(e -> calculadoraListener.insertEntry(visorTextField.getText()));
    }
}
