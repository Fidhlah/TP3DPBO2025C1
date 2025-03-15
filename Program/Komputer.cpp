// #include <iostream>
// #include <string>
// #pragma once
#include <vector>
#include "Cpu.cpp"
#include "Gpu.cpp"
#include "Ram.cpp"
#include "Storage.cpp"
#include "Hdd.cpp"
#include "Ssd.cpp"


using namespace std;

class Komputer {
    private:
        string nama;
        Cpu cpu;
        Gpu gpu;
        vector<Ram> ramList;       // List RAMs
        vector<Storage*> storageList; // List Storage, pointer karena ada polymorphism
    public:
        Komputer(){}

        Komputer(string nama, Cpu cpu, Gpu gpu, vector<Ram> ramList, vector<Storage*> storageList)
            : nama(nama), cpu(cpu), gpu(gpu), ramList(ramList), storageList(storageList) {}

        // setter
        void setNama(string nama) { this->nama = nama; }
        void setCpu(Cpu cpu) { this->cpu = cpu; }
        void setGpu(Gpu gpu) { this->gpu = gpu; }
        void setRamList(vector<Ram> ramList) { this->ramList = ramList; }
        void setStorageList(vector<Storage*> storageList) { this->storageList = storageList; }

        // getter
        string getNama() { return nama; }
        Cpu getCpu() { return cpu; }
        Gpu getGpu() { return gpu; }
        vector<Ram> getRamList() { return ramList; }
        vector<Storage*> getStorageList() { return storageList; }

        void displayInfo() {    
            cout << "--------------------------------------------------" << endl;
            cout << "             Informasi Komputer" << endl;
            cout << "--------------------------------------------------" << endl;
            cout << "Nama: " << nama << endl;

            cout << "CPU: ";
            cpu.displayInfo();

            cout << "GPU: ";
            gpu.displayInfo();

            cout << "RAMs: " << endl;
            for ( auto& ram : ramList) {
                cout << "\t";
                ram.displayInfo();
            }
            
            cout << "Storages: " << endl;
            for ( auto& storage : storageList) {
                cout << "\t";
                storage->displayInfo();  // Polymorphic 
            }
        }

        ~Komputer(){}
};
