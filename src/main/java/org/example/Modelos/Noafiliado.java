package org.example.Modelos;

public class Noafiliado extends Usuario {

    private Integer NumeroReservas ;
    private final  Double Iva =0.19;

    public Noafiliado() {
    }

    @Override
    public Double calcularAnualidad() {
        Double calculo  = this.calcularAnualidad()+this.Iva;
        return calculo;
    }

    public Noafiliado(Integer id, String documento, String nombres, String correo, Integer ubicacion, Integer numeroReservas) {
        super(id, documento, nombres, correo, ubicacion);
        NumeroReservas = numeroReservas;
    }

    public Integer getNumeroReservas() {
        return NumeroReservas;
    }

    public void setNumeroReservas(Integer numeroReservas) {
        NumeroReservas = numeroReservas;
    }
}
