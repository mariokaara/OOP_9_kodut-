import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class TekstiAnalüsaator {

    private String failinimi;

    public TekstiAnalüsaator(String failinimi) {
        this.failinimi = failinimi;
    }

    public int sõneEsinemisteArv(String sõne) throws Exception {
        int loendur = 0;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(this.failinimi), "UTF-8"))) {
            String rida = br.readLine();
            while (rida != null) {
                String[] massiiv = rida.split(" ");
                for (String i : massiiv) {
                    if (i.contains(sõne)) {
                        loendur += 1;
                    }
                }
                rida = br.readLine();
            }
        }
        return loendur;
    }

}
