package CMSBll;

public class OrderAccount {
    private String custid;
    private String customerid;
    private String customername;
    private String customeraddress;
    private String customercontact;
    private String customerstatus;
    private String orderdetails;
    private String orderdate;
    private String customerfeedback;
    private String serviceamount;
    private String delivereddate;
    private String deliveredby;
    
    public OrderAccount() {
    
}
    
    public OrderAccount(String customerid, String customername, String customeraddress, String customercontact, String customerstatus, String orderdetails, String orderdate, String customerfeedback, String serviceamount, String deliverydate, String deliveryby) {
        this.customerid = customerid;
        this.customername = customername;
        this.customeraddress = customeraddress;
        this.customercontact = customercontact;
        this.customerstatus = customerstatus;
        this.orderdetails = orderdetails;
        this.orderdate = orderdate;
        this.customerfeedback = customerfeedback;
        this.serviceamount = serviceamount;
        this.delivereddate = deliverydate;
        this.deliveredby = deliveryby;
    }

    public OrderAccount(String data) {
        String[] dataArr = data.split(",");
            this.customerid = dataArr[0];
            this.customername = dataArr[1];
            this.customeraddress = dataArr[2];
            this.customercontact = dataArr[3];
            this.customerstatus = dataArr[4];
            this.orderdetails = dataArr[5];
            this.orderdate = dataArr[6];
            this.customerfeedback = dataArr[7];
            this.serviceamount = dataArr[8];
            this.delivereddate = dataArr[9];
            this.deliveredby = dataArr[10];
        
    }

    
    public String getCustid() {
        return custid;
    }
    
    public void setCustid(String custid){
        this.custid = custid;
    }
    
    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid;
    }
    
    public String getCustomerName(){
        return customername;
    }
    
    public void setCustomerName(String customername){
        this.customername = customername;
    }
    
    public String getCustomerAddress() {
        return customeraddress;
    }
    
    public void setCustomerAddress(String customeraddress) {
        this.customeraddress = customeraddress;
    }
    
    public String getCustomerContact(){
        return customercontact;
    }
    
    public void setCustomerContact(String customercontact){
        this.customercontact = customercontact;
    }
    
    public String getCustomerStatus(){
        return customerstatus;
    }
    
    public void setCustomerStatus(String customerstatus){
        this.customerstatus = customerstatus;
    }

    public String getOrderDetails() {
        return orderdetails;
    }

    public void setOrderDetails(String orderdetails) {
        this.orderdetails = orderdetails;
    }

    public String getOrderDate() {
        return orderdate;
    }

    public void setOrderDate(String orderdate) {
        this.orderdate = orderdate;
    }
    
    public String getCustomerFeedback() {
        return customerfeedback;
    }
    
    public void setCustomerFeedback(String customerfeedback){
        this.customerfeedback = customerfeedback;
    }
    
    public String getServiceAmount(){
        return serviceamount;
    }
    
    public void setServiceAmount(String serviceamount){
        this.serviceamount = serviceamount;
    }
    
    public String getDeliveredDate (){
        return delivereddate;
    }
    
    public void setDeliveredDate (String deliverydate){
        this.delivereddate = deliverydate;
    }
    
    public String getDeliveredBy (){
        return deliveredby;
    }
    
    public void setDeliveredBy (String deliveryby){
        this.deliveredby = deliveryby;
    }

    @Override
    public String toString() {
        return (this.customerid + "," + this.customername + "," + this.customeraddress + "," + this.customercontact + "," + this.customerstatus + "," + this.orderdetails + "," + this.orderdate + "," + this.customerfeedback + "," + this.serviceamount + "," + this.delivereddate + "," + this.deliveredby);
        
    }


}
