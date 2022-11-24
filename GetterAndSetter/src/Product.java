public class Product {

    public Product(int id, int stockAmount, double price, String name){
        this.id=id;
        this.stockAmount=stockAmount;
        this.price=price;
        this.name=name;

    };
    private int id;
    private int stockAmount;
    private String name;
    private double  price;
    private String description;
    private String kod;

    public int getId(){
        return id;
    }
    public void setId(int i){
        this.id=id;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getKod() {
        return this.name.substring(0,1) + id;
    }

}

