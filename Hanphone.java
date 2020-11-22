/**
 * Latihan55
 * Nama     : Muhammad Fauzan Fadhlulbarr
 * Kelas    : PBO10K
 * NIM      : 10119176
 * Program  : Hanphone
 */
public class Hanphone {

    protected String manufacture, operatingSystem, model;
    protected int harga;
    
    public Hanphone(String man, String os, String model, int harga) {
        this.manufacture = man;
        this.operatingSystem = os;
        this.model = model;
        this.harga = harga;
    }
    
    public void displayProduct() {
        System.out.println("Manufaktur : " + this.manufacture);
        System.out.println("OS : " + this.operatingSystem);
        System.out.println("Model : " + this.model);
        System.out.println("Harga : " + this.harga);
    }
}