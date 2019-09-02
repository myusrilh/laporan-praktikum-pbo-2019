package sepedademo;
public class Sepeda1841720184Yusril {

    private String merek;
    private int kecepatan;
    private int gear;
    private String warna;

    public void setMerekYusril(String newValue) {
        merek = newValue;
    }

    public void gantiGearYusril(int newValue) {
        gear = newValue;
    }

    public void tambahKecepatanYusril(int increment) {
        kecepatan += increment;
    }

    public void remYusril(int decrement) {
        kecepatan -= decrement;
    }
    
    public void warnaYusril(String newWarna){
        warna = newWarna;
    }

    public void cetakStatusYusril() {
        System.out.println("Merek: " + merek);
        System.out.println("Kecepatan: " + kecepatan);
        System.out.println("Gear: " + gear);
        System.out.println("Warna: "+warna);
    }

}
