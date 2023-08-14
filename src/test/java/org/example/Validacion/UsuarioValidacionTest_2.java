package org.example.Validacion;

import org.example.utilidades.Mensajes;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioValidacionTest {

    //1.preparando
    //probando el objeto usuario validaciones

    private UsuarioValidacion usuarioValidacion; // creacion de constructor

    @BeforeEach
    public void setUP() {
        this.usuarioValidacion = new UsuarioValidacion(); //creacion de atributo

    }

    @Test
    public void validarNombreUsuarioCorrecto() {
        String nombreValido = "paulina restrepo"; //preparando //2 y 3 ejecutar y verificar

        Assertions.assertDoesNotThrow(() -> usuarioValidacion.validarNombre(nombreValido));
    }

    @Test
    public void validarNombreUsuarioIncorrecto() {
        String nombreInvalido = "Pauli 1234 loa"; //preparando

        Exception exepcion = Assertions.assertThrows(Exception.class, () -> usuarioValidacion.validarNombre(nombreInvalido));
        Assertions.assertEquals(Mensajes.NOBRE_SOLO_LETRAS.getMensaje(), exepcion.getMessage());

    }

    @Test
    public void correoValido() {
        String correoValido = "camil@gmail.com"; //
        Assertions.assertDoesNotThrow(() -> usuarioValidacion.validarCorreo(correoValido));//no espera exepcion


    }

    @Test
    public void correoInvalido() {
        String correoInvalidoPorArroba = "paulgmail.com";
        String correInvalidoPorCom = "pau..gmail"; //
        Assertions.assertThrows(Exception.class, () -> usuarioValidacion.validarCorreo(correoInvalidoPorArroba));
        Assertions.assertThrows(Exception.class, () -> usuarioValidacion.validarCorreo(correInvalidoPorCom));//espera exepciones
    }


    @Test
    public void ubicacionVaida() {
        Integer ubicacionValida = 3;
        Assertions.assertDoesNotThrow(() -> usuarioValidacion.validarUbicacion(ubicacionValida));
    }
}
