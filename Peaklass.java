public class Peaklass {

    public static void main(String[] args) throws Exception {
        String[] ained = {"Matemaatika", "Eestikeel", "Bioloogia", "Keemia"};
        int[] algused = {8*60+15, 9*60+15, 10*60+15, 12*60+15};
        Tunniplaan tunniplaan1 = new Tunniplaan(ained,algused);
        tunniplaan1.kirjutaFaili("tunniplaan.txt");
        Tunniplaan tunniplaan2 = new Tunniplaan("tunniplaan.txt");
        System.out.println(tunniplaan2.toString());

        TekstiAnal�saator ta = new TekstiAnal�saator("fail.txt");
        System.out.println(ta.s�neEsinemisteArv("V�i"));

        Mp3Anal�saator anal�saator = new Mp3Anal�saator("musa.mp3");
        System.out.println(anal�saator.onKantri());
    }
}
