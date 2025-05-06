//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int number = 28;
        int sum = 0;

        for (int i=1;i<number;i++){
           int islem = number % i ;
           if (islem == 0){
               sum += i;
           }
        }

        if (sum == number){
            System.out.println(number + " Sayısı mükemmel sayıdır");
        }else {
            System.out.println(number + " Sayısı mükemmel sayı değildir");
        }
    }
}