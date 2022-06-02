import java.text.ParseException;
import java.time.Month;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;


public class Datas {

    public static void main(String[] args) {
        Date novaData = new Date();
        System.out.println(novaData);

        SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy");
        String dateString = "21-8-1980";


        try {
            Date data = sdf.parse(dateString);
            System.out.println(data.getTime());
            Date dataRef = sdf.parse("15-05-2010");
            System.out.println(data.after(dataRef));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        LocalDateTime data = LocalDateTime.of(2010, Month.MAY, 15, 10, 0, 0);
        System.out.println(data.plusYears(4).plusMonths(6).plusHours(13));
    }
}
