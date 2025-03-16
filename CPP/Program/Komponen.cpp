#pragma once
#include <iostream>
#include <string>

using namespace std;

class Komponen {
    private:
        string merk;
        string nama;
    public:
        Komponen(){}

        Komponen(string merk, string nama){
            this->merk = merk;
            this->nama = nama;
        }

        // setter
        void setMerk(string merk){this->merk = merk;}
        void setNama(string nama){this->nama = nama;}

        // getter
        string getMerk(){return merk;}
        string getNama(){return nama;}

        virtual void displayInfo() { // Virtual method
            cout << "Komponen: " << nama << " (" << merk << ")" << endl;
        }

        virtual ~Komponen() {}

};
