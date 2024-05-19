/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author User
 */
public class Family {
    public static void main(String[] args) {
        Person bapakAkhmad = new Parent("Akhmad Riyadi", "Magelang", "24 September 1976", "Petani", "Jawa Tengah, Magelang", "085877100551", "Laki-laki");
        Person ibuWiji = new Parent("Wiji Astuti", "Magelang", "12 Februari 1977", "Petani", "Jawa Tengah, Magelang", "085800601658", "Perempuan");
        Person rizal = new Child("Muhammad Rizal Nur Wakhid", "Magelang", "02 Agustus 2003", "Pelajar/Mahasiswa", "Magelang", "085723317158", "Laki-laki");
        Person zahra = new Child("Azzahra Rahmadiani", "Magelang", "25 Agustus 2009", "Pelajar", "Magelang", "085123456789", "Perempuan");

        System.out.println("Keluarga ku:");
        System.out.println("------ Bapak ------");
        System.out.println(bapakAkhmad.getDetails());

        System.out.println("------ Ibu ------");
        System.out.println(ibuWiji.getDetails());

        Person[] anak = new Person[]{rizal, zahra};

        System.out.println("Mereka berdua memiliki 2 anak:");
        for (int i = 0; i < anak.length; i++) {
            if (anak[i] instanceof Child) {
                String jenisKelamin = (i == 0) ? "perempuan" : "laki-laki";
                int anakKe = i + 1;
                System.out.println("Anak ke-" + anakKe + " yaitu anak " + jenisKelamin);
                System.out.println(anak[i].getDetails());

                if (i == 0) {
                    System.out.println();
                }
            }
        }
    }
}
