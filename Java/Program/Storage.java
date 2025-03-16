public abstract class Storage extends Komponen implements Connectable {
    private int kapasitasGB;
    private int kecepatanMBps;
    private String interfaceType;
    
    public Storage() {}
    
    public Storage(String merk, String nama, int kapasitasGB, int kecepatanMBps, String interfaceType) {
        super(merk, nama);
        this.kapasitasGB = kapasitasGB;
        this.kecepatanMBps = kecepatanMBps;
        this.interfaceType = interfaceType;
    }
    
    // Setter 
    public void setKapasitasGB(int kapasitasGB) {this.kapasitasGB = kapasitasGB;}
    public void setKecepatanMBps(int kecepatanMBps) {this.kecepatanMBps = kecepatanMBps;}
    public void setInterfaceType(String interfaceType) {this.interfaceType = interfaceType;}
    
    // Getter
    public int getKapasitasGB() {return kapasitasGB;}
    public int getKecepatanMBps() {return kecepatanMBps;}
    public String getInterfaceType() {return interfaceType;}
    
    //  Connectable interface
    @Override
    public String getConnectionType() {
        return interfaceType;
    }
    
    @Override
    public void displayInfo() {
        System.out.println("Storage: " + getNama() + " (" + getMerk() + ") - " + kapasitasGB + " GB, " + 
                            kecepatanMBps + " MBps, Interface: " + interfaceType);
    }
}