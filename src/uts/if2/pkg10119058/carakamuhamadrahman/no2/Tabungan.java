/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if2.pkg10119058.carakamuhamadrahman.no2;

/**
 *
 * @author
 * NAMA     : Caraka Muhamad Rahman
 * KELAS    : PBOIF2
 * NIM      : 10119058
 * Deskripsi Program : Program ini berisi program untuk menghitung sisa saldo
 *                     tabungan.
 */
public class Tabungan {
     private int saldo;
    
    public Tabungan(int saldo) {
        this.saldo = saldo;
    }
    public int ambilUang(int jumlah) {
        return saldo - jumlah;
        
    }
}