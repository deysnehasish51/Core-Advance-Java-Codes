public class Product
{
    int productId;
    String productName;
    int currentQuantity=230;

    public void addStock(int quantity)
    {
       this.currentQuantity+=quantity;
        System.out.println("Updated Quantity : "+currentQuantity);
    }

    public void sellingStock(int quantity)
    {
        this.currentQuantity-=quantity;
        System.out.println("Quantity after Sellsing : "+currentQuantity);
    }

    public void stockInfo(int productId,String productName)
    {
        this.productId=productId;
        this.productName=productName;
        System.out.println("----Product Details ----");
        System.out.println("Product ID : "+productId);
        System.out.println("Product Name : "+productName);
        System.out.println("Current Stock Quantity : "+this.currentQuantity);
    }
    public static void main(String []args)
    {
        Product p1= new Product();
        
        p1.addStock(23);
        p1.sellingStock(45);
        p1.stockInfo(1243,"Gaming Laptop");
    }
}