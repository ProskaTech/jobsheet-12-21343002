/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan3;

/**
 *
 * Created By 21343002_Aini Rizkina
 */
public class polymorphismDynamic {
    public static void main(String[] args) {
        Bank B;
        B = new BRI();
        System.out.println("Tingkat Suku Bunga BRI addalah: "+B.sukuBunga());
        B = new BNI();
        System.out.println("Tingkat Suku Bunga BNI addalah: "+B.sukuBunga());
        B = new Mandiri();
        System.out.println("Tingkat Suku Bunga MAndiri addalah: "+B.sukuBunga());
    }
}
