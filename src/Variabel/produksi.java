/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Variabel;


public class produksi {
    private static double produk;

    // nilai dari grafik
private static double kordinat1 = 0;
private static double kordinat2 = 2000;
private static double kordinat3 = 7000;

    //agar kita menampilkan nilai permintaan
public static double getproduk(){
    return produk;
}

    //memberikan nilai pada inputan
public static void setproduk(double produk){
    produksi.produk = produk; 
}
    //grafik fungsi turun
public static double berkurang(){
    if(produk>=kordinat1 && produk<=kordinat2) return 1;
    else if(produk>kordinat2 && produk<kordinat3 ) return (kordinat3-produk)/(kordinat3-kordinat2);
    else return 0;
}
    //grafil naik
public static double bertambah(){
    if(produk>kordinat2 && produk<kordinat3) return (produk-kordinat2)/(kordinat3-kordinat2);
    else if(produk>=kordinat3 )return 1;
    else return 0;
    
}
public static double berkurang(double in){
    return(kordinat3-(in*(kordinat3-kordinat2)));
}
public static double bertambah(double in){
    return(kordinat2+(in*(kordinat3-kordinat2)));
}
}
