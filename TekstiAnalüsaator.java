import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class TekstiAnal�saator {

    private String failinimi;

    public TekstiAnal�saator(String failinimi) {
        this.failinimi = failinimi;
    }

    public int s�neEsinemisteArv(String s�ne) throws Exception {
        int loendur = 0;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(this.failinimi), "UTF-8"))) {
            String rida = br.readLine();
            while (rida != null) {
                String[] massiiv = rida.split(" ");
                for (String i : massiiv) {
                    if (i.contains(s�ne)) {
                        loendur += 1;
                    }
                }
                rida = br.readLine();
            }
        }
        return loendur;
    }

}
