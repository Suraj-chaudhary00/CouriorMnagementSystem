package CMSBll;

public class FeedbackAccount {
    private String feedbackcustomerid;
    private String feedbackcustomername;
    private String feedbackcustomerfeedback;
    private String feedbackcategory;
    private String improveneeded;


public FeedbackAccount(){

}

public FeedbackAccount(String feedbackcustomerid, String feedbackcustomername, String feedbackcustomerfeedback, String feedbackcategory, String improveneeded){
    this.feedbackcustomerid = feedbackcustomerid;
    this.feedbackcustomername = feedbackcustomername;
    this.feedbackcustomerfeedback = feedbackcustomerfeedback;
    this.feedbackcategory = feedbackcategory;
    this.improveneeded = improveneeded;
}

    public FeedbackAccount(String fee) {
        String[] dataArr = fee.split(",");
            this.feedbackcustomerid = dataArr[0];
            this.feedbackcustomername = dataArr[1];
            this.feedbackcustomerfeedback = dataArr[2];
            this.feedbackcategory = dataArr[3];
            this.improveneeded = dataArr[4];
        
    }


    public String getFeedbackCustomerid() {
        return feedbackcustomerid;
    }
    
    public void setFeedbackCustomerid(String feedbackcustomerid){
        this.feedbackcustomerid = feedbackcustomerid;
    }
    
    public String getFeedbackCustomerName() {
        return feedbackcustomername;
    }
    
    public void setFeedbackCustomerName(String feedbackcustomername){
        this.feedbackcustomername = feedbackcustomername;
    }
    
    public String getFeedbackCustomerFeedback() {
        return feedbackcustomerfeedback;
    }
    
    public void setFeedbackCustomerFeedback(String feedbackcustomerfeedback){
        this.feedbackcustomerfeedback = feedbackcustomerfeedback;
    }
    
    public String getFeedbackCategory() {
        return feedbackcategory;
    }
    
    public void setFeedbackCategory(String feedbackcategory){
        this.feedbackcategory = feedbackcategory;
    }
    
    public String getImproveNeeded() {
        return improveneeded;
    }
    
    public void setImproveNeeded(String improveneeded){
        this.improveneeded = improveneeded;
    }

    @Override
    public String toString() {
        return (this.feedbackcustomerid + "," + this.feedbackcustomername + "," + this.feedbackcustomerfeedback + "," + this.feedbackcategory + "," + this.improveneeded);
        
    }




}