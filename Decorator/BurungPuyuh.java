public class BurungPuyuh {
 public static void main(final String[] args) {
     System.out.println("Burung Apatuh?");
  Binatang binatang = new Burung();
  binatang.Bentuk();
  System.out.println("===================Kekuatan di tambahkan======================");
  binatang = new Kaki(binatang);
  binatang.Bentuk();
  System.out.println("===================Kekuatan di tambahkan======================");
  binatang = new Sayap(binatang);
  binatang.Bentuk();
 }
}

interface Binatang{
 public void Bentuk();
}

class Burung implements Binatang{
 @Override
 public void Bentuk() {
  System.out.println("Itu Burung Puyuh");
 }
}


abstract class Decorator implements Binatang{
 protected Binatang binatang = null;
 public Decorator(final Binatang binatang) {
  this.binatang = binatang;
 }
}

class Kaki extends Decorator{
 public Kaki(final Binatang binatang) {
  super(binatang);
 }
 @Override
 public void Bentuk() {
  this.binatang.Bentuk();
  this.BisaLari();
 }
 
 private void BisaLari(){
  System.out.println("Burung Puyuh Bisa Lari");
 }
}

class Sayap extends Decorator{
 public Sayap(final Binatang binatang) {
  super(binatang);
 }
 
 @Override
 public void Bentuk() {
  this.binatang.Bentuk();
  this.BisaTerbang();
 }
 
 private void BisaTerbang(){
  System.out.println("Burung Puyuh Bisa Terbang");
 }
}