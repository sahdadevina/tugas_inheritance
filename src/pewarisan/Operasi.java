package pewarisan;

/**
 *
 * @author Sahdaa
 */
public class Operasi extends SpesialisBedah {
    int jmlOps;

    public Operasi(String nama, String keahlian, int jmlOps) {
        super(nama, keahlian);
        this.jmlOps = jmlOps;
    }
    
    void jadwal() {
        System.out.println("Jumlah Operasi Hari Ini: " + jmlOps);
    }
}
