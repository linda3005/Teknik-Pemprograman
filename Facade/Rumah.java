public class Rumah {  
    public static void main(String args[]){  
      ShopKeeper sk=new ShopKeeper();  
      sk.Rumah1Sale();  
      sk.Tanah1Sale();        
    }
} 

interface Developer {  
    public void NomorRumah();  
    public void Harga();  
} 

class Rumah1 implements Developer {  
    @Override  
    public void NomorRumah() {  
        System.out.println(" Nomor 1 Type 45");  
    }  
    @Override  
    public void Harga() {  
    System.out.println(" 650 Juta ");  
    }  
} 

class Tanah1 implements Developer {  
    @Override  
    public void NomorRumah() {  
    System.out.println(" Tanah 1 ");  
    }  
    @Override  
    public void Harga() {  
        System.out.println(" 250 Juta ");  
    }  
} 

class Rumah2 implements Developer {  
    @Override  
    public void NomorRumah() {  
    System.out.println(" Rumah 2 type 36  ");  
    }  
    @Override  
    public void Harga() {  
        System.out.println(" 500 Juta ");  
    }  
} 

class ShopKeeper {  
    private Developer Rumah1;  
    private Developer Tanah1;  
    private Developer Rumah2;  
      
    public ShopKeeper(){  
        Rumah1= new Rumah1();  
        Tanah1=new Tanah1();  
        Rumah2=new Rumah2();  
    }  
    public void Rumah1Sale(){  
        Rumah1.NomorRumah();  
        Rumah1.Harga();  
    }  
        public void Tanah1Sale(){  
        Tanah1.NomorRumah();  
        Tanah1.Harga();  
    }  
   public void Rumah2Sale(){  
    Rumah2.NomorRumah();  
    Rumah2.Harga();  
        }  
} 