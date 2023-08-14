package org.example.Validacion;

import org.example.utilidades.Mensajes;
import org.example.utilidades.Util;



public class UsuarioValidacion {

    protected Util util = new Util(); //asi se crea el objeto

    public UsuarioValidacion() {
    }

    // métodos ordinarios para validar datos
    public Boolean validarNombre(String nombres) throws Exception {
        String exprecionRegular = "^[a-zA-Z ]+$";

        if (!util.buscarCoincidencias(exprecionRegular, nombres)) {
            throw new Exception(Mensajes.NOBRE_SOLO_LETRAS.getMensaje());
        } else if (nombres.length() < 10) {
            throw new Exception(Mensajes.NOMBRE_CORTO.getMensaje());
        } else {
            return true;
        }
    }

    public Boolean validarCorreo(String correo) throws Exception {
        String exprecionRegular = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

        if (!util.buscarCoincidencias(exprecionRegular, correo)) {
            throw new Exception(Mensajes.CORREO_INVALIDO.getMensaje());}
        else{
            return true;


            }
        }

    public Boolean validarUbicacion(Integer ubicacion){
        if (ubicacion.equals(1) || ubicacion.equals(2) || ubicacion.equals(3) || ubicacion.equals(4)) {
            return true;
        } else {
            throw new IllegalArgumentException(Mensajes.ZONA_INVALIDA.getMensaje());
        }
}

}


