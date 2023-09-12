import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Değişkenler
        int matematik, fizik, turkce, kimya, muzik;


        //Scanner nesnesi
        Scanner inpt = new Scanner(System.in);

        //Ders notlarını al
        System.out.print("Matematik notunuzu giriniz: ");
        matematik = inpt.nextInt();
        System.out.print("Fizik notunuzu giriniz: ");
        fizik = inpt.nextInt();
        System.out.print("Türkçe notunuzu giriniz: ");
        turkce = inpt.nextInt();
        System.out.print("Kimya notunuzu giriniz: ");
        kimya = inpt.nextInt();
        System.out.print("Müzik notunuzu giriniz: ");
        muzik = inpt.nextInt();

        if (matematik < 0 || matematik > 100 || fizik < 0 || fizik > 100 || turkce < 0 || turkce > 100 || kimya < 0 || kimya > 100 || muzik < 0 || muzik > 100) {
            System.out.print("Geçersiz bir not girdiniz lütfen kontrol edin!");

        } else {
            //Ortalamayı hesapla
            double average = (matematik + fizik + turkce + kimya + muzik) / 5;
            if (average >= 55) {
                System.out.print("Tebrikler, sınıfı geçtiniz!");
            } else {
                System.out.println("Üzgünüz, sınıfta kaldınız!");
            }
            System.out.print("Ortalamanız: " + average);
        }


    }
}