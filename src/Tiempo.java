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
        //String fechaFormateada = this.fecha.format(formatoCorto);

        return this.fecha.format(formatoCorto);
    }


    public String fechaFormatoLargo (){

        DateTimeFormatter formatoLargo = DateTimeFormatter.ofPattern("EEEE d 'de' MMMM 'de' yyyy", new Locale("es", "ES"));
                //EEEE --> Dia de la semana
                //d --> dia del mes sin cero
                //MMMM --> Mes
                //yyyy --> Año
                //Locale --> Para asegurar que el dia y el mes esten en el lenguaje correcto
        //String fechaFormateada = this.fecha.format(formatoLargo);

        return this.fecha.format(formatoLargo);
    }

}
