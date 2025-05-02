//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String mesaj = "how are you?";
        System.out.println(mesaj);

        System.out.println("eleman sayısı : "+mesaj.length());
        System.out.println("5.eleman : "+mesaj.charAt(4));
        System.out.println(mesaj.concat(" what do you do"));
        System.out.println(mesaj.startsWith("A"));
        System.out.println(mesaj.endsWith("?"));
        char[] karakterler = new char[5];
        mesaj.getChars(0,4,karakterler,0);
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf("ar"));
        System.out.println(mesaj.lastIndexOf("w"));
    }
}