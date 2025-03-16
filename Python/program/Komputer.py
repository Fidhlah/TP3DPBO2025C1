from Cpu import Cpu
from Gpu import Gpu
from Ram import Ram
from Storage import Storage
from Hdd import Hdd
from Ssd import Ssd

class Komputer:
    def __init__(self, nama, cpu, gpu, ramList, storageList):
        self.nama = nama
        self.cpu = cpu
        self.gpu = gpu
        self.ramList = ramList
        self.storageList = storageList

    # Setter
    def set_nama(self, nama):
        self.nama = nama

    def set_cpu(self, cpu):
        self.cpu = cpu

    def set_gpu(self, gpu):
        self.gpu = gpu

    def set_ram_list(self, ramList):
        self.ramList = ramList

    def set_storage_list(self, storageList):
        self.storageList = storageList

    # Getter
    def get_nama(self):
        return self.nama

    def get_cpu(self):
        return self.cpu

    def get_gpu(self):
        return self.gpu

    def get_ram_list(self):
        return self.ramList

    def get_storage_list(self):
        return self.storageList

    def display_info(self):
        print("--------------------------------------------------")
        print("             Informasi Komputer")
        print("--------------------------------------------------")
        print(f"Nama: {self.nama}")

        print("CPU: ", end="")
        self.cpu.displayInfo()

        print("GPU: ", end="")
        self.gpu.displayInfo()

        print("RAMs: ")
        for ram in self.ramList:
            print("\t", end="")
            ram.displayInfo()

        print("Storages: ")
        for storage in self.storageList:
            print("\t", end="")
            storage.displayInfo()
