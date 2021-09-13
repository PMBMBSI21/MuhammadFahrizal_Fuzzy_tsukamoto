
package Variabel;

public class Persediaan {
private static double stok;

    // nilai dari grafik
private static double kordinat1 = 0;
private static double kordinat2 = 100;
private static double kordinat3 = 600;

    //agar kita menampilkan nilai permintaan
public static double getstok(){
    return stok;
}

    //memberikan nilai pada inputan
public static void setstok(double stok){
    Persediaan.stok = stok; 
}
    //grafik fungsi turun
public static double sedikit(){
    if(stok>=kordinat1 && stok<=kordinat2) return 1;
    else if(stok>kordinat2 && stok<kordinat3 ) return (kordinat3-stok)/(kordinat3-kordinat2);
    else return 0;
}
    //grafil naik
public static double banyak(){
    if(stok>=kordinat2 && stok<=kordinat3) return (stok-kordinat2)/(kordinat3-kordinat2);
    return 0;
}
  
}
