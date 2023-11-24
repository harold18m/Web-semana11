package com.tecsup.lab11.DTO;

import jakarta.validation.constraints.*;

import java.time.LocalDate;
public class formularioDTO {
    @NotBlank(message = "Campo obligatorio")
    private String numeroDeDocumento;
    @NotBlank(message = "Campo obligatorio")
    private String apellidoPaterno;
    @NotBlank(message = "Campo obligatorio")
    private String apellidoMaterno;
    @NotBlank(message = "Campo obligatorio")
    private String nombres;
    private LocalDate fechaNacimiento;
    @NotNull(message = "Seleccione una opción")
    private OpcionesSexo sexo;
    @NotNull(message = "Seleccione una opción")
    private EstadoCivil estadoCivil;
    @NotNull(message = "Seleccione una opción")
    private SituacionLaboral situacionLaboral;
    @NotBlank(message = "Campo obligatorio")
    @Pattern(regexp = "\\d{11}", message = "El RUC del empleador debe tener 11 dígitos")
    private String EmpleadorRUC;

    public String getNumeroDeDocumento() {
        return numeroDeDocumento;
    }

    public void setNumeroDeDocumento(String numeroDeDocumento) {
        this.numeroDeDocumento = numeroDeDocumento;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public OpcionesSexo getSexo() {
        return sexo;
    }

    public void setSexo(OpcionesSexo sexo) {
        this.sexo = sexo;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public SituacionLaboral getSituacionLaboral() {
        return situacionLaboral;
    }

    public void setSituacionLaboral(SituacionLaboral situacionLaboral) {
        this.situacionLaboral = situacionLaboral;
    }

    public String getEmpleadorRUC() {
        return EmpleadorRUC;
    }

    public void setEmpleadorRUC(String empleadorRUC) {
        EmpleadorRUC = empleadorRUC;
    }

    public OpcionesSexo[] getOpcionesSexo() {
        return OpcionesSexo.values();
    }

    public EstadoCivil[] getEstadoCivils() {
        return EstadoCivil.values();
    }

    public SituacionLaboral[] getSituacionLaborals() {
        return SituacionLaboral.values();
    }
}
