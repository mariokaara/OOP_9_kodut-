public class Peaklass {

    public static void main(String[] args) throws Exception {
        String[] ained = {"Matemaatika", "Eestikeel", "Bioloogia", "Keemia"};
        int[] algused = {8*60+15, 9*60+15, 10*60+15, 12*60+15};
        Tunniplaan tunniplaan1 = new Tunniplaan(ained,algused);
        tunniplaan1.kirjutaFaili("tunniplaan.txt");
        Tunniplaan tunniplaan2 = new Tunniplaan("tunniplaan.txt");
        System.out.println(tunniplaan2.toString());

        TekstiAnalüsaator ta = new TekstiAnalüsaator("fail.txt");
        System.out.println(ta.sõneEsinemisteArv("Või"));

        Mp3Analüsaator analüsaator = new Mp3Analüsaator("musa.mp3");
        System.out.println(analüsaator.onKantri());
    }
}
