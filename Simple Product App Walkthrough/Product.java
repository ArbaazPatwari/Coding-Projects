/**
 * Attributes given to each product.
 *
 * @author Arbaaz Patwari
 * @version 12/12/2021
 */
public class Product
{
    public int id;
    
    public String name;
    
    public int quantity;
    
    /**
     * Constructor for objects of the class Product.
     */
    public Product(int id, String name)
    {
        this.id = id;
        this.name = name;
        quantity = 0;
    }
    
    /**
     * Returns the product's ID.
     */
    public int getID()
    {
        return id;
    }
    
    /**
     * Return's the product's name.
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Return's the quantity in stock.
     */
    public int getQuantity()
    {
        return quantity;
    }
    
    /**
     * Sets the quantity of stock via an input integer value.
     */
    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }
    
    /**
     * Increases the quantity of stock by an integer amount.
     */
    public void increaseQuantity(int amount)
    {
        quantity = quantity + amount;
    }
    
    /**
     * Decreases the quantity of stock by an integer amount.
     */
    public void decreaseQuantity(int amount)
    {
        if(quantity >= amount)
            quantity = quantity - amount;
    }
    
    /**
     * Returns the ID, name, and quantity in stock.
     */
    public String toString()
    {
        return id + ": " + name +" stock level: " + quantity;
    }
    
    /**
     * Prints the string above (with ID, name, quantity) to the terminal.
     */
    public void print()
    {
        System.out.println(toString());
    }
}
