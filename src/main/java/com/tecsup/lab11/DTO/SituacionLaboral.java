package com.tecsup.lab11.DTO;

public enum SituacionLaboral {
    EMPLEADO("Empleado"),
    INDEPENDIENTE("Independiente"),
    DESEMPLEADO("Desempleado");

    private final String label;

    SituacionLaboral(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
