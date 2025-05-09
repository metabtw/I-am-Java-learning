//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.name = "Laptop";
        product.id=1;
        product.description = "samsung laptop";
        product.price=51582;
        product.stockAmount=2;

        ProductManager productManager = new ProductManager();
        productManager.Add(product);


        System.out.println(product.name);
    }
}