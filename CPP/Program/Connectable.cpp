#pragma once
#include <iostream>
// #include <string>

using namespace std;

class Connectable {
    public:
        virtual string getConnectionType() = 0; // Pure virtual method
        virtual ~Connectable(){}
};
