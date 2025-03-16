from Cpu import Cpu
from Gpu import Gpu
from Ram import Ram
from Hdd import Hdd
from Ssd import Ssd
from Komputer import Komputer

# PC 1
cpu1 = Cpu("Intel", "Core i9", 8, 3.5, "LGA1151")
gpu1 = Gpu("NVIDIA", "RTX 3080", 10, 1.8, "PCIe 4.0")
ram1 = Ram("Corsair", "Vengeance LPX", 16, 5)
ram2 = Ram("Corsair", "Vengeance LPX", 8, 5)
hdd1 = Hdd("Seagate", "Barracuda", 1000, 150, "SATA", 7200, 64)
ssd1 = Ssd("Samsung", "970 EVO", 500, 3500, "PCIe", "MLC", 600, True)

komputer1 = Komputer("PC Hafidh", cpu1, gpu1, [ram1, ram2], [hdd1, ssd1])

# PC 2
cpu2 = Cpu("Intel", "Core i7-12700K", 12, 5.0, "LGA1700")
gpu2 = Gpu("NVIDIA", "RTX 4080", 16, 2.5, "PCIe 4.0")
ram3 = Ram("Corsair", "Vengeance LPX", 32, 4)
ram4 = Ram("Corsair", "Vengeance LPX", 16, 4)
hdd2 = Hdd("Seagate", "Barracuda", 2000, 150, "SATA", 7200, 256)
ssd2 = Ssd("Samsung", "980 Pro", 1000, 7000, "PCIe", "TLC", 5000, True)

komputer2 = Komputer("PC Fadhilah", cpu2, gpu2, [ram3, ram4], [hdd2, ssd2])

komputer1.display_info()
print()
komputer2.display_info()

