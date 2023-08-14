package org.example.Modelos;

import org.example.Validacion.ReservaValidacion;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Reserva {
    private Integer id;
    private Integer idUsuario;
    private Integer idOferta;
    private Double costoTotal;
    private LocalDate fechaReserva;
    private Integer numeroDePersonas;
    private ReservaValidacion validacion;

    public Reserva() {
        this.validacion = new ReservaValidacion();
    }

    public Reserva(Integer id, Integer idUsuario, Integer idOferta, Double costoTotal, LocalDate fechaReserva, Integer numeroDePersonas) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.idOferta = idOferta;
        this.costoTotal = costoTotal;
        this.fechaReserva = fechaReserva;
        this.numeroDePersonas = numeroDePersonas;
        this.validacion = new ReservaValidacion();
    }




    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getIdOferta() {
        return idOferta;
    }

    public void setIdOferta(Integer idOferta) {
        this.idOferta = idOferta;
    }

    public Double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(Double costoTotal) {
        this.costoTotal = costoTotal;
    }

    public LocalDate getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(String fechaReserva) {
        try {
            validacion.validarFechaFormato(fechaReserva);
            validacion.validarFechaFormato(fechaReserva);
            this.fechaReserva = LocalDate.parse(fechaReserva, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }


    public Integer getNumeroDePersonas() {
        return numeroDePersonas;
    }

    public void setNumeroDePersonas(Integer numeroDePersonas)  {
        try {
            validacion.validarNumeroDePersonas(numeroDePersonas);
            this.numeroDePersonas = numeroDePersonas;
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }
}

