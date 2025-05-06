//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String mesaj ="Bugün hava çok güzel";
        String yeniMesaj = sehirVer();
        System.out.println(yeniMesaj);
        int toplama = topla(4,3);
        System.out.println(toplama);
        int toplam = topla2(2,3,4,5,6,7,8);
        System.out.println(toplam);
    }

    public static void ekle (){
        System.out.println("eklendi");
    }


    public static void sil (){
        System.out.println("silindi");
    }


    public static void güncelle (){
        System.out.println("güncellendi");
    }

    public static int topla (int sayi1,int sayi2){
        return sayi1+sayi2;
    }

    public static int topla2(int... sayilar){
        int toplam =0;
        for (int sayi:sayilar){
            toplam+=sayi;
        }

        return toplam;
    }

    public static String sehirVer(){
        return "Kütahya";
    }
}