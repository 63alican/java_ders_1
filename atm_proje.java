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
            }
            if (işlem =="b"){
                Scanner çekme =new Scanner(System.in);
                System.out.println("");
            }


        }

    }

}
