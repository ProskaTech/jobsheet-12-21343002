/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan6;

/**
 *
 * Created By 21343002_Aini Rizkina
 */
public class EncapsulationBuah {
    private String namaBuah;
    private String hargaBuah;
    private String warnaBuah;
    
    public EncapsulationBuah(String namaBuah, String hargaBuah, String warnaBuah){
        this.namaBuah = namaBuah;
        this.hargaBuah = hargaBuah;
        this.warnaBuah = warnaBuah;
    }
    public void setName(String namaBuah){
        this.namaBuah = namaBuah;
    }
    public void setPrice(String hargaBuah){
        this.hargaBuah = hargaBuah;
    }
    public void setColor(String warnaBuah){
        this.warnaBuah = warnaBuah;
    }
    public String getName()
    {
        return namaBuah;
    }
    public String getPrice()
    {
        return hargaBuah;
    }
    public String geColor()
    {
        return warnaBuah;
    }
}
