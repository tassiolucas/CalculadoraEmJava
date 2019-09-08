package com.calculadora.ui.model;

import com.calculadora.ui.controller.CalculadoraController;
import java.text.DecimalFormat;

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

        return toVisor(resultado);
    }

    private Float toFloat(String text) {
        try { return Float.valueOf(text); } catch (Exception e) { return 0F; }
    }

    public String toVisor(Float resultado) {
        DecimalFormat numberResult;
        if ((resultado == Math.floor(resultado)) && !Double.isInfinite(resultado)) {
            numberResult = new DecimalFormat("#,##0");
        } else {
            numberResult = new DecimalFormat("#,##0.00");
        }
        String numberAsString = numberResult.format(resultado);
        return numberAsString;
    }
}
