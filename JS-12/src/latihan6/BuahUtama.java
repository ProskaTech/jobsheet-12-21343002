/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan6;

/**
 *
 * Created By 21343002_Aini Rizkina
 */
public class BuahUtama {
    public static void main(String[] args) {
        EncapsulationBuah Apel = new EncapsulationBuah("Apel", "Rp.3000", "Merah");
        
        System.out.println("Nama Buah: "+ Apel.getName()+"\nHarga: " +Apel.getPrice()+"\nWarna: "+Apel.geColor());
        
        Apel.setColor("Hijau");
        Apel.setPrice("Rp.7000");
        System.out.println("\nInformasi terkait Apel setelah di Update");
        
        System.out.println("Nama Buah: "+ Apel.getName()+"\nHarga: " +Apel.getPrice()+"\nWarna: "+Apel.geColor());
    }
}
