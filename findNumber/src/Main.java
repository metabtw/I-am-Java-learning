//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] sayilar = new int[] {1,3,5,6,8,9};
        int aranan = 8;
        boolean varMi = false;

        for (int sayi : sayilar){
            if (sayi == aranan){
                varMi = true;
                break;
            }
        }

        if (varMi){
            System.out.println("sayıyı buldum");
        }else {
            System.out.println("sayı yok");
        }
    }
}