// #include <iostream>
// #include <string>
#include "Storage.cpp"

using namespace std;

class Ssd : public Storage {
    private:
        string tipeNAND;      // Jenis NAND flash (misalnya SLC, MLC, TLC)
        int durabilityTBW;    // Total terabytes written (TBW)
        bool supportTrim;     // Mendukung TRIM atau tidak
    public:
        Ssd(){}

        Ssd(string merk, string nama, int kapasitasGB, int kecepatanMBps, string interfaceType, string tipeNAND, int durabilityTBW, bool supportTrim) 
            : Storage(merk, nama, kapasitasGB, kecepatanMBps, interfaceType) {
            this->tipeNAND = tipeNAND;
            this->durabilityTBW = durabilityTBW;
            this->supportTrim = supportTrim;
        }

        // setter
        void setTipeNAND(string tipeNAND){ this->tipeNAND = tipeNAND; }
        void setDurabilityTBW(int durabilityTBW){ this->durabilityTBW = durabilityTBW; }
        void setSupportTrim(bool supportTrim){ this->supportTrim = supportTrim; }

        // getter
        string getTipeNAND(){ return tipeNAND; }
        int getDurabilityTBW(){ return durabilityTBW; }
        bool getSupportTrim(){ return supportTrim; }

        void displayInfo() override {   // Override method
            cout << getNama() << " (" << getKapasitasGB() << " GB, Interface: " << getConnectionType() << ") " << "kecepatan: " << getKecepatanMBps() << "MBps" << " NAND: " << tipeNAND << " Durability: " << durabilityTBW << "TBW" << " Support TRIM: " << (supportTrim ? "Yes" : "No") << endl;
        }

        ~Ssd(){}
};
