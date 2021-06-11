package paket;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws InterruptedException {
        Arayuz a = new Arayuz();
        String kullaniciAdi;

        String sifre;
        System.out.println("Lütfen Kullanıcı adı ve şifrenizi giriniz:");

        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        NoticeObservable noticeObservable = new NoticeObservable();
        Kullanici k = new Kullanici();

        k.setObservable(noticeObservable);
        noticeObservable.addObserver(k);

        kullaniciAdi = sc.next();
        sifre = sc1.next();

        k.kullaniciAdi = kullaniciAdi;
        k.sifre = sifre;

   k=   a.Login(kullaniciAdi, sifre);

        System.out.println("Lüffen yapmak istediğiniz işlemi seçiniz...");
        System.out.println("1:Sıcaklığı görüntüle");
        System.out.println("2:Soğutucuyu Aç");
        System.out.println("3:Soğutucuyu Kapat");
        System.out.println("4:cihaz bilgilerimi görüntüle");
        int secim = sc1.nextInt();
        switch (secim) {


            case 1:
                a.SicaklıkGetir();
                break;
            case 2:
                a.sogutucuAc();
                noticeObservable.notifyObserver();
                break;

            case 3:
                a.sogutucuKapat();
                break;

            case 4:
        Cihaz c=    a.CihazGoruntule(k.cihazId);
             System.out.println("marka::"+c.marka);
                System.out.println("renk::"+c.renk);
                System.out.println("model::"+c.model);

        }


    }

}
