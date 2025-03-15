#include "Storage.cpp"

using namespace std;

class Hdd : public Storage {
    private:
        int rpm;        // Rotations per minute
        int bufferMB;   // Buffer memory in MB
    public:
        Hdd(){}

        Hdd(string merk, string nama, int kapasitasGB, int kecepatanMBps, string interfaceType, int rpm, int bufferMB) 
            : Storage(merk, nama, kapasitasGB, kecepatanMBps, interfaceType) {
            this->rpm = rpm;
            this->bufferMB = bufferMB;
        }

        // setter
        void setRpm(int rpm){ this->rpm = rpm; }
        void setBufferMB(int bufferMB){ this->bufferMB = bufferMB; }

        // getter
        int getRpm(){ return rpm; }
        int getBufferMB(){ return bufferMB; }

        void displayInfo() override {   // Override method
            cout << getNama() << " (" << getKapasitasGB() << " GB, Interface: " << getConnectionType() << ") " << "kecepatan: " << getKecepatanMBps() << "MBps" << " RPM: " << rpm << " Buffer: " << bufferMB << "MB" << endl;
        }

        ~Hdd(){}
};
