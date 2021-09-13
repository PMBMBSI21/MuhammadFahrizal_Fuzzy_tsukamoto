
package ai_fahri_fuzzy_tsukomoto;


import Variabel.Permintaan;
import Variabel.Persediaan;
import Variabel.produksi;
import Variabel.karyawan;


public class rulebase {
  private  static double [] x_produksi = new double[6];
  private  static double [] y_produksi = new double[6];  
  private static double jumlah;
  
 public static void menghitung_x(){
     
     x_produksi[0]=Math.min(Permintaan.turun(),Persediaan.banyak());
     x_produksi[0]=Math.min(x_produksi[0],karyawan.sedikit());
     x_produksi[1]=Math.min(Permintaan.turun(),Persediaan.banyak());
     x_produksi[1]=Math.min(x_produksi[1],karyawan.banyak());
     x_produksi[2]=Math.min(Permintaan.turun(),Persediaan.sedikit());
     x_produksi[2]=Math.min(x_produksi[2],karyawan.sedikit());
     x_produksi[3]=Math.min(Permintaan.turun(),Persediaan.sedikit());
     x_produksi[3]=Math.min(x_produksi[3],karyawan.banyak());
     x_produksi[4]=Math.min(Permintaan.naik(),Persediaan.banyak());
     x_produksi[4]=Math.min(x_produksi[3],karyawan.sedikit());
     x_produksi[5]=Math.min(Permintaan.naik(),Persediaan.banyak());
     x_produksi[5]=Math.min(x_produksi[3],karyawan.banyak());
 } 
 public static void menghitung_y(){
     y_produksi[0]=produksi.berkurang(x_produksi[0]);
     y_produksi[1]=produksi.bertambah(x_produksi[1]);
     y_produksi[2]=produksi.berkurang(x_produksi[2]);
     y_produksi[3]=produksi.berkurang(x_produksi[3]);
     y_produksi[4]=produksi.berkurang(x_produksi[4]);  
     y_produksi[5]=produksi.bertambah(x_produksi[5]);
 }
 
 public static double hasilproduksi(){
     double atas =0, bawah=0;
     for(int i=0;i<6;i++){
         System.out.println("y_produksi ke-"+i+ ": "+ y_produksi[i]);
         System.out.println("x_produksi ke-"+i+ ": "+ x_produksi[i]);
         atas+=(x_produksi[i]*y_produksi[i]);
         bawah+=x_produksi[i];
     }
     System.out.println(atas/bawah);
     return (atas/bawah);
 }
}