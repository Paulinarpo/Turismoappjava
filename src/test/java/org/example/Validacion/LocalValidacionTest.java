package org.example.Validacion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LocalValidacionTest {
    private LocalValidacion localValidacion;

    @BeforeEach

    public void setUP() {
        this.localValidacion = new LocalValidacion();

    }


    @Test
    public void nitValido (){
        Integer validoNit = 8;
        Assertions.assertDoesNotThrow(()->localValidacion.validarNit(validoNit));
    }

    @Test
    public void nitInvalido (){
        Integer InvalidoNit = 18;
        Assertions.assertThrows(Exception.class,()->localValidacion.validarNit(InvalidoNit));
    }

    @Test
    public void nombreEmpresaValido(){
        String nombreValido = "Roncaldas";
        Assertions.assertDoesNotThrow(()->localValidacion.validarNombreEmpresa(nombreValido));
    }

    @Test public void nombreEmpresaInvalido(){
        String nombreInvalido= "qimhjk89";
        Assertions.assertThrows(Exception.class,()->localValidacion.validarNombreEmpresa(nombreInvalido));
    }
}