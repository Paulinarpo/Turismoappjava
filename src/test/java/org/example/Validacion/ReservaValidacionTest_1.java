package org.example.Validacion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReservaValidacionTest {
    private ReservaValidacion reservalValidacion;

    @BeforeEach

    public void setUP() {
        this.reservalValidacion = new ReservaValidacion();

    }

    @Test
    public void formatoFechaValido(){
        String fechaValida= "14/06/2023";
        Assertions.assertDoesNotThrow(()->reservalValidacion.validarFechaFormato(fechaValida));
    }

    @Test
    public void  formatoFechaInvalido(){
        String fechaInvalida = "14 07 2023";
        Assertions.assertThrows(Exception.class,()->reservalValidacion.validarFechaFormato(fechaInvalida));
    }

    @Test
    public  void numeroPersonasValido(){
        Integer numeroValido = 4;
        Assertions.assertDoesNotThrow(()->reservalValidacion.validarNumeroDePersonas(numeroValido));
    }

    @Test
    public void numeroPersonasInvalido(){
        Integer numeroInvalido = 5;
        Assertions.assertThrows(Exception.class,()->reservalValidacion.validarNumeroDePersonas(numeroInvalido));
    }
}
