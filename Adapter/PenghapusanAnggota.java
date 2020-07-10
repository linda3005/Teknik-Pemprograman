public class PenghapusanAnggota {
 public static void main(String[] args) {
  Connection connection = new Connection("localhost", "Organisasi", "Ketua", "");
  AdapterConnnection adapter = new AdapterConnnection(connection);
  adapter.GetDataAnggota();
  adapter.DeleteAnggota("1234567890");
  adapter.Keterangan();
 }
}

class Connection{
 public Connection(String host,String database,String username,String password) {
  this.host = host;
  this.database = database;
  this.username = username;
  this.password = password;
 }
 
 public void ExecuteQuery(String text){
  System.out.println(text);
 }
 
 public void ExecuteUpdate(String text){
  System.out.println(text);
 }
 
 private String host,database,username,password;
}

class AdapterConnnection{
 Connection connection;
 public AdapterConnnection(Connection connection) {
  this.connection = connection;
 }
 
 public void GetDataAnggota(){
  connection.ExecuteQuery("Memilih data Anggota");
 }
 
 public void DeleteAnggota(String nomor){
  connection.ExecuteUpdate("Menghapus Anggota dengan nomor anggota = '"+nomor+"'");
 }

 public void Keterangan(){
     connection.ExecuteUpdate("Penghapusan Selesai");
 }
} 