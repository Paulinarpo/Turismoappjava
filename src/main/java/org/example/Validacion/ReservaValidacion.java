package org.example.Validacion;

import org.example.utilidades.Mensajes;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ReservaValidacion {
    public void validarFechaFormato(String fecha) throws Exception {
        String[] partes = fecha.split("/");
        if (partes.length != 3) {
            throw new Exception(Mensajes.FORMATO_FECHA.getMensaje());
        }
        try {
            Integer.parseInt(partes[0]);
            Integer.parseInt(partes[1]);
            Integer.parseInt(partes[2]);
        } catch (NumberFormatException e) {
            throw new Exception(Mensajes.FORMATO_FECHA.getMensaje());
        }
    }


    public Boolean validarNumeroDePersonas(Integer numeroDePersonas) throws Exception {
        if ((numeroDePersonas <0) ||  (numeroDePersonas > 4) ){
            throw new Exception(Mensajes.NUMERO_RESERVA.getMensaje());
        }else
        {return true;

        }
    }
}
