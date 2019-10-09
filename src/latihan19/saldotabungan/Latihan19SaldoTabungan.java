/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan19.saldotabungan;

/**
 *
 * @author Aero
 * NAMA  : IRMAN NOVRYANSAH
 * KELAS : IF 1
 * NIM   : 10118018
 * Deskripsi Program : Program ini untuk menampilkan saldo yang berkelipatan 
 *                     sesuai lamanya masa.
 */
public class Latihan19SaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
     //deklarasi variabel
        double saldoAwal = 2500000;
        double bunga = 0.15;
        double saldoAkhir;
        int lama = 0;
        
        //looping output
        while (lama <= 5){
            lama = lama + 1;
            saldoAwal = (saldoAwal*bunga) + saldoAwal;
            System.out.println("Saldo bulan ke-"+lama+" Rp."+saldoAwal);
        }
    }
}
