#include "Komponen.cpp"

using namespace std;

class Ram : public Komponen {
    private:
        int kapasitasGB;
        int ddr;
    public:
        Ram(){}

        Ram(string merk, string nama, int kapasitasGB, int ddr) 
            : Komponen(merk, nama) {
            this->kapasitasGB = kapasitasGB;
            this->ddr = ddr;
        }

        // setter
        void setKapasitasGB(int kapasitasGB){ this->kapasitasGB = kapasitasGB; }
        void setDDR(int ddr){ this->ddr = ddr; }

        // getter
        int getKapasitasGB(){ return kapasitasGB; }
        int getDDR(){ return ddr; }

        void displayInfo() override {
            cout << getNama() << " (" << kapasitasGB << " GB, ddr: " << ddr << ")" << endl;
        }

        ~Ram(){}
};
