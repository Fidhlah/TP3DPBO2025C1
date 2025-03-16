from Komponen import Komponen
from Connectable import Connectable

class Cpu(Komponen, Connectable):
    def __init__(self, merk, nama, jumlahCore, kecepatanGHz, socketType):
        super().__init__(merk, nama)
        self.jumlahCore = jumlahCore
        self.kecepatanGHz = kecepatanGHz
        self.socketType = socketType

    # Setter
    def setJumlahCore(self, jumlahCore):
        self.jumlahCore = jumlahCore

    def setKecepatanGHZ(self, kecepatanGHz):
        self.kecepatanGHz = kecepatanGHz

    def setSocketType(self, socketType):
        self.socketType = socketType

    # Getter
    def getJumlahCore(self):
        return self.jumlahCore

    def getKecepatanGHZ(self):
        return self.kecepatanGHz

    def getSocketType(self):
        return self.socketType

    # Implementasi dari Connectable
    def getConnectionType(self):
        return f"{self.socketType}"

    def displayInfo(self):
        print(f"{self.getNama()} ({self.jumlahCore} cores, {self.kecepatanGHz} GHz, Socket Type: {self.socketType})")
