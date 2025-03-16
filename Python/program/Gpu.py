from Komponen import Komponen
from Connectable import Connectable

class Gpu(Komponen, Connectable):
    def __init__(self, merk, nama, vramGB, clockSpeedGHz, pcieVersion):
        super().__init__(merk, nama)
        self.vramGB = vramGB
        self.clockSpeedGHz = clockSpeedGHz
        self.pcieVersion = pcieVersion

    # Setter
    def setVramGB(self, vramGB):
        self.vramGB = vramGB

    def setClockSpeedGHZ(self, clockSpeedGHz):
        self.clockSpeedGHz = clockSpeedGHz

    def setPcieVersion(self, pcieVersion):
        self.pcieVersion = pcieVersion

    # Getter
    def getVramGB(self):
        return self.vramGB

    def getClockSpeedGHZ(self):
        return self.clockSpeedGHz

    def getPcieVersion(self):
        return self.pcieVersion

    # Implementasi dari Connectable
    def getConnectionType(self):
        return f"{self.pcieVersion}"

    def displayInfo(self):
        print(f"{self.getNama()} (VRAM: {self.vramGB} GB, Clock Speed: {self.clockSpeedGHz} GHz, PCIe Version: {self.pcieVersion})")
