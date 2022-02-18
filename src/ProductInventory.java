import java.time.ZonedDateTime;
import java.util.ArrayList;

public class ProductInventory {

    private String asin;
    private String title;
    private Integer quantity;
    private ZonedDateTime lastUpdated;

    public ProductInventory(String asin, String title, Integer quantity, ZonedDateTime lastUpdated) {
        this.asin = asin;
        this.title = title;
        this.quantity = quantity;
        this.lastUpdated = lastUpdated;
    }

    public String getAsin(){
        return asin;
    }
    public String getTitle(){
        return title;
    }
    public int getQuantity(){
        return quantity;
    }
    public ZonedDateTime getLastUPdated(){
        return lastUpdated;
    }
    public void setAsin(String asin) {
        this.asin = asin;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void setLastUpdated(ZonedDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public static void main(String[] args) {
        ProductInventory test = new ProductInventory("1242", "121415", null,ZonedDateTime.now());
        System.out.println(test.getQuantity());
    }

}
