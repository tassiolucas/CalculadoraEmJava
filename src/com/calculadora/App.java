package com.calculadora;

import com.calculadora.ui.controller.CalculadoraController;
import com.calculadora.ui.view.CalculadoraFrame;
import javax.swing.*;

public class App {

    public static void main(String[] args) {
        CalculadoraController calculadoraController = new CalculadoraController();
        calculadoraController.showCalculadoraFrameWindow();
    }

}
