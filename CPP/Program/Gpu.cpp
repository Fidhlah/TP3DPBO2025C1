#include "Komponen.cpp"
#include "Connectable.cpp"

using namespace std;

class Gpu : public Komponen, public Connectable {
    private:
        int vramGB;
        float clockSpeedGHz;
        string pcieVersion;
    public:
        Gpu(){}

        Gpu(string merk, string nama, int vramGB, float clockSpeedGHz, string pcieVersion) 
            : Komponen(merk, nama) {
            this->vramGB = vramGB;
            this->clockSpeedGHz = clockSpeedGHz;
            this->pcieVersion = pcieVersion;
        }

        // setter
        void setVramGB(int vramGB){ this->vramGB = vramGB; }
        void setClockSpeedGHz(float clockSpeedGHz){ this->clockSpeedGHz = clockSpeedGHz; }
        void setPcieVersion(string pcieVersion){ this->pcieVersion = pcieVersion; }

        // getter
        int getVramGB(){ return vramGB; }
        float getClockSpeedGHz(){ return clockSpeedGHz; }
        string getPcieVersion(){ return pcieVersion; }

        // Implementasi dari Connectable
        string getConnectionType() override {
            return "PCIe Version: " + pcieVersion;
        }

        void displayInfo() override {   // Override method
            cout << getNama() << " (VRAM: " << vramGB << " GB, Clock Speed: " << clockSpeedGHz << " GHz, PCIe Version: " << pcieVersion << ")" << endl;
        }

        ~Gpu(){}
};
