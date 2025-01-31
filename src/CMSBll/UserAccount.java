package CMSBll;

public class UserAccount {
    private String userid;
    private String username;
    private String userpassword;
    private String userrole;
    private String email;
    
    
public UserAccount(){
    
}
    
    public UserAccount(String userid, String username, String userpassword, String userrole, String email) {
        this.userid = userid;
        this.username = username;
        this.userpassword = userpassword;
        this.userrole = userrole;
        this.email = email;
    }

    public UserAccount(String data) {
        String[] dataArr = data.split(",");
        this.userid = dataArr[0];
        this.username = dataArr[1];
        this.userpassword = dataArr[2];
        this.userrole = dataArr[3];
        this.email = dataArr[4];
    }

    
    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUserName() {
        return username;
    }

    public void setUserName(String username) {
        this.username = username;
    }

    public String getUserPassword() {
        return userpassword;
    }

    public void setUserPassword(String userpassword) {
        this.userpassword = userpassword;
    }
    
    public String getUserRole() {
        return userrole;
    }

    public void setUserRole(String userrole) {
        this.userrole = userrole;
    }
    
    public String getUserEmail() {
        return email;
    }

    public void setUserEmail(String email) {
        this.email = email;
    }
    
    @Override
    public String toString() {
        return (this.userid + "," + this.username + "," + this.userpassword + "," + this.userrole + "," + this.email);
        
    }



}
