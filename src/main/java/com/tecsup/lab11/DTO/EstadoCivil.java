package com.tecsup.lab11.DTO;

public enum EstadoCivil {
    SOLTERO("Soltero(a)"),
    CASADO("Casado(a)"),
    DIVORCIADO("Divorciado(a)"),
    VIUDO("Viudo(a)");

    private final String label;

    EstadoCivil(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
