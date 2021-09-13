package Variabel;


public class karyawan {
    private static double jumlah;

    // nilai dari grafik
private static double kordinat1 = 0;
private static double kordinat2 = 50;
private static double kordinat3 = 200;


public static double getjumlah(){
return jumlah;    
}
//
public static void setjumlah(double jumlah){
    karyawan.jumlah = jumlah;
}
    //grafik fungsi turun
public static double sedikit(){
    if(jumlah>=kordinat1 && jumlah<=kordinat2) return 1;
    else if(jumlah>kordinat2 && jumlah<kordinat3 ) return (kordinat3-jumlah)/(kordinat3-kordinat2);
    else return 0;
}
    //grafil naik
public static double banyak(){
    if(jumlah>=kordinat2 && jumlah<=kordinat3) return (jumlah-kordinat2)/(kordinat3-kordinat2);
   
    return 0;   
}
}