package org.example.Modelos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UsuarioTest {

    private Usuario usuario;

    @BeforeEach
    public void setUp(){
        this.usuario= new Usuario() {
            @Override
            public Double calcularAnualidad() {
                return null;
            }
        };
    }

    @Test
    public void setCorectoNombres(){
        String nombreValido = "jenifer varelas"; //prepare
        this.usuario.setNombres(nombreValido); //ejecute
        Assertions.assertEquals(nombreValido,usuario.getNombres());
        Assertions.assertNotNull(usuario.getNombres());
    }

    @Test
    public void setIncorrectoNombre(){
    String nombreInvalido = "jenifer123 varelas";
    this.usuario.setNombres(nombreInvalido);
    Assertions.assertNotEquals(nombreInvalido,usuario.getNombres());

    }
}