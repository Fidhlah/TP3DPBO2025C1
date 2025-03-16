from Komponen import Komponen
from Connectable import Connectable

class Storage(Komponen, Connectable):
    def __init__(self, merk=None, nama=None, kapasitasGB=None, kecepatanMBps=None, interfaceType=None):
        Komponen.__init__(self, merk, nama)
        self.kapasitasGB = kapasitasGB
        self.kecepatanMBps = kecepatanMBps
        self.interfaceType = interfaceType

    # Getter dan Setter
    def setKapasitasGB(self, kapasitasGB):
        self.kapasitasGB = kapasitasGB

    def setKecepatanTransfer(self, kecepatanMBps):
        self.kecepatanMBps = kecepatanMBps

    def setInterfaceType(self, interfaceType):
        self.interfaceType = interfaceType

    def getKapasitasGB(self):
        return self.kapasitasGB

    def getKecepatanTransfer(self):
        return self.kecepatanMBps

    def getInterfaceType(self):
        return self.interfaceType

    # Override metode dari Connectable
    def getConnectionType(self):
        return self.interfaceType

    def displayInfo(self):
        super().displayInfo()
        print(f"Storage: {self.nama} ({self.merk}) - {self.kapasitasGB} GB, {self.kecepatanMBps} MBps, Interface: {self.interfaceType}")