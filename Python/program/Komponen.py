class Komponen:
    def __init__(self, merk=None, nama=None):
        self.merk = merk
        self.nama = nama

    # Setter
    def setMerk(self, merk):
        self.merk = merk

    def setNama(self, nama):
        self.nama = nama

    # Getter
    def getMerk(self):
        return self.merk

    def getNama(self):
        return self.nama

    def displayInfo(self):
        print(f"Komponen: {self.nama} ({self.merk})")
