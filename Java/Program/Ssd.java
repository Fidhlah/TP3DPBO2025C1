// Ssd.java
public class Ssd extends Storage {
    private String tipeNAND;      // Jenis NAND flash (misalnya SLC, MLC, TLC)
    private int durabilityTBW;    // Total terabytes written (TBW)
    private boolean supportTrim;  // Mendukung TRIM atau tidak
    
    public Ssd() {}
    
    public Ssd(String merk, String nama, int kapasitasGB, int kecepatanMBps, String interfaceType, 
               String tipeNAND, int durabilityTBW, boolean supportTrim) {
        super(merk, nama, kapasitasGB, kecepatanMBps, interfaceType);
        this.tipeNAND = tipeNAND;
        this.durabilityTBW = durabilityTBW;
        this.supportTrim = supportTrim;
    }
    
    // Setter methods
    public void setTipeNAND(String tipeNAND) {this.tipeNAND = tipeNAND;}
    
    public void setDurabilityTBW(int durabilityTBW) {this.durabilityTBW = durabilityTBW;}
    
    public void setSupportTrim(boolean supportTrim) {this.supportTrim = supportTrim;}
    
    // Getter methods
    public String getTipeNAND() {return tipeNAND;}
    
    public int getDurabilityTBW() {return durabilityTBW;}
    
    public boolean getSupportTrim() {return supportTrim;}
    
    @Override
    public void displayInfo() {
        System.out.println(getNama() + " (" + getKapasitasGB() + " GB, Interface: " + getConnectionType() + ") " + 
                          "kecepatan: " + getKecepatanMBps() + "MBps" + " NAND: " + tipeNAND + 
                          " Durability: " + durabilityTBW + "TBW" + " Support TRIM: " + 
                          (supportTrim ? "Yes" : "No"));
    }
}