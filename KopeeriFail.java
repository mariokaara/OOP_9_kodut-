import java.io.*;
import java.util.Date;

public class KopeeriFail {

        private static void kopeeri(String algne, String koopia) throws Exception {
            File fail = new File(algne);
            if (fail.isDirectory()) {
                System.out.println("See on hoopis kataloog, mitte fail");
                System.exit(1);
            }
            else if (fail.isFile()) {
                System.out.println("Faili suurus: " + fail.length() + ". Faili muudeti: " + new Date(fail.lastModified()));
            }
            // sulgudes semikoolonit kasutades saab mitu faili avada
            try (InputStream sisse = new FileInputStream(algne);
                 OutputStream välja = new FileOutputStream(koopia)) {
                byte[] puhver = new byte[1024];
                int loetud = sisse.read(puhver);
                while (loetud > 0) {
                    välja.write(puhver, 0, loetud); // ainult andmetega täidetud osa!
                    loetud = sisse.read(puhver); // loeme järgmise tüki
                }
            }
        }

        public static void main(String[] args) throws Exception {



            if (args.length != 1) {
                System.out.println("Kas sa andsid käsurealt faili nime?");
                System.exit(1);
            }
            kopeeri(args[0], args[0] + ".copy");
        }
    }

