#include "Komponen.cpp"
#pragma once
#include "Connectable.cpp"

using namespace std;

class Storage : public Komponen, public Connectable {
    private:
        int kapasitasGB;
        int kecepatanMBps;
        string interfaceType;
    public:
        Storage(){}

        Storage(string merk, string nama, int kapasitasGB, int kecepatanMBps, string interfaceType) 
            : Komponen(merk, nama) {
            this->kapasitasGB = kapasitasGB;
            this->kecepatanMBps = kecepatanMBps;
            this->interfaceType = interfaceType;
        }

        // setter
        void setKapasitasGB(int kapasitasGB){ this->kapasitasGB = kapasitasGB; }
        void setKecepatanMBps(int kecepatanMBps){ this->kecepatanMBps = kecepatanMBps; }
        void setInterfaceType(string interfaceType){ this->interfaceType = interfaceType; }

        // getter
        int getKapasitasGB(){ return kapasitasGB; }
        int getKecepatanMBps(){ return kecepatanMBps; }
        string getInterfaceType(){ return interfaceType; }

        // Implementasi dari Connectable
        string getConnectionType() override {
            return interfaceType;
        }

        
        ~Storage(){}
};
