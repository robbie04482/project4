//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Product Notebook = new Product("Notebook",12.5,3);
        Product Pen = new Product("Pen",4.0,2);
        Product Bottle = new Product("Bottle",30.0,0);
        Store MyStore = new Store("MyStore",3);
        MyStore.addProduct(Notebook);
        MyStore.addProduct(Pen);
        MyStore.addProduct(Bottle);
        MyStore.printAvailableProducts();
        Product train = new Product("train",15.0,5);
        MyStore.addProduct(train);
        MyStore.printAvailableProducts();

        MyStore.sellProduct(1000,2);
        MyStore.printAvailableProducts();
       MyStore.sellProduct(1001,3);
        MyStore.printAvailableProducts();
        MyStore.sellProduct(1001,2);
        MyStore.printAvailableProducts();
       Pen.setPrice(-5);
        MyStore.printAvailableProducts();
        for(int i=0;i<MyStore.getProductCount();i++){
            if(MyStore.getProducts()[i].getStock()!=0){
                System.out.println(MyStore.getProducts()[i].getInfo());
            }
        }
        System.out.println("Total units sold: " + MyStore.getTotalUnitsSold());
        for(int i=0;i<MyStore.getProductCount();i++){
            System.out.println(MyStore.getProducts()[i].getId());
        }
        System.out.println(Product.getNextId());


    }
}