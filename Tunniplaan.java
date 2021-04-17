import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Tunniplaan {

    private String[] ained;
    private int[] algused;

    public Tunniplaan(String[] ained, int[] algused) {
        this.ained = ained;
        this.algused = algused;
    }

    public Tunniplaan(String failinimi) throws Exception{
        File fail = new File(failinimi);
        ArrayList<String> arrayStr = new ArrayList<>();
        ArrayList<Integer> arrayInt = new ArrayList<>();
        try (DataInputStream dis = new DataInputStream(new FileInputStream(fail))) {
            int aineid = dis.readInt();
            for (int i = 0; i < aineid; i++) {
                String a = dis.readUTF();
                arrayStr.add(a);
            }
            int alguseid = dis.readInt();
            for (int i = 0; i < alguseid; i++) {
                int b = dis.readInt();
                arrayInt.add(b);
            }
            String[] ained = arrayStr.toArray(new String[aineid]);
            int[] algused = arrayInt.stream().mapToInt(i -> i).toArray();
            this.ained = ained;
            this.algused=algused;

            }

        }



    public int annaAlgusaeg(String aine) {
        int index = Arrays.asList(ained).indexOf(aine);
        return algused[index];
    }

    public void kirjutaFaili(String failinimi) throws Exception {
        File fail = new File(failinimi);
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fail))) {
            dos.writeInt(ained.length);
            for (String i : ained) {
                dos.writeUTF(i);
            }
            dos.writeInt(algused.length);
            for (int i : algused) {
                dos.writeInt(i);
            }
        }
    }

    @Override
    public String toString() {
        return "Tunniplaan{" +
                "ained=" + Arrays.toString(ained) +
                ", algused=" + Arrays.toString(algused) +
                '}';
    }
}