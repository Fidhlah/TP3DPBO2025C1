// Komputer.java
import java.util.List;
import java.util.ArrayList;

public class Komputer {
    private String nama;
    private Cpu cpu;
    private Gpu gpu;
    private List<Ram> ramList;
    private List<Storage> storageList;
    
    public Komputer() {
        this.ramList = new ArrayList<>();
        this.storageList = new ArrayList<>();
    }
    
    public Komputer(String nama, Cpu cpu, Gpu gpu, List<Ram> ramList, List<Storage> storageList) {
        this.nama = nama;
        this.cpu = cpu;
        this.gpu = gpu;
        this.ramList = ramList;
        this.storageList = storageList;
    }
    
    // Setter methods
    public void setNama(String nama) {this.nama = nama;}
    public void setCpu(Cpu cpu) {this.cpu = cpu;}
    public void setGpu(Gpu gpu) {this.gpu = gpu;}
    public void setRamList(List<Ram> ramList) {this.ramList = ramList;}
    public void setStorageList(List<Storage> storageList) {this.storageList = storageList;}
    
    // Getter methods
    public String getNama() {return nama;}
    public Cpu getCpu() {return cpu;}
    public Gpu getGpu() {return gpu;}
    public List<Ram> getRamList() {return ramList;}
    
    public List<Storage> getStorageList() {
        return storageList;
    }
    
    public void displayInfo() {
        System.out.println("--------------------------------------------------");
        System.out.println("             Informasi Komputer");
        System.out.println("--------------------------------------------------");
        System.out.println("Nama: " + nama);
        
        System.out.print("CPU: ");
        cpu.displayInfo();
        
        System.out.print("GPU: ");
        gpu.displayInfo();
        
        System.out.println("RAMs: ");
        for (Ram ram : ramList) {
            System.out.print("\t");
            ram.displayInfo();
        }
        
        System.out.println("Storages: ");
        for (Storage storage : storageList) {
            System.out.print("\t");
            storage.displayInfo();  // Polymorphic
        }
    }
}