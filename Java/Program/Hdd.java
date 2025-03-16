// Hdd.java
public class Hdd extends Storage {
    private int rpm;        // Rotations per minute
    private int bufferMB;   // Buffer memory in MB
    
    public Hdd() {}
    
    public Hdd(String merk, String nama, int kapasitasGB, int kecepatanMBps, String interfaceType, int rpm, int bufferMB) {
        super(merk, nama, kapasitasGB, kecepatanMBps, interfaceType);
        this.rpm = rpm;
        this.bufferMB = bufferMB;
    }
    
    // Setter methods
    public void setRpm(int rpm) {this.rpm = rpm;}
    public void setBufferMB(int bufferMB) {this.bufferMB = bufferMB;}
    
    // Getter methods
    public int getRpm() {return rpm;}
    public int getBufferMB() {return bufferMB;}
    
    @Override
    public void displayInfo() {
        System.out.println(getNama() + " (" + getKapasitasGB() + " GB, Interface: " + getConnectionType() + ") " + 
                          "kecepatan: " + getKecepatanMBps() + "MBps" + " RPM: " + rpm + " Buffer: " + bufferMB + "MB");
    }
    
    
}