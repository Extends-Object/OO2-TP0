package no_anemicos;

import anemicos.TiempoAnemico;

import java.time.format.DateTimeFormatter;
import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main_no_anemico {
    public static void main(String[] args) {
        System.out.println(" ");

        Tiempo a = new Tiempo();

        //Los metodos usan el estado interno en vez crear una fecha nueva cada llamada a los metodos
        //En el constructor instancia la fecha actual y ese dato establece el estado interno del objeto

        //POR QUE CONSIDERO QUE ES UNA CLASE NO ANEMICA:
        //-----> Encapsula un estado interno y que se inicializa en el constructor
        //-----> Los metodos implementados utilizan el estado interno en vez de instanciar variables en cada llamada a los metodos


        System.out.println("Fecha de hoy en formato corto: " + a.fechaFormatoCorto());
        System.out.println("Fecha de hoy en formato largo: " + a.fechaFormatoLargo());
    }
}