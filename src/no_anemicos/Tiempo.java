package no_anemicos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Tiempo {

    private LocalDate fecha;

    public Tiempo() {
        this.fecha = LocalDate.now();
    }



    public String fechaFormatoCorto (){
        DateTimeFormatter formatoCorto = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return this.fecha.format(formatoCorto);
    }

    public String fechaFormatoLargo (){
        DateTimeFormatter formatoLargo = DateTimeFormatter.ofPattern("EEEE d 'de' MMMM 'de' yyyy", new Locale("es", "ES"));
        return this.fecha.format(formatoLargo);

        //EEEE --> dia de la semana
        //d --> dia del mes sin cero
        //MMMM --> mes
        //yyyy --> año
        //Locale --> que dia y mes sean correctos
    }

}
