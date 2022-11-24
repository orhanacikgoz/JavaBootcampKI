public class Main {
    public static void main(String[] args) {
        Product product=new Product(5000, 7,45.8, "Laptop");
        ProductManager productManager =new ProductManager();

        /*product.setName("lAPTOP");
        product.setId(3);
        product.setStockAmount(5);
        product.setDescription("I9 islemci - MSI 3080TI Ekran kartı vs");*/

        productManager.Add(product);
        System.out.println(product.getKod());












    }
}