import java.io.*;
import java.math.BigInteger;

public class Mp3Anal�saator {

    private String failinimi;

    public Mp3Anal�saator(String failinimi) {
        this.failinimi = failinimi;
    }

    public boolean onKantri() throws Exception{
        File fail = new File(this.failinimi);
        RandomAccessFile rf = new RandomAccessFile(fail, "r");
        rf.seek(fail.length()-1);
        byte b = rf.readByte();
        if (b == 2) {
            return true;
        } else {
            return false;
        }
        }


    }
