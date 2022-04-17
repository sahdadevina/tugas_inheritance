package pewarisan;

/**
 *
 * @author Oecophylla
 */
public class Main {
    public static void main(String[] args) {
        Dokter dr = new Dokter("Rangga");
        dr.sapa();
        System.out.println("");
        
        SpesialisBedah sb = new SpesialisBedah("Sahda", "Bedah Saraf");
        sb.sapa();
        sb.keahlian();
        System.out.println("");
        
        Operasi ops = new Operasi("Cha Young Min", "Bedah Kardiotoraks", 4);
        ops.sapa();
        ops.keahlian();
        ops.jadwal();
    }
}
