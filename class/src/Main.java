//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CustumerManager custumerManager = new CustumerManager();
        CustumerManager custumerManager2 = new CustumerManager();
        custumerManager = custumerManager2;
        custumerManager.ekle();
        custumerManager.sil();
        custumerManager.update();

        //value type
        int sayi1 = 10;
        int sayi2 = 20;
        sayi2 = sayi1;
        sayi1 = 30;
        System.out.println(sayi2);


        int[] sayilar1=new int[] {1,2,3};
        int[] sayilar2=new int[] {4,5,6};
        sayilar2=sayilar1;
        sayilar1[0]=10;
        System.out.println(sayilar2[0]);

    }
}

