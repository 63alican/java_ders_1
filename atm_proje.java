import java.util.Scanner;

public class atm_proje {
    public static void main(String[]args) {

        Scanner scanner=new Scanner(System.in);
        int bakiye =1000;
        int çekme=0;
        int yatırma=0;
        String işlemler ="lütfen yapmak istediğiniz işlemi seçiniz... \n" +
                "a.)bakiye sorgulama \n" +
                "b.)para çekme \n" +
                "c.)para yatırma \n" +
                "q.)çıkış \n";
        System.out.println("*****************************");
        System.out.println(işlemler);
        System.out.println("*****************************");


        while (true) {
            System.out.println("işlemi seçiniz :");
            String işlem=scanner.nextLine();
            if (işlem =="a"){
                System.out.println(bakiye);
                break;
            }
            if (işlem.equals("b")){

                System.out.println("lütfen çekmek istediğiniz miktarı giriniz :");
                int m1 =scanner.nextInt();
                int s1 =bakiye-m1;
                System.out.println("kalan bakiye :" +s1);
                break;


            }

            if (işlem=="c") {

                System.out.println("lütfen yatırmak istediğiniz miktarı giriniz :");
                int m2 = scanner.nextInt();
                int s2 =bakiye +m2;
                System.out.println("yeni bakiye :" +s2);
                break;
            }
            if (işlem=="q"){
                break;
            }
                break;


        }

    }

}
