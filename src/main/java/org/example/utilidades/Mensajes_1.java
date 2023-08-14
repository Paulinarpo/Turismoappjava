package org.example.utilidades;

public enum Mensajes {
    NOBRE_SOLO_LETRAS ("El nombre de usuario solo puede tener letras o espacios"),
    NOMBRE_CORTO ("Señor reviser la cantidad de caracteres es muy pequeña"),
    CORREO_INVALIDO ("Señor usuario su correo no es valido  "),
    ZONA_INVALIDA ("La zona ingresada no es válida"),

    NIT_INVALIDO ("Porfavor digite datos validos"),

    CARACTER_INVALIDO("Digite el numero de caracteres permitidos"),

    EMPRESA_IVALIDO("Digite el nombre de la empresa permitidos"),

    FORMATO_FECHA("La fecha ingresada no tiene el formato 'DD/MM/YYYY'"),

    NUMERO_RESERVA("El número de personas por reserva no puede ser mayor a 4"),
    TITULO_VALIDACION("El titulo no puede sobrepasar los caracteres"),
    FECHA_EVENTO("La fecha de inicio no puede ser mayor que la fecha de fin"),
    FECHA_OFERTA("las fechas deben ser de DD/MM/YYYY"),
    COSTO_VALIDACION("El costo por persona no es valido");



    String mensaje;


    private String Mensaje;

    Mensajes(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }
}
