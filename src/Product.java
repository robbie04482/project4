public class Product {
    private int id;
    private String name="Unknown";
    private double price=1.0;
    private int stock;
    static int nextId=1000;



    Product(String name, double price, int stock){
        if(!name.isEmpty()){
            this.name=name;
        }

        if (price > 0) {
            this.price = price;
        }
        if(stock>0){
            this.stock = stock;
        }

        this.id = nextId++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public static int getNextId() {
        return nextId;
    }

    public void setName(String name) {
        if(!name.isBlank()){
            this.name = name;
        }

    }

    public void setPrice(double price) {
        if(price>0){
            this.price = price;
        }

    }

    public void setStock(int stock) {
        if(stock>=0){
            this.stock = stock;
        }

    }
    public boolean sell(int quantity){
        if(this.getStock()>=quantity){
            this.stock-=quantity;
            return true;
        }
        return false;
    }
    public String getInfo() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                '}';
    }
}
