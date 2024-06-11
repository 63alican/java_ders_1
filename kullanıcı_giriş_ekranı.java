import java.util.Scanner;

public class kullanıcı_giriş_ekranı {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int sifre =908;
        String kullanici_adi ="alican";
        System.out.println("lütfen kullanıcı adı giriniz :");
        String deneme_kullanici =scanner.nextLine();
        System.out.println("lütfen şifre giriniz :");
        int deneme_sifre = scanner.nextInt();

        if(deneme_kullanici.equals("alican")){
            if (deneme_sifre==908){
                System.out.println("***********************************************");
                System.out.println("giriş başarılı sisteme yönlendiriliyorsunuz....");
                System.out.println("***********************************************");


            }
        }
            else {
                System.out.println("sistemden çıkılıyor.....");
                System.exit(3);
            }


    }
}
