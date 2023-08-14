package org.example.Validacion;

import org.example.utilidades.Mensajes;
import org.example.utilidades.Util;

public class LocalValidacion {
    protected Util util=new Util();

    public LocalValidacion() {
    }
    public Boolean validarNit(Integer nit ) throws  Exception {
        String exprecionRegular = "\\d+";

        if (!util.buscarCoincidencias(exprecionRegular, String.valueOf(nit))){
            throw new Exception(Mensajes.NIT_INVALIDO.getMensaje());
        } else if (nit.longValue()>10) {
            throw new Exception(Mensajes.CARACTER_INVALIDO.getMensaje());
        }else{
            return true;
        }
    }

    public Boolean validarNombreEmpresa(String nombre)throws  Exception{
        if (nombre.length()<30){
           return true;
        }else {
            throw new Exception(Mensajes.EMPRESA_IVALIDO.getMensaje());
        }
    }
            }
