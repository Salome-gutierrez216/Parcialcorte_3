package com.myclase.registroestudiantes;

public class Estudiante extends Persona {
    private String codigoEstudiantil;

    public Estudiante(String nombre, String direccion, String telefono, String fechaNacimiento, String codigoEstudiantil) {
        this.setNombre(nombre);
        this.setDireccion(direccion);
        this.setTelefono(telefono);
        this.setFechaNacimiento(fechaNacimiento);
        this.codigoEstudiantil = codigoEstudiantil;
    }

    public String getCodigoEstudiantil() { return codigoEstudiantil; }
    public void setCodigoEstudiantil(String codigoEstudiantil) { this.codigoEstudiantil = codigoEstudiantil; }

    @Override
    public String obtenerInformacion() {
        return super.obtenerInformacion() + " | Código Estudiante: " + codigoEstudiantil;
    }
}