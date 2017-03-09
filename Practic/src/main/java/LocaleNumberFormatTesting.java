import java.text.NumberFormat;
import java.util.Locale;


public class LocaleNumberFormatTesting {
    public static void main(String[] args) {
        int data[] = {100, 1000, 10000, 1000000};
        NumberFormat nf = NumberFormat.getInstance(Locale.getDefault());
        for (int aData : data) {
            System.out.println(aData + "\t" + nf.format(aData));
        }

        System.out.println("----------------");
        double number = 9876.598;
        NumberFormat nfGer = NumberFormat.getNumberInstance(Locale.GERMANY);

        NumberFormat nfDef = NumberFormat.getNumberInstance(Locale.FRANCE);
        NumberFormat nfJap = NumberFormat.getNumberInstance(Locale.JAPANESE);
        NumberFormat nfDef2 = NumberFormat.getInstance(Locale.FRANCE);
        NumberFormat nfRus = NumberFormat.getInstance(Locale.getDefault());
        System.out.println("Formatting the number: " + nfGer.format(number));
        System.out.println("Formatting the number: " + nfJap.format(number));
        System.out.println("Formatting the number: " + nfDef.format(number));
        System.out.println("Formatting the number: " + nfDef2.format(number));
        System.out.println("Formatting the number: " + nfRus.format(number));

        System.out.println("----------------");
        NumberFormat cfGer = NumberFormat.getCurrencyInstance(Locale.GERMANY);
        NumberFormat cfNor = NumberFormat.getCurrencyInstance(new Locale("no", "NO"));
        NumberFormat cfUS = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println(": " + cfGer.format(number));
        System.out.println(": " + cfNor.format(number));
        System.out.println(": " + cfUS.format(number));

        NumberFormat cfRUS = NumberFormat.getCurrencyInstance(Locale.getDefault());
        System.out.println(": " + cfRUS.format(number));


    }
}
