/**
 * Latihan55
 * Nama     : Muhammad Fauzan Fadhlulbarr
 * Kelas    : PBO10K
 * NIM      : 10119176
 * Program  : Hanphone
 */
public class Blackberry extends Hanphone {
    private String pinBB;
    
    public Blackberry(String man, String os, String model, int harga) {
        super(man, os, model, harga);
    }
    
    public String getPinBB() {
        return pinBB;
    }
    
    public void setPinBB(String pinBB) {
        this.pinBB = pinBB;
    }
    
}
