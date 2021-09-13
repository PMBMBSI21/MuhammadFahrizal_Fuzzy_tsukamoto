
package Variabel;


public class Permintaan {
    //variabel permintaan
private static double minta;

    // nilai dari grafik
private static double kordinat1 = 0;
private static double kordinat2 = 1000;
private static double kordinat3 = 5000;

    //agar kita menampilkan nilai permintaan
public static double getminta(){
    return minta;
}
    //memberikan nilai pada inputan
public static void setminta(double minta){
    Permintaan.minta = minta; 
}
    //grafik fungsi turun
public static double turun(){
    if(minta>=kordinat1 && minta<=kordinat2) return 1;
    else if(minta>kordinat2 && minta<kordinat3 ) return (kordinat3-minta)/(kordinat3-kordinat2);
    else return 0;
}
    //grafil naik
public static double naik(){
    if(minta>=kordinat2 && minta<=kordinat3) return (minta-kordinat2)/(kordinat3-kordinat2);
   
    return 0;
    
}
}