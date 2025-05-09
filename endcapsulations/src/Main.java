//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.setName("Laptop");
        product.setId(1);
        product.setDescription("samsung laptop");
        product.setPrice(51582);
        product.setStockAmount(2);


        ProductManager productManager = new ProductManager();
        productManager.Add(product);



        System.out.println(product.getKod());
    }
}