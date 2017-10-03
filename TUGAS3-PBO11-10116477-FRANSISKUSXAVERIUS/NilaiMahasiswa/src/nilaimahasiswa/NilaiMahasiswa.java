/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nilaimahasiswa;

/**
 *
 * Nama     : Fransiskus Xaverius Daniel Sitanggang
 * Kelas    : PBO-11
 * NIm      : 10116477
 */
public class NilaiMahasiswa {

    private double quis, uts, uas, na;
    private String nama, nim;

    void getIndex(double na) {
        if (na >= 80) {
            System.out.println("\nindex = A");
            System.out.println("\nKeterangan = Sangat Baik");
        } else
            if (na >= 68) {
            System.out.println("\nindex = B");
            System.out.println("\nKeterangan = Baik");
        } else
            if (na >= 56) {
            System.out.println("\nIndex = C");
            System.out.println("\nKeterangan = Cukup");
        } else 
            if (na >= 45) {
            System.out.println("\nIndex = D ");
            System.out.println("\nKeterangan = Kurang");
        } else 
            if (na >= 0) {
            System.out.println("\nIndex = E");
            System.out.println("\nKeterangan = Sangat Kurang");
        }

    }

    double getNa() {
        return na = (0.2 * quis) + (0.3 * uts) + (0.5 * uas);
    }

     public static void main(String[] args) {
        // TODO code application logic here
        NilaiMahasiswa oNa = new NilaiMahasiswa();
        oNa.nama = "Fransiskus Xaverius Daniel Sitanggang";
        oNa.nim = "1011647";

        for (int i = 1; i <= 4; i++) {
            System.out.println("Nama Ke-"+ i + " = \t" + oNa.nama);
        }

        for (int j = 8; j >= 1; j--) {
            System.out.println("Nim Ke-"+ j + " = \t" + oNa.nim + j);
        }
        oNa.quis = 90;
        oNa.uts = 89;
        oNa.uas = 90;
        
        double nilai = oNa.getNa();
        System.out.println("\nHasil\t"+"= " + nilai);

        oNa.getIndex(nilai);

    }

}
