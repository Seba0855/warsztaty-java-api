import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

        /*
        ćw. 3.6
        Rozwiń przykład w ten sposób,
        żeby umożliwić wybór pomiędzy kilkoma różnymi walutami
        i następnie przeliczenie ich po danym kursie.
         */

public class KeyboardReader {
    static double USDPLN = 3.8;
    static double USDGBP = 0.76;
    static double USDCHF = 0.94;
    static double USDEUR = 0.90;



    public void reader()
    {
        try
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Wybierz walute na jaka przeliczyc: ");
            String waluta = br.readLine();

            switch (waluta) {
                case "GBP":
                    wypisywanie("GBP", USDGBP);
                    break;
                case "CHF":
                    wypisywanie("CHF", USDCHF);
                    break;

                case "EUR":
                    wypisywanie("EUR", USDEUR);
                    break;

                case "PLN":
                    wypisywanie("PLN", USDPLN);
                    break;
            }

        }

        catch (IOException e1)
        {
            System.out.println("wyjatek operacji wejscia/wyjscia");
        }

    }

    private double przelicz(double ile, double kurs) {
        return ile * kurs;
    }

    private void wypisywanie(String waluta, double kurs) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input_amount = "";
        try {
            System.out.print("USD: " );
            input_amount = br.readLine();
        }

        catch (IOException e1) {
            System.out.println("wyjatek operacji wejscia/wyjscia");
        }

        catch (NumberFormatException e2) {
            System.out.println("nieprawidlowy format liczby");
        }


        double x = Double.parseDouble(input_amount);
        System.out.println(waluta + " " + przelicz(x, kurs));
    }

}
