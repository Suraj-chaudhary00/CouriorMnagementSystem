package CMSDao;
import CMSBll.UserAccount;
import java.io.IOException;
import CMSBll.CustomerAccount;

public interface MSUserLoginDAO {
    public boolean checkUser(UserAccount u) throws IOException; 

    public boolean checkCustomer(CustomerAccount ca) throws IOException; 
}
