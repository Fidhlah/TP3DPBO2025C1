# JANJI
Saya Muhammad Hafidh Fadhilah dengan NIM 2305672 mengerjakan Tugas Praktikum 3 dalam mata kuliah 
Desain dan Pemrograman Berorientasi Objek untuk keberkahanNya maka saya tidak melakukan kecurangan 
seperti yang telah dispesifikasikan. Aamiin.

# Desain Program
![desain program](https://github.com/user-attachments/assets/ca7fc4b8-8bf6-49b6-8c76-4e68dbf93224)

# Penjelasan Alur
### 1. Inheritance & Composition
- `Komponen` berfungsi sebagai superclass untuk `ram`, `cpu`, `gpu`, `storage`
- `Storage`, `Gpu`, dan `Cpu` adalah subclass dari `Komponen` dan `Connectable`
- `Hdd` dan `Ssd` adalah subclass dari `Storage`
- `Ram`, `Cpu`, `Storage`, dan `Gpu` adalah subclass yang langsung mewarisi dari `Komponen`
- `Komputer` memiliki hubungan "Has a" pada class `Ram`, `Cpu`, `Gpu`, `Hdd`, dan `Ssd`

### 2. Polymorphism
- **Overriding Metode**: Setiap subclass mengoverride metode `displayInfo()` yang diwarisi dari superclass `Komponen` untuk memberikan implementasi khusus
- **Metode Virtual**: Metode `displayInfo()` di superclass `Komponen` dideklarasikan sebagai virtual, memungkinkan subclass untuk mengoverride-nya
- **Metode Virtual Murni (Pure Virtual)**: Metode `getConnectionType()` dalam antarmuka `Connectable` adalah metode virtual murni yang harus diimplementasikan oleh subclass yang mewarisinya

### 3. Kelas Abstrak
- **Antarmuka**: Kelas `Connectable` bertindak sebagai antarmuka dengan metode virtual murni `getConnectionType()` 

# Dokumentasi
python
![Dokumentasi Python](https://github.com/user-attachments/assets/a22febee-3083-4d33-96d7-5e2023d75366)

cpp
![dokumentasi cpp](https://github.com/user-attachments/assets/286dc935-421f-46ab-b7ad-fe7b3b26c80a)

