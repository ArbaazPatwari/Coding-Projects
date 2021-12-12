import java.util.ArrayList;
/**
 * Manages the stock in the app.
 *
 * @author Arbaaz Patwari
 * @version 11/12/2021
 */
public class ProductList
{
    private ArrayList<Product> stock;
    
    public int quantity;
    public int id;
    public String name;
    
    /**
     * Constructor for objects of class ProductList
     */
    public ProductList()
    {
        stock = new ArrayList<Product>();
    }
    
    /**
     * Add a product to the list.
     */
    public void add(Product item)
    {
        stock.add(item);
    }
    
    /**
     * Remove a product from the list.
     */
    public void remove(Product item)
    {
        stock.remove(item);
    }
    
    /**
     * Finds a product in the list via ID.
     */
    public Product findProduct(int productID)
    {
        for(Product product : stock)
        {
            if(product.getID() == productID)
            {
                 return product;
            }
        }
        return null;
    }
    
    /**
     * Buys a user-defined quantity of products.
     */
    public void buyProduct(int productID, int amount)
    {
        Product product = findProduct(productID);
        product.increaseQuantity(amount);
        System.out.println("Bought " + amount + " of " + product);
    }
    
    /**
     * Sells a user-defined quantity of products.
     */
    public void sellProduct(int productID, int amount)
    {
        Product product = findProduct(productID);
        
        if(product != null)
        {
            if(product.getQuantity() > 0)
            {
                product.decreaseQuantity(amount);
                System.out.println("Sold " + amount + " of " + 
                product.getName());
            }
            else
            {
                System.out.println("The product " + product.getName() +
                " is out of stock");
            }
        }
        else
        {
            System.out.println("Couldn't find product");
        }
    }
    
    /**
     * Prints out each product and their stock level.
     */
    public void print()
    {
        for(Product product : stock)
        {
            System.out.println(product);
        }
    }
}
