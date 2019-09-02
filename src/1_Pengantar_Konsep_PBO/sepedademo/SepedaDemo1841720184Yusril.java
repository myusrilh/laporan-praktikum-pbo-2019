/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sepedademo;

/**
 *
 * @author asus
 */
public class SepedaDemo1841720184Yusril {

    public static void main(String[] args) {
//        Buat dua buah objek sepeda
        Sepeda1841720184Yusril spd1 = new Sepeda1841720184Yusril();
        Sepeda1841720184Yusril spd2 = new Sepeda1841720184Yusril();
        SepedaGunung1841720184Yusril spd3 = new SepedaGunung1841720184Yusril();
        SepedaGunungHimalaya1841720184Yusril spd4 = new SepedaGunungHimalaya1841720184Yusril();
        
//        Panggil method didalam objek sepeda
        spd1.setMerekYusril("Polygon");
        spd1.tambahKecepatanYusril(10);
        spd1.gantiGearYusril(2);
        spd1.warnaYusril("Hijau Laut");
        spd1.cetakStatusYusril();
        
        spd2.setMerekYusril("Wim Cycle");
        spd2.tambahKecepatanYusril(10);
        spd2.gantiGearYusril(2);
        spd2.tambahKecepatanYusril(10);
        spd2.gantiGearYusril(3);
        spd2.warnaYusril("Biru Daun");
        spd2.cetakStatusYusril();
        
        spd3.setMerekYusril("Klinee");
        spd3.tambahKecepatanYusril(5);
        spd3.gantiGearYusril(7);
        spd3.setTipeSuspensiYusril("Gas suspension");
        spd3.warnaYusril("Merah Marun");
        spd3.cetakStatusYusril();
        
        spd4.setMerekYusril("New Era");
        spd4.tambahKecepatanYusril(20);
        spd4.gantiGearYusril(7);
        spd4.setTipeSuspensiYusril("Air suspension");
        spd4.warnaYusril("Kuning Cerah");
        spd4.jenisSepedaYusril("Sepeda Gunung Himalaya");
        spd4.cetakStatusYusril();
    }
}
