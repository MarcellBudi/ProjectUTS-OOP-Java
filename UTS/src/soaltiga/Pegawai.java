/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soaltiga;

/**
 *
 * @author LENOVO
 */
public class Pegawai {
    protected String nama;
    protected double gaji;
    
    public void Pegawai(String nama, double gaji){
        this.nama = nama;
        this.gaji = gaji;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }
    
    protected double gajiBersih(){
        return this.gaji;
    }
}
