// Cpu.java
public class Cpu extends Komponen implements Connectable {
    private int jumlahCore;
    private float kecepatanGHz;
    private String socketType;
    
    public Cpu() {}
    
    public Cpu(String merk, String nama, int jumlahCore, float kecepatanGHz, String socketType) {
        super(merk, nama);
        this.jumlahCore = jumlahCore;
        this.kecepatanGHz = kecepatanGHz;
        this.socketType = socketType;
    }
    
    // Setter methods
    public void setJumlahCore(int jumlahCore) {this.jumlahCore = jumlahCore;}
    public void setKecepatanGHz(float kecepatanGHz) {this.kecepatanGHz = kecepatanGHz;}
    public void setSocketType(String socketType) {this.socketType = socketType;}
    
    // Getter methods
    public int getJumlahCore() {return jumlahCore;}
    public float getKecepatanGHz() {return kecepatanGHz;}
    public String getSocketType() {return socketType;}
    
    // Connectable interface
    @Override
    public String getConnectionType() {
        return "Socket Type: " + socketType;
    }
    
    @Override
    public void displayInfo() {
        System.out.println(getNama() + " (" + jumlahCore + " cores, " + kecepatanGHz + " GHz, Socket Type: " + socketType + ")");
    }
}