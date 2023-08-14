package org.example.Validacion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;


class OfertaValidacionTest {

    private OfertaValidacion validacionOferta;

    @BeforeEach

    public void setUP() {
        this.validacionOferta = new OfertaValidacion();

    }


    @Test
    public void validarTitulo(){
        String tituloValido = "feria";
        Assertions.assertDoesNotThrow(() -> validacionOferta.ValidarTitulo(tituloValido));
    }

    @Test
    public void validarTituloIncorrecto(){
        String validarIncorrecto= "asdfghjklñ34";

        Assertions.assertThrows(Exception.class,()->validacionOferta.ValidarTitulo(validarIncorrecto));

    }

    @Test
    public void validarFechas(){
        String fechaValida = "15/02/2023";
        Assertions.assertDoesNotThrow(()->validacionOferta.validarFormatoFecha(fechaValida));
    }

    @Test
    public void validarFechaInvalida(){
        String fechaInvalida = "14 07 2023";
        Assertions.assertThrows(Exception.class,()->validacionOferta.validarFechas(LocalDate.parse(fechaInvalida)));
    }

    @Test
    public  void costoPersona (){
        Double valorPersona = 12.0 ;
        Assertions.assertDoesNotThrow(()->validacionOferta.costoPersona(valorPersona));
    }

    @Test
    public  void  costoPersonaInvalido(){
        Double ValorInvalido = -3.0;
        Assertions.assertThrows(Exception.class,()->validacionOferta.costoPersona(ValorInvalido));
    }
}