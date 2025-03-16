/* Saya Muhammad Hafidh Fadhilah dengan NIM 2305672 mengerjakan Tugas Praktikum 3 dalam mata kuliah 
Desain dan Pemrograman Berorientasi Objek untuk keberkahanNya maka saya tidak melakukan kecurangan 
seperti yang telah dispesifikasikan. Aamiin.*/

#include "Komputer.cpp"

using namespace std;

int main() {
    // PC 1
    Cpu cpu1("Intel", "Core i9", 8, 3.5, "LGA1151");
    Gpu gpu1("NVIDIA", "RTX 3080", 10, 1.8, "PCIe 4.0");
    Ram ram1("Corsair", "Vengeance LPX", 16, 5);
    Ram ram2("Corsair", "Vengeance LPX", 8, 5);
    Hdd hdd1("Seagate", "Barracuda", 1000, 150, "SATA", 7200, 64);
    Ssd ssd1("Samsung", "970 EVO", 500, 3500, "PCIe", "MLC", 600, true);
   
    Komputer komputer1("PC Hafidh", cpu1, gpu1, {ram1, ram2}, {&hdd1, &ssd1});
    
    // PC 2
    Cpu cpu2("Intel", "Core i7-12700K", 12, 5.0, "LGA1700");
    Gpu gpu2("NVIDIA", "RTX 4080", 16, 2.5, "PCIe 4.0");
    Ram ram3("Corsair", "Vengeance LPX", 32, 4);
    Ram ram4("Corsair", "Vengeance LPX", 16, 4);
    Hdd hdd2("Seagate", "Barracuda", 2000, 150, "SATA", 7200, 256);
    Ssd ssd2("Samsung", "980 Pro", 1000, 7000, "PCIe", "TLC", 5000, true);
    
    Komputer komputer2("PC Fadhilah", cpu2, gpu2, {ram3, ram4}, {&hdd2, &ssd2});
    
    komputer1.displayInfo();
    cout << endl;
    komputer2.displayInfo();
    
    return 0;
}
