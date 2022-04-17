package pewarisan;

/**
 *
 * @author Sahdaa
 */
public class Dokter {
    private String nama;

    public Dokter(String nama) {
        this.nama = nama;
    }
    
    public void sapa() {
        System.out.println("Halo, Dokter " + nama);
    }
}
