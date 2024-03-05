/*
Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

Taksimetre KM başına 2.20 TL tutmaktadır.
Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
Taksimetre açılış ücreti 10 TL'dir. 
*/




import java.util.*;



public class Taksimetre {

    public static void main(String[] args){

        int km;
        double tutar;
        double acilis=10;
        double artis_mik=2.20;


        Scanner input=new Scanner(System.in);

        System.out.print("Lutfen gidilen mesafeyi giriniz:");

        km=input.nextInt();

        tutar = acilis+km*artis_mik;

        if (tutar<=20)
        {
            System.out.println("Odenecek tutar=20TL");
        }
        else
        {
            System.out.println("Odenecek tutar="+tutar+"TL");
        }


        









    }

}
