// Gpu.java
public class Gpu extends Komponen implements Connectable {
    private int vramGB;
    private float clockSpeedGHz;
    private String pcieVersion;
    
    public Gpu() {}
    
    public Gpu(String merk, String nama, int vramGB, float clockSpeedGHz, String pcieVersion) {
        super(merk, nama);
        this.vramGB = vramGB;
        this.clockSpeedGHz = clockSpeedGHz;
        this.pcieVersion = pcieVersion;
    }
    
    // Setter methods
    public void setVramGB(int vramGB) {this.vramGB = vramGB;}
    public void setClockSpeedGHz(float clockSpeedGHz) {this.clockSpeedGHz = clockSpeedGHz;}
    public void setPcieVersion(String pcieVersion) {this.pcieVersion = pcieVersion;}
    
    // Getter methods
    public int getVramGB() {return vramGB;}
    public float getClockSpeedGHz() {return clockSpeedGHz;}
    public String getPcieVersion() {return pcieVersion;}
    
    // Connectable interface
    @Override
    public String getConnectionType() {
        return "PCIe Version: " + pcieVersion;
    }
    
    @Override
    public void displayInfo() {
        System.out.println(getNama() + " (VRAM: " + vramGB + " GB, Clock Speed: " + clockSpeedGHz + " GHz, PCIe Version: " + pcieVersion + ")");
    }
    
    
    
    
}