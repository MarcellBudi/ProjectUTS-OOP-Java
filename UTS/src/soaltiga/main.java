/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soaltiga;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Scanner inputt=new Scanner(System.in);
        
        System.out.println(".:PEGAWAI:.");
        System.out.println("--------------------");
        System.out.print("Inputkan Nama Pegawai: ");
        String namaPegawai = (String)input.nextLine();
        System.out.print("Inputkan Gaji Pegawai: ");
        double gajiPegawai = (double)input.nextDouble();
        System.out.println("--------------------");
        
        Pegawai pegawai = new Pegawai();
        pegawai.setNama(namaPegawai);
        pegawai.setGaji(gajiPegawai);
        
        System.out.println("Nama Pegawai: "+pegawai.getNama());
        System.out.println("Gaji Bersih Pegawai: "+pegawai.gajiBersih());
        System.out.println("");
        
        System.out.println(".:MANAJER:.");
        System.out.println("--------------------");        
        System.out.print("Inputkan Nama Manajer: ");
        String namaManager = (String)inputt.nextLine();  
        System.out.print("Inputkan Gaji Manajer: ");
        double gajiManager = (double)input.nextDouble();        
        System.out.print("Inputkan Tunjangan Lembur Per Jam: ");
        double tunjanganLembur = (double)input.nextDouble();        
        System.out.print("Inputkan Lama Overtime Dalam Jam: ");
        double overtime = (double)input.nextDouble();        
        System.out.println("--------------------");
    
        Manager manager = new Manager();
        manager.setNama(namaManager);
        manager.setGaji(gajiManager);
        manager.setTunjanganLemburPerJam(tunjanganLembur);
        manager.setOvertime(overtime);
        
        System.out.println("Nama Manajer: "+manager.getNama());
        System.out.println("Gaji Bersih Manajer: "+manager.gajiBersih());
        System.out.println("");
    
    }
}
