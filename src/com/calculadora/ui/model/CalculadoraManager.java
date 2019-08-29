package com.calculadora.ui.model;

import com.calculadora.ui.controller.CalculadoraController;

public class CalculadoraManager {

    private Float resultado;

    private CalculadoraController calculadoraController;

    public String makeACount(String entrada) {
        int count = 1;
        String[] algarismos = entrada.split("\\W");

        resultado = toFloat(algarismos[0]);

        char[] caracter = entrada.toCharArray();

        for (int i = 0; i < entrada.length(); i++) {
            switch (caracter[i]) {
                case '+':
                    resultado += toFloat(algarismos[count]);
                    count++;
                    break;

                case '-':
                    resultado -= toFloat(algarismos[count]);
                    count++;
                    break;

                case '/':
                    try {
                        resultado /= toFloat(algarismos[count]);
                        count++;
                    } catch (Exception e) { }
                    break;

                case '*':
                    resultado *= toFloat(algarismos[count]);
                    count++;
                    break;

                default:
                    break;
            }
        }

        return resultado.toString();
    }

    private Float toFloat(String text) {
        try { return Float.valueOf(text); } catch (Exception e) { return 0F; }
    }
}
