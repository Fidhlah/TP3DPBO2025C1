from Storage import Storage

class Hdd(Storage):
    def __init__(self, merek, nama, kapasitasGB, kecepatanMBps, interfaceType, rpm, bufferMB):
        super().__init__(merek, nama, kapasitasGB, kecepatanMBps, interfaceType)
        self.rpm = rpm
        self.bufferMB = bufferMB

    def setRpm(self, rpm):
        self.rpm = rpm
    
    def setBufferMB(self, bufferMB):
        self.bufferMB = bufferMB
    
    def getRpm(self):
        return self.rpm
    
    def getBufferMB(self):
        return self.bufferMB

    def getConnectionType(self):
        return self.interfaceType

    def displayInfo(self):
         print(f"{self.nama} ({self.kapasitasGB} GB, Interface: {self.getConnectionType()}) kecepatan: {self.kecepatanMBps} MBps RPM: {self.rpm} Buffer: {self.bufferMB} MB")