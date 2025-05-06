//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int number = 31;
        int kalan = number % 2;
        System.out.println(kalan);
        boolean asal = true;

        for(int i=2; i<number; i++){
            if (number % i == 0){
                asal = false;
            }
        }
        if (asal){
            System.out.println(number+" sayısı asal sayıdır");
        }else{
            System.out.println(number+" asal sayı değildir");
        }
    }
}