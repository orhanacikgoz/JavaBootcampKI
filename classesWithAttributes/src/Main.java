public class Main {
    public static void main(String[] args) {
        Product product=new Product();
        product.set_description("lENOVA LAPTOP");
        product.set_name("lAPTOP");
        product.set_price(1897);
        product.set_stockAmount(9);


        ProductManager productManager=new ProductManager();
        productManager.Add(product);

    }

}