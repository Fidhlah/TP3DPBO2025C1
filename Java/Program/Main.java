/* Saya Muhammad Hafidh Fadhilah dengan NIM 2305672 mengerjakan Tugas Praktikum 3 dalam mata kuliah 
Desain dan Pemrograman Berorientasi Objek untuk keberkahanNya maka saya tidak melakukan kecurangan 
seperti yang telah dispesifikasikan. Aamiin.*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        // PC 1
        Cpu cpu1 = new Cpu("Intel", "Core i9", 8, 3.5f, "LGA1151");
        Gpu gpu1 = new Gpu("NVIDIA", "RTX 3080", 10, 1.8f, "PCIe 4.0");
        Ram ram1 = new Ram("Corsair", "Vengeance LPX", 16, 5);
        Ram ram2 = new Ram("Corsair", "Vengeance LPX", 8, 5);
        Hdd hdd1 = new Hdd("Seagate", "Barracuda", 1000, 150, "SATA", 7200, 64);
        Ssd ssd1 = new Ssd("Samsung", "970 EVO", 500, 3500, "PCIe", "MLC", 600, true);
        
        List<Ram> ramList1 = new ArrayList<>(Arrays.asList(ram1, ram2));
        List<Storage> storageList1 = new ArrayList<>(Arrays.asList(hdd1, ssd1));
        
        Komputer komputer1 = new Komputer("PC Hafidh", cpu1, gpu1, ramList1, storageList1);
        
        // PC 2
        Cpu cpu2 = new Cpu("Intel", "Core i7-12700K", 12, 5.0f, "LGA1700");
        Gpu gpu2 = new Gpu("NVIDIA", "RTX 4080", 16, 2.5f, "PCIe 4.0");
        Ram ram3 = new Ram("Corsair", "Vengeance LPX", 32, 4);
        Ram ram4 = new Ram("Corsair", "Vengeance LPX", 16, 4);
        Hdd hdd2 = new Hdd("Seagate", "Barracuda", 2000, 150, "SATA", 7200, 256);
        Ssd ssd2 = new Ssd("Samsung", "980 Pro", 1000, 7000, "PCIe", "TLC", 5000, true);
        
        List<Ram> ramList2 = new ArrayList<>(Arrays.asList(ram3, ram4));
        List<Storage> storageList2 = new ArrayList<>(Arrays.asList(hdd2, ssd2));
        
        Komputer komputer2 = new Komputer("PC Fadhilah", cpu2, gpu2, ramList2, storageList2);
        
        komputer1.displayInfo();
        System.out.println();
        komputer2.displayInfo();
    }
}