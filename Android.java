/**
 * Latihan55
 * Nama     : Muhammad Fauzan Fadhlulbarr
 * Kelas    : PBO10K
 * NIM      : 10119176
 * Program  : Hanphone
 */
public class Android extends Hanphone {
    private String keyStore;
    public Android(String man, String os, String model, int harga){
        super(man,os,model,harga);
    }

    public String getKeyStore() {
        return keyStore;
    }

    public void setKeyStore(String keyStore) {
        this.keyStore = keyStore;
    }
}
