import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class TiempoAnemico {

    /*
    //LO QUE HICE ORIGINALMENTE:
    public String fechaFormatoCorto (LocalDate fecha){

        DateTimeFormatter formatoCorto = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        //String fechaFormateada = fecha.format(formatoCorto);

        return fecha.format(formatoCorto);
    }


    public String fechaFormatoLargo (LocalDate fecha){

        DateTimeFormatter formatoLargo = DateTimeFormatter.ofPattern("EEEE d 'de' MMMM 'de' yyyy", new Locale("es", "ES"));
        //String fechaFormateada = fecha.format(formatoLargo);

        return fecha.format(formatoLargo);
    }
    */

    //LO QUE CORREGI

    private LocalDate fecha;

    public TiempoAnemico() {
        this.fecha = LocalDate.now();
    }

    public LocalDate getFecha() {
        return fecha;
    }
}