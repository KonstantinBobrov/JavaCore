import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class LacaleDateFormat {
    public static void main(String[] args) {
        Date date = new Date();
        DateFormat dfUSLong = DateFormat.getDateInstance(DateFormat.LONG, Locale.US);

        DateFormat dfUSShort = DateFormat.getDateInstance(DateFormat.SHORT, Locale.US);

        System.out.println(dfUSLong.format(date));
        System.out.println(dfUSShort.format(date));

        DateFormat ruFull = DateFormat.getDateInstance(DateFormat.FULL, Locale.getDefault());
        DateFormat ruLong = DateFormat.getDateInstance(DateFormat.LONG, Locale.getDefault());
        DateFormat ruShort = DateFormat.getDateInstance(DateFormat.SHORT, Locale.getDefault());

        System.out.println(ruFull.format(date));
        System.out.println(ruLong.format(date));
        System.out.println(ruShort.format(date));


    }
}
