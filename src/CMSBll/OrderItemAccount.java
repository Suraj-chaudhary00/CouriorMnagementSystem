package CMSBll;

public class OrderItemAccount {
    private String secretcode;
    private String itemname;
    private String price;
    
    
public OrderItemAccount(){
    
}
    
    public OrderItemAccount(String secretcode, String itemname, String price) {
        this.secretcode = secretcode;
        this.itemname = itemname;
        this.price = price;
        }

    public OrderItemAccount(String data) {
        String[] dataArr = data.split(",");
        this.secretcode = dataArr[0];
        this.itemname = dataArr[1];
        this.price = dataArr[2];
        }

        

    public String getItemid() {
        return secretcode;
    }

    public void setItemid(String secretcode) {
        this.secretcode = secretcode;
    }
    
    public String getItemName() {
        return itemname;
    }

    public void setItemName(String itemname) {
        this.itemname = itemname;
    }
    
    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    
    
    @Override
    public String toString() {
        return (this.secretcode + "," + this.itemname + "," + this.price);
        
    }



}
