//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     /* yaş kontrol

        int age=17;
        if(age<18){
            System.out.println("no entry");
        }else{
            System.out.println("entry");
        }   */

        /*  karşılaştırma

        int sayi1=15 , sayi2=58 , sayi3=34;

        if(sayi1>sayi2 && sayi1>sayi3){
            System.out.println("Sayı 1 en büyüktür: " + sayi1);
        } else if (sayi2>sayi3) {
            System.out.println("Sayi 2 en büyük: "+sayi2);
        } else{
            System.out.println("Sayi 3 en büyüktür: "+sayi3);
        }   */

        /* not kontrol */

        char grade='B';

        switch (grade){
            case 'A':
                System.out.println("mükemmel geçti");
                break;

            case 'B':
                System.out.println("güzel geçti");
                break;
            case 'C':
                System.out.println("geçti");
                break;
            case 'D':
                System.out.println("zor geçti");
                break;
            case 'F':
                System.out.println("kaldı");
                break;
            default:
                System.out.println("geçersiz giriş");
        }



    }
}