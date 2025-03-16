from Storage import Storage

class Ssd(Storage):
    def __init__(self, merek, nama, kapasitasGB, kecepatanMBps, interfaceType, tipeNAND, durabilityTBW, suportTrim):
        super().__init__(merek, nama, kapasitasGB, kecepatanMBps, interfaceType)  # Menambahkan interfaceType sebagai interface_type
        self.tipeNAND = tipeNAND
        self.durabilityTBW = durabilityTBW
        self.suportTrim = suportTrim

    def setTipeNAND(self, tipeNAND):
        self.tipeNAND = tipeNAND
    
    def setDurabilityTBW(self, durabilityTBW):
        self.durabilityTBW = durabilityTBW
    
    def setSuportTrim(self, suportTrim):
        self.suportTrim = suportTrim
    
    def getTipeNAND(self):
        return self.tipeNAND

    def getDurabilityTBW(self):
        return self.durabilityTBW
    
    def getSuportTrim(self):
        return self.suportTrim

    def getConnectionType(self):
        return self.interfaceType
      
    def displayInfo(self):
        print(f"{self.nama} ({self.kapasitasGB} GB, Interface: {self.getConnectionType()}) kecepatan: {self.kecepatanMBps} MBps NAND: {self.tipeNAND} Durability: {self.durabilityTBW} TBW Support TRIM: {'Yes' if self.suportTrim else 'No'}")
