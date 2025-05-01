//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //ders 1

        String[] ogrenciler = new String[3];
        ogrenciler[0]="ali";
        ogrenciler[1]="veli";
        ogrenciler[2]="ayşe";

        for(int i=0;i<ogrenciler.length;i++){
            System.out.println(ogrenciler[i]);
        }

        //genel kullanım

        for(String ogrenci:ogrenciler){
            System.out.println(ogrenci);
        }

        //ders 2 Recap Demo

        double[] myList = {1.2,1.3,4.3,5.6,2.1,4.7,3.3};
        double total=0;
        double max = myList[0];
        for(double number:myList){
            if(max<number){
                max=number;
            }
            total = total + number;
            System.out.println(number);
        }

        System.out.println("toplam = " + total);
        System.out.println("En büyük = " + max);



        // ders 3 çok boyutlu diziler

        String[][] sehirler=new String[3][3];

        sehirler[0][0] = "istanbul";
        sehirler[0][1] = "bursa";
        sehirler[0][2] = "çanakkale";
        sehirler[1][0] = "izmir";
        sehirler[1][1] = "uşak";
        sehirler[1][2] = "kütahya";
        sehirler[2][0] = "diyarbakır";
        sehirler[2][1] = "şanlıurfa";
        sehirler[2][2] = "gaziantep";

        for(int i=0;i<=2;i++){
            for(int j=0;j<=2;j++){
                System.out.println(sehirler[i][j]);
            }
        }


    }
}