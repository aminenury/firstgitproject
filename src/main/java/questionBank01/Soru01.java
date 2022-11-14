package questionBank01;

import java.util.Scanner;

public class Soru01 {
    public static void main(String[] args) {
        //120'den 11'e kadar 4 ile bölünebilen ve 6 ile bölünebilen tüm tam sayıları aynı satırda iki
        //ardışık tam sayı arasında boşluk bırakarak yazınız.

       String s="";
        for (int i = 120; i>10; i--){
            if (i%4==0 && i%6==0){
                s=s+i+" ";
            }
        }
        System.out.println(s);
        System.out.println("");
      //) Bir String’ de tekrarlanan karakterleri yazdırmak için kod yazınız.
        //Örneğin; accessories ´ ces
        //1. Yol:
        String str = "accessories";
        String d ="";
         for (int i=0 ; i<str.length(); i++){
             String c = str.substring(i,i+1);
             if (str.indexOf(c)!=str.lastIndexOf(c)){
                 if (!d.contains(c)){
                     d=d+c;
                 }
             }
         }
        System.out.println(d);


     //) Bir String ‘ in palindrom olup olmadığını kontrol etmek için kod yazınız. Bir String, tersi ile
        //aynıysa, buna palindrom denir. Örneğin; “anna”, “123321” palindromlardır.
        Scanner input =new Scanner(System.in);
        System.out.println("bir kelime giriniz");
        String st = input.nextLine();
        String f = "";
        for (int i = st.length()-1; i>-1; i--){
           String l= st.substring(i,i+1);
                f= f + l;
        }if (st.equals(f)){
            System.out.println("polindram");
        }else{
            System.out.println("degildir");
        }








    }
}
