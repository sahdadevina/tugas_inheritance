package pewarisan;

/**
 *
 * @author Sahdaa
 */
public class SpesialisBedah extends Dokter {
    protected String keahlian;

    public SpesialisBedah(String nama, String keahlian) {
        super(nama);
        this.keahlian = keahlian;
    }
    
    public void keahlian() {
        System.out.println("Spesialis " + keahlian);
    }
}
