package com.tecsup.lab11.controller;

public class ResultadoMultiplicacion {
    private int resultado;
    private boolean esPar;

    public ResultadoMultiplicacion(int resultado, boolean esPar){
        this.resultado = resultado;
        this.esPar= esPar;
    }
    public int getResultado() {
        return resultado;
    }

    public boolean isEsPar() {
        return esPar;
    }
}
