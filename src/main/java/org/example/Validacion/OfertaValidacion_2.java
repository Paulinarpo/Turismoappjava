package org.example.Validacion;

import org.example.utilidades.Mensajes;
import org.example.utilidades.Util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class OfertaValidacion {


    protected Util util = new Util();

    public OfertaValidacion() {
    }

    public Boolean ValidarTitulo(String titulo) throws Exception {
        if (titulo.length() <= 10) {
            return true;
        } else {
            throw new Exception(Mensajes.TITULO_VALIDACION.getMensaje());
        }
    }

    public Boolean validarFechas(LocalDate fechaInicio, LocalDate fechaFin) throws Exception {
        if (fechaFin.isBefore(fechaInicio)) {
            throw new Exception(Mensajes.FECHA_EVENTO.getMensaje());
        } else {
            return true;

        }
    }

    public Boolean validarFormatoFecha(String fecha) throws Exception {
        String regex = "(\\d{2})/(\\d{2})/(\\d{4})";
        if (!util.buscarCoincidencias(regex, fecha)) {
            throw new Exception(Mensajes.FECHA_OFERTA.getMensaje());
        }else {
            return true;
        }
    }
    public void costoPersona(double costoPorPersona) throws Exception {
        if(costoPorPersona < 0) {
            throw new Exception(Mensajes.COSTO_VALIDACION.getMensaje());
        }
    }


    public void validarFechas(LocalDate fechaFin) {
    }
}


