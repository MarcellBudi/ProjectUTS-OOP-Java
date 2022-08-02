/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soaltiga;

/**
 *
 * @author LENOVO
 */
public class Manager extends Pegawai{
    private double tunjanganLemburPerJam;
    private double overtime=1;
    
    public void manager(String nama, double gaji, double tunjangan){
        this.nama = nama;
        this.gaji = gaji;
        this.tunjanganLemburPerJam = tunjangan;
    }

    public double getTunjanganLemburPerJam() {
        return tunjanganLemburPerJam;
    }

    public void setTunjanganLemburPerJam(double tunjanganLemburPerJam) {
        this.tunjanganLemburPerJam = tunjanganLemburPerJam;
    }

    public void setOvertime(double overtime) {
        this.overtime = overtime;
    }
    
    @Override
    public double gajiBersih(){
        return this.gaji + this.tunjanganLemburPerJam * this.overtime;
    }
}
