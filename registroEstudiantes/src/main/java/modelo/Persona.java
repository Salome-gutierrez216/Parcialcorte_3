package com.myclase.registroestudiantes;

public class Persona {
    private String nombre;
    private String direccion;
    private String telefono;
    private String fechaNacimiento;

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public String getFechaNacimiento() { return fechaNacimiento; }
    public void setFechaNacimiento(String fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }

    public String obtenerInformacion() {
        return "Nombre: " + nombre + " | Tel: " + telefono;
    }

    public String obtenerInformacion(String saludoPersonalizado) {
        return saludoPersonalizado + " " + nombre;
    }
}