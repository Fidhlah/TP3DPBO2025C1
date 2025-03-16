
public class Komponen {
    private String merk;
    private String nama;
    
    public Komponen() {}
    
    public Komponen(String merk, String nama) {
        this.merk = merk;
        this.nama = nama;
    }
    
    // Setter methods
    public void setMerk(String merk) {this.merk = merk;}
    public void setNama(String nama) {this.nama = nama;}
    
    // Getter methods
    public String getMerk() {return merk;}
    public String getNama() {return nama;}
    
    // Virtual method 
    public void displayInfo() {
        System.out.println("Komponen: " + nama + " (" + merk + ")");
    }
    
    
}