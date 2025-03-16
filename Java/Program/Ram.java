// Ram.java
public class Ram extends Komponen {
    private int kapasitasGB;
    private int ddr;
    
    public Ram() {}
    
    public Ram(String merk, String nama, int kapasitasGB, int ddr) {
        super(merk, nama);
        this.kapasitasGB = kapasitasGB;
        this.ddr = ddr;
    }
    
    // Setter methods
    public void setKapasitasGB(int kapasitasGB) {this.kapasitasGB = kapasitasGB;}
    public void setDDR(int ddr) {this.ddr = ddr;}
    
    // Getter methods
    public int getKapasitasGB() {return kapasitasGB;}
    public int getDDR() {return ddr;}
    
    @Override
    public void displayInfo() {
        System.out.println(getNama() + " (" + kapasitasGB + " GB, ddr: " + ddr + ")");
    }
}