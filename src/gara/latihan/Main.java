package gara.latihan;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("=========================");
    System.out.println(" JUAL APEL ");
    System.out.println("=========================");
    
    Barang apel = new Barang("Apel", 5000, 10) ; 
    
    System.out.println("=========================");
    apel.showData();
    System.out.println("=========================");
    
    Scanner jumlahScanner = new Scanner(System.in) ;
    System.out.print("Masukkan jumlah apel yang ingin di beli :");
    int jumlahInt = jumlahScanner.nextInt() ;

    apel.setBeli(jumlahInt, apel.getHargaBarang());

    apel.Struct();

    jumlahScanner.close();

  }
}

class Barang{
  String namaBarang ;
  double hargaBarang ;
  int stokBarang ;
  double total = 0 ;

  Barang(  String namaBarang, double hargaBarang, int stokBarang ){
    this.namaBarang = namaBarang ;
    this.hargaBarang = hargaBarang ;
    this.stokBarang = stokBarang ;
  }

  void showData(){
    System.out.println("Nama  Barang : " + this.namaBarang);
    System.out.println("Harga Barang : " + this.hargaBarang);
    System.out.println("Stock Barang : " + this.stokBarang);
  }

  void setBeli(int stok, double harga){
     this.stokBarang -= stok ;
     this.total = stok * harga ;
  }

  void Struct(){
    System.out.println("Nama  Barang : " + this.namaBarang);
    System.out.println("Harga Barang : " + this.hargaBarang);
    System.out.println("Stock Barang : " + this.stokBarang);
    System.out.println("Total Harga  : " + this.total);
  }

  String getNamaBarang(){
    return this.namaBarang ;
  }
  
  double getHargaBarang(){
    return this.hargaBarang ;
  }
  
  int getStokBarang(){
    return this.stokBarang ;  
  }
  
}