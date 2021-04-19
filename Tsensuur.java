import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Tsensuur {

    public static void main(String[] args) throws Exception {
        ArrayList<String> keelatud = new ArrayList<>();

        for (String i: args) {
            keelatud.add(i);
        }

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in, "UTF-8"))) {
            String rida = br.readLine();
            while (rida != null) {
                String[] masiiv = rida.split(" ");
                for (String i: masiiv) {
                    if (i.equals("")) {
                        System.exit(1);
                    }
                    if(!keelatud.contains(i)) {
                        System.out.println(i);
                    }
                }
                rida = br.readLine();
            }
        }
    }
}
