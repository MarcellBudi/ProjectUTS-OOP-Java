/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menurun;
/**
 *
 * @author LENOVO
 */
public class hitmenurun {  
    int hasil = 0; 
    public int bungamenurun(int harga, int dp, float bunga, int bulan,int admin){         
            int a=1;
            int harga2 = harga - dp;
            int pokok = harga2/bulan+admin;
            int angsuran= harga2/bulan;
            float bungaawal = harga * bunga/100;
            float total = pokok + bungaawal;
            int sisahutang = harga2-angsuran*a;

            System.out.println("Bulan ke-" + a);
            System.out.println("Bunga Pinjaman Setiap Bulan : Rp." +bungaawal);
            System.out.println("Besar Angsuran Setiap Bulan : Rp." +pokok);
            System.out.println("Besar Angsuran + Bunga      : Rp." +total);
            System.out.println("Sisa hutang                 : Rp." +sisahutang);
            System.out.println("");
            
            for(int x=2;x<=bulan;x++){
                harga2 = harga - dp;
                angsuran= harga2/bulan; 
                sisahutang = harga2-angsuran*x;
                int tes = harga2 - angsuran * (x-1);
                float bungamenurun = tes * bunga/100;
                float totaldua = angsuran + bungamenurun;
            
                System.out.println("Bulan ke-" + x);
                System.out.println("Bunga Pinjaman Setiap Bulan : Rp." +bungamenurun);
                System.out.println("Besar Angsuran Setiap Bulan : Rp." +angsuran);
                System.out.println("Besar Angsuran + Bunga      : Rp." +totaldua);
                System.out.println("Sisa hutang                 : Rp." +sisahutang);
                System.out.println("");
            }
            
       return hasil;
    }
    
}
