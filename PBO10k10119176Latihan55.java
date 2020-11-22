/**
 * Latihan55
 * Nama     : Muhammad Fauzan Fadhlulbarr
 * Kelas    : PBO10K
 * NIM      : 10119176
 * Program  : Hanphone
 */
public class PBO10k10119176Latihan55 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Android andro = new Android("Samsung", "Android", "Grand", 3000000);
        Blackberry bb = new Blackberry("BlackB", "RIM", "Curve", 2000000);
        WindowsPhone wp = new WindowsPhone("Nokia", "Win8", "Lumia", 1000000);
        
        andro.setKeyStore("234ibfd3840fo");
        andro.displayProduct();
        System.out.println("Android Key Store : " + andro.getKeyStore());

        System.out.println();
        
        bb.setPinBB("BHS249");
        bb.displayProduct();
        System.out.println("PIN : " + bb.getPinBB());
        
        System.out.println();
        
        wp.setWpKeyStore("UUUQIJWORJ");
        wp.displayProduct();
        System.out.println("Wp Key Store : " + wp.getWpKeyStore());
     }
}
