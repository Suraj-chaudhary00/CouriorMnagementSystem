package CMSBll;

public class CustomerAccount {
    private String customerid;
    private String customerfullname;
    private String customerusername;
    private String customerpassword;
    private String customeremail;
    
    
public CustomerAccount(){
    
}
    
    public CustomerAccount(String customerid, String customerfullname, String customerusername, String customeruserpassword, String customeremail) {
        this.customerid = customerid;
        this.customerfullname = customerfullname;
        this.customerusername = customerusername;
        this.customerpassword = customeruserpassword;
        this.customeremail = customeremail;
        }

    public CustomerAccount(String data) {
        String[] dataArr = data.split(",");
        this.customerid = dataArr[0];
        this.customerfullname = dataArr[1];
        this.customerusername = dataArr[2];
        this.customerpassword = dataArr[3];
        this.customeremail = dataArr[4];
    }

        

    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid;
    }
    
    public String getCustomerFullName() {
        return customerfullname;
    }

    public void setCustomerFullName(String customerfullname) {
        this.customerfullname = customerfullname;
    }
    
    public String getCustomerName() {
        return customerusername;
    }

    public void setCustomerName(String customerusername) {
        this.customerusername = customerusername;
    }

    public String getCustomerPassword() {
        return customerpassword;
    }

    public void setCustomerPassword(String customerpassword) {
        this.customerpassword = customerpassword;
    }
    
    public String getCustomerEmail() {
        return customeremail;
    }

    public void setCustomerEmail(String customeremail) {
        this.customeremail = customeremail;
    }
    
    
    @Override
    public String toString() {
        return (this.customerid + "," + this.customerfullname + "," + this.customerusername + "," + this.customerpassword + "," + this.customeremail);
        
    }



}
