public class Database {
 public static void main(String[] args) {
  ConnectTo conn_1 = ConnectTo.GetInstance();
  conn_1.PrintText("Koneksi dari MAHASISWA");
  ConnectTo conn_2 = ConnectTo.GetInstance();
  conn_2.PrintText("Koneksi dari Dosen");
  ConnectTo conn_3 = ConnectTo.GetInstance();
  conn_3.PrintText("Koneksi dari Wali");
 }
}

class ConnectTo{
 static int counter = 0;
 static ConnectTo connection = null;
 public ConnectTo() {  
  ConnectTo.counter++;
  System.out.println("Koneksi bertemu di "+ConnectTo.counter+" pusat");
 }
 
 public static ConnectTo GetInstance(){
  if(ConnectTo.connection == null){
   ConnectTo.connection = new ConnectTo();
  }
  
  return ConnectTo.connection;
 }
 
 public void PrintText(String text){
  System.out.println(text);
 }
}