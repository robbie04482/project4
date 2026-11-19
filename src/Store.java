public class Store {
    private String storeName;
    private Product[]products;
    private int[]soldCount;
    private int productCount;

    public Store(String storeName,int capacity) {
        this.storeName = storeName;
        this.soldCount = new int [capacity];
        this.products = new Product[capacity];
    }

    public int getProductCount() {
        return productCount;
    }

    public Product[] getProducts() {
        return products;
    }

    public void addProduct(Product product){
        if(product==null||productCount==products.length){
            return;
        }
        for(int i=0;i<productCount;i++){
            if(product==products[i]){
                return;
            }
        }
        this.products[productCount++]= product;

    }
    public int findProductIndex(int id){
        int index = -1;
        int i = 0;
        while (i < productCount) {
            if (products[i].getId() == id) {
                index = i;
                break;
            }
            i++;
        }
        return index;

    }
    public boolean sellProduct(int id, int quantity){
        int i = findProductIndex(id);
        if (i == -1 || quantity <= 0) {
            return false;
        }
        if(products[i].sell(quantity)){
            soldCount[i]+=quantity;
            return true;
        }
        return false;
    }
    public void printAvailableProducts(){
        for(int i=0;i<productCount;i++){
            if(products[i]==null){
                continue;
            }
            System.out.println(products[i].getInfo());
        }
    }
    public void printSalesReport(){
        System.out.println(storeName);
        for (int  i= 0;  i<productCount ; i++) {
            System.out.println(products[i].getName()+ " :" + soldCount[i]);
        }
    }
    public int getTotalUnitsSold(){
        int sum=0;
        for(int i=0;i<productCount;i++){
            sum+=soldCount[i];
        }
        return sum;
    }

}
