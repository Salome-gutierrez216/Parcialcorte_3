package com.myclase.registroestudiantes;

public class Profesor extends Persona {
    private String cedula;
    private String area;
    private double salarioPorHora;
    private int horasDictadas;

    public String getCedula() { return cedula; }
    public void setCedula(String cedula) { this.cedula = cedula; }

    public String getArea() { return area; }
    public void setArea(String area) { this.area = area; }

    public double getSalarioPorHora() { return salarioPorHora; }
    public void setSalarioPorHora(double salarioPorHora) { this.salarioPorHora = salarioPorHora; }

    public int getHorasDictadas() { return horasDictadas; }
    public void setHorasDictadas(int horasDictadas) { this.horasDictadas = horasDictadas; }

    public double calcularPagoTotal() {
        double pagoBase = salarioPorHora * horasDictadas;
        double bonoPreparacion = pagoBase * 0.30;
        return pagoBase + bonoPreparacion;
    }

    public double calcularPrestaciones() {
        return calcularPagoTotal() * 0.19;
    }

    @Override
    public String obtenerInformacion() {
        return super.obtenerInformacion() + " | Área: " + area + " | Pago Total: $" + calcularPagoTotal();
    }
}