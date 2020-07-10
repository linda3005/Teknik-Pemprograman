import java.util.Date;

public class CheckMain {
 public static void main(String[] args) {
  Proxy proxy = new Proxy();
  
  Printer_1 printer_1 = new Printer_1();
  printer_1.Text();  
  
  proxy.Text();
 }
}

abstract class Temporary{
 public void Text(){
  System.out.println("Im a Text from class temporary");
 }
}

class Printer_1 extends Temporary{
 public Printer_1() {
 } 
}

class Printer_2 extends Temporary{
 public Printer_2() {
  try{
   Thread.sleep(5000);
  }catch (Exception e) {
   e.printStackTrace();
  }
 }
}

class Proxy{
 Printer_2 printer_2 = null;
 public Proxy() {
  System.out.println("Class Proxy di inisialisasi");
 }
 
 public void Text(){
  if(printer_2 == null){
   printer_2 = new Printer_2();
  }
  System.out.println("---------------------------");
  printer_2.Text();
  System.out.println("dari class Proxy");
  System.out.println("---------------------------");
 }
}  