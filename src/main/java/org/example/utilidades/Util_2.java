package org.example.utilidades;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Util {

   public Boolean buscarCoincidencias(String exprecionRegular, String cadena) {
      Pattern patron = Pattern.compile(exprecionRegular);
      Matcher coincidencia = patron.matcher(cadena);
      {

         if (coincidencia.matches()) {     //hay concidencia
            return true;
         } else {
            return false;
         }


      }

   }
}