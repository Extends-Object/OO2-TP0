package anemicos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main_anemico {
    public static void main(String[] args) {

        System.out.println(" ");

        TiempoAnemico b = new TiempoAnemico();

        /*
        POR QUE CONSIDERO QUE ES UNA CLASE ANEMICA:
        -----> No encapsula un estado interno
        -----> Tiene solo atributos y getters/setters
        -----> Toda la lógica (en este caso la lógica de formateo de fecha) se ubica fuera del objeto
        -----> Si se quisiera cambiar la lógica de formateo se tendría que cambiar en todos lados donde se quiera usar
                ese objeto y se esté aplicando esa lógica
        */

        System.out.println("Fecha de hoy en formato corto: " + b.getFecha().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("Fecha de hoy en formato largo: " + b.getFecha().format(DateTimeFormatter.ofPattern("EEEE d 'de' MMMM 'de' yyyy", new Locale("es", "ES"))));
    }
}
