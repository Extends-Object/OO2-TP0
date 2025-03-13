import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(" ");


        //UTILIZANDO UNA CLASE NO ANEMICA
        System.out.println("UTILIZANDO UNA CLASE NO ANEMICA: ");
        Tiempo a = new Tiempo();
        //Los metodos usan el estado interno en vez crear una fecha nueva cada llamada a los metodos
        //En el constructor instancia la fecha actual y ese dato establece el estado interno del objeto
        //POR QUE CONSIDERO QUE ES UNA CLASE NO ANEMICA:
        //*Encapsula un estado interno que se inicializa en el constructor
        //*Los metodos implementados utilizan este estado interno en vez de instanciar variables en cada llamada a los metodos
        System.out.println("Fecha de hoy en formato corto: " + a.fechaFormatoCorto());
        System.out.println("Fecha de hoy en formato largo: " + a.fechaFormatoLargo());


        System.out.println(" ");
        //UTILIZANDO UNA CLASE ANEMICA
        System.out.println("UTILIZANDO UNA CLASE ANEMICA: ");
        TiempoAnemico b = new TiempoAnemico();
        //POR QUE CONSIDERO QUE ES UNA CLASE ANEMICA:
        //*No encapsula un estado interno
        //*Por el motivo anterior, los metodos reciben instancias en cada llamada y solo pueden operar sobre estas
        System.out.println("Fecha de hoy en formato corto: " + b.fechaFormatoCorto(LocalDate.now()));
        System.out.println("Fecha de hoy en formato largo: " + b.fechaFormatoLargo(LocalDate.now()));

    }
}