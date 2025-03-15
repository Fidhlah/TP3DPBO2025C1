#include "Komponen.cpp"
#include "Connectable.cpp"

using namespace std;

class Cpu : public Komponen, public Connectable {
    private:
        int jumlahCore;
        float kecepatanGHz;
        string socketType;
    public:
        Cpu(){}

        Cpu(string merk, string nama, int jumlahCore, float kecepatanGHz, string socketType) 
            : Komponen(merk, nama) {
            this->jumlahCore = jumlahCore;
            this->kecepatanGHz = kecepatanGHz;
            this->socketType = socketType;
        }

        // setter
        void setJumlahCore(int jumlahCore){ this->jumlahCore = jumlahCore; }
        void setKecepatanGHz(float kecepatanGHz){ this->kecepatanGHz = kecepatanGHz; }
        void setSocketType(string socketType){ this->socketType = socketType; }

        // getter
        int getJumlahCore(){ return jumlahCore; }
        float getKecepatanGHz(){ return kecepatanGHz; }
        string getSocketType(){ return socketType; }

        // Implementasi dari Connectable
        string getConnectionType() override {
            return "Socket Type: " + socketType;
        }

        void displayInfo() override {   // Override method
            cout  << getNama() << " (" << jumlahCore << " cores, " << kecepatanGHz << " GHz, Socket Type: " << socketType << ")" << endl;
        }

        ~Cpu(){}
};
