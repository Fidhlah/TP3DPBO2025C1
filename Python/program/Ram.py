from Komponen import Komponen

class Ram(Komponen):
    def __init__(self, merk, nama, kapasitasGB, ddr):
        super().__init__(merk, nama)
        self.kapasitasGB = kapasitasGB
        self.ddr = ddr

    # Setter
    def setKapasitasGB(self, kapasitasGB):
        self.kapasitasGB = kapasitasGB

    def setDDR(self, ddr):
        self.ddr = ddr

    # Getter
    def getKapasitasGB(self):
        return self.kapasitasGB

    def getDDR(self):
        return self.ddr

    def displayInfo(self):
        print(f"{self.getNama()} ({self.kapasitasGB} GB, DDR: {self.ddr})")
