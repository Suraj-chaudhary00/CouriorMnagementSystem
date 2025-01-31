package CMSDao;
import CMSBll.UserAccount;
import CMSBll.OrderAccount;
import CMSBll.FeedbackAccount;
import java.io.IOException;
import java.util.ArrayList;
import CMSBll.CustomerAccount;
import CMSBll.OrderItemAccount;

public interface UserAccountDAO {
    void SaveUser(UserAccount ua)throws IOException;
    void UpdateUser(UserAccount ua)throws IOException;
    void DeleteUser(UserAccount ua)throws IOException;
    void ListUser(int userid )throws IOException;
    ArrayList<String>getAllUsers()throws IOException;
    
    void SaveOrder(OrderAccount ua)throws IOException;
    void UpdateOrder(OrderAccount ua)throws IOException;
    void DeleteOrder(int customerid)throws IOException;
    void ListOrder(int customerid )throws IOException;
    ArrayList<String>getAllOrders()throws IOException;   
    
    void SaveFeedback(FeedbackAccount ua)throws IOException;
    void UpdateFeedback(FeedbackAccount ua)throws IOException;
    void DeleteFeedback(int feedbackcustomerid)throws IOException;
    void ListFeedback(int feedbackcustomerid )throws IOException;
    ArrayList<String>getAllFeedback()throws IOException;   
    
    
    void SaveOrderItem(OrderItemAccount ia)throws IOException;
    void UpdateOrderItem(OrderItemAccount ia)throws IOException;
    void DeleteOrderItem(int secretcode)throws IOException;
    void ListOrderItem(int secretcode )throws IOException;
    ArrayList<String>getAllOrderItem()throws IOException;   
    
    void SaveCustomer(CustomerAccount caa)throws IOException;
    
    void saveitem(OrderAccount ua)throws IOException;

}
