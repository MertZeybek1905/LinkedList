
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void listeyiBastır(LinkedList<String>gidilecek){
        ListIterator<String> iter= gidilecek.listIterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
    public static void SıralıEkle(LinkedList<String>yer,String yeni){
        ListIterator<String>ıterator= yer.listIterator();
        while(ıterator.hasNext()){
            int karsılastır=ıterator.next().compareTo(yeni);
            if(karsılastır==0){
                System.out.println("Yer mevcuttur");
            }
           else if(karsılastır<0){
               
            }
            else if(karsılastır>0){
                ıterator.previous();
                ıterator.add(yeni);
                return;
            }

        }
        ıterator.add(yeni);
       

    }
    
    public static void main(String[] args) {
        
        LinkedList<String> gidilecek_yerler = new LinkedList<String>();

        /*gidilecek_yerler.add("Okul");
        gidilecek_yerler.add("hastane");
        gidilecek_yerler.add("ev");
        gidilecek_yerler.add("market");
        
       //listeyiBastır(gidilecek_yerler); */
       SıralıEkle(gidilecek_yerler, "okul");
       SıralıEkle(gidilecek_yerler, "kütüphane");
       SıralıEkle(gidilecek_yerler, "ev");
       SıralıEkle(gidilecek_yerler, "masaj");
       listeyiBastır(gidilecek_yerler);
    }


}
