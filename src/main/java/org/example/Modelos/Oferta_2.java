package org.example.Modelos;

import org.example.Validacion.OfertaValidacion;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Oferta {

    private Integer id;

    private String titulo;

    private String descripcion;

    private LocalDate fechaInicio;

    private LocalDate fechaFin;

    private Double costoPersona;

    private Integer idLocal;

    private OfertaValidacion Validacion = new OfertaValidacion();

    public Oferta() {
    }

    public Oferta(Integer id, String titulo, String descripcion, LocalDate fechaInicio, LocalDate fechaFin, Double costoPersona, Integer idLocal) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.costoPersona = costoPersona;
        this.idLocal = idLocal;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) throws Exception {
       try {

        this.Validacion.validarFormatoFecha(fechaInicio);
           DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
           LocalDate fechaConvertida = LocalDate.parse(fechaInicio,formatter);
           this.fechaInicio=fechaConvertida;
       }catch (Exception error){
           System.out.println(error.getMessage());
       }
    }


    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) throws Exception {
        try{
            this.Validacion.validarFormatoFecha(fechaFin);

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate fechaConvertida = LocalDate.parse(fechaFin, formatter);

            this.Validacion.validarFechas(this.fechaInicio,fechaConvertida); //valido diferenica

            this.fechaFin =  fechaConvertida;



        }catch (Exception error){
            System.out.println(error.getMessage());
        }

    }




    public Double getCostoPersona() {
        return costoPersona;
    }

    public void setCostoPersona(Double costoPersona) {
        this.costoPersona = costoPersona;
    }

    public Integer getIdLocal() {
        return idLocal;
    }

    public void setIdLocal(Integer idLocal) {
        this.idLocal = idLocal;
    }


}