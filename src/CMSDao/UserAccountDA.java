package CMSDao;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.io.FileReader;
import CMSBll.UserAccount;
import CMSBll.OrderAccount;
import CMSBll.FeedbackAccount;
import javax.swing.JOptionPane;
import CMSBll.CustomerAccount;
import CMSBll.OrderItemAccount;

public class UserAccountDA implements UserAccountDAO {
        @Override
    public void SaveUser(UserAccount ua) throws IOException {

        if (ua.getUserEmail().isEmpty() || ua.getUserid().isEmpty() || ua.getUserName().isEmpty() || ua.getUserPassword().isEmpty() || ua.getUserRole().isEmpty()){
            JOptionPane.showMessageDialog(null, "All Fields are Necessary!");
            
        } else {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("User.txt", true))){
            bw.write(ua.getUserid() + "," + ua.getUserName() + "," + ua.getUserPassword() + "," + ua.getUserRole() + "," + ua.getUserEmail());
            bw.flush();
            bw.newLine();
            bw.close();
            JOptionPane.showMessageDialog(null, "Record Saved Successfully!");
        }
        }
    }
    
    @Override
    public void SaveOrder(OrderAccount ua) throws IOException {
        if (ua.getCustomerid().isEmpty() || ua.getCustomerName().isEmpty() || ua.getCustomerAddress().isEmpty() || ua.getCustomerContact().isEmpty() || ua.getCustomerStatus().isEmpty() || ua.getOrderDetails().isEmpty() || ua.getOrderDate().isEmpty()){
            JOptionPane.showMessageDialog(null, "All Fields are Necessary!");
        } else {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("OrderData.txt", true))){
            bw.write(ua.getCustomerid() + "," + ua.getCustomerName() + "," + ua.getCustomerAddress() + "," + ua.getCustomerContact() + "," + ua.getCustomerStatus() + "," + ua.getOrderDetails() + "," + ua.getOrderDate() + "," + ua.getCustomerFeedback() + "," + ua.getServiceAmount() + "," +  ua.getDeliveredDate() + "," + ua.getDeliveredBy());
            bw.flush();
            bw.newLine();
            bw.close();
        }
        JOptionPane.showMessageDialog(null, "Record Saved Successfully!");
        }
    }
    
        @Override
    public void saveitem(OrderAccount ua) throws IOException {
        if (ua.getCustomerid().isEmpty() || ua.getCustomerName().isEmpty() || ua.getCustomerAddress().isEmpty() || ua.getCustomerContact().isEmpty() || ua.getOrderDetails().isEmpty() || ua.getOrderDate().isEmpty()){
            JOptionPane.showMessageDialog(null, "All Fields are Necessary!");
        } else {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("OrderData.txt", true))){
            bw.write(ua.getCustomerid() + "," + ua.getCustomerName() + "," + ua.getCustomerAddress() + "," + ua.getCustomerContact() + "," + "Pending" + "," + ua.getOrderDetails() + "," + ua.getOrderDate() + "," + ua.getCustomerFeedback() + "," + ua.getServiceAmount() + "," +  ua.getDeliveredDate() + "," + ua.getDeliveredBy());
            bw.flush();
            bw.newLine();
            bw.close();
        }
        JOptionPane.showMessageDialog(null, "Record Saved Successfully!");
        }
    }

    
    
    @Override
    public void SaveFeedback(FeedbackAccount ua) throws IOException {
        if (ua.getFeedbackCustomerid().isEmpty() || ua.getFeedbackCustomerName().isEmpty() || ua.getFeedbackCustomerFeedback().isEmpty() || ua.getFeedbackCategory().isEmpty() || ua.getImproveNeeded().isEmpty()){
            JOptionPane.showMessageDialog(null, "All Fields are Necessary!");
        } else {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("OrderData.txt", true))){
            bw.write(ua.getFeedbackCustomerid() + "," + ua.getFeedbackCustomerName() + "," + ua.getFeedbackCustomerFeedback() + "," + ua.getFeedbackCategory() + "," + ua.getImproveNeeded());
            bw.flush();
            bw.newLine();
            bw.close();
        }
        JOptionPane.showMessageDialog(null, "Record Saved Successfully!");
        }
        
        
        
        
    }

    
        @Override
    public void SaveCustomer(CustomerAccount caa) throws IOException {

        if (caa.getCustomerid().isEmpty() || caa.getCustomerFullName().isEmpty() || caa.getCustomerName().isEmpty() || caa.getCustomerPassword().isEmpty() || caa.getCustomerEmail().isEmpty()){
            JOptionPane.showMessageDialog(null, "All Fields are Necessary!");
            
        } else {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("Customer.txt", true))){
            bw.write(caa.getCustomerid() + "," + caa.getCustomerFullName() + "," + caa.getCustomerName() + "," + caa.getCustomerPassword() + "," + caa.getCustomerEmail());
            bw.flush();
            bw.newLine();
            bw.close();
        }
            JOptionPane.showMessageDialog(null, "Account Registered Successfully!");
        }
    }
    
    
       @Override
    public void SaveOrderItem(OrderItemAccount ia) throws IOException {

        if (ia.getItemid().isEmpty() || ia.getItemName().isEmpty() || ia.getPrice().isEmpty()){
            JOptionPane.showMessageDialog(null, "All Fields are Necessary!");
            
        } else {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("OrderItem.txt", true))){
            bw.write(ia.getItemid() + "," + ia.getItemName() + "," + ia.getPrice());
            bw.flush();
            bw.newLine();
            bw.close();
        }
            JOptionPane.showMessageDialog(null, "Items Saved Successfully!");
        }
    }



    @Override
    public void UpdateUser(UserAccount sa) throws IOException {
        
    }


    @Override
    public void DeleteUser(UserAccount ua) throws IOException {

    }
    


    @Override
    public void ListUser(int userid) throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void UpdateOrder(OrderAccount ua) throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void DeleteOrder(int customerid) throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ListOrder(int customerid) throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    @Override
    public void UpdateFeedback(FeedbackAccount ua) throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void DeleteFeedback(int customerid) throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ListFeedback(int customerid) throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    @Override
    public void UpdateOrderItem(OrderItemAccount ia) throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void DeleteOrderItem(int secretcode) throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ListOrderItem(int secretcode) throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    @Override
    public ArrayList<String> getAllUsers() throws IOException {
        ArrayList<String> fileData=new ArrayList<>();
        FileReader fr=new FileReader("User.txt");
        BufferedReader br=new BufferedReader(fr);
        String line;
        while((line=br.readLine())!=null){
            fileData.add(line);
        }
        return fileData;    
    }

    @Override
    public ArrayList<String> getAllOrders() throws IOException {
        ArrayList<String> fileData=new ArrayList<>();
        FileReader fr=new FileReader("OrderData.txt");
        BufferedReader br=new BufferedReader(fr);
        String line;
        while((line=br.readLine())!=null){
            fileData.add(line);
        }
        return fileData;    
    }
    
    @Override
    public ArrayList<String> getAllFeedback() throws IOException {
        ArrayList<String> fileData=new ArrayList<>();
        FileReader fr=new FileReader("FeedbackData.txt");
        BufferedReader br=new BufferedReader(fr);
        String line;
        while((line=br.readLine())!=null){
            fileData.add(line);
        }
        return fileData;    
    }

    
        @Override
    public ArrayList<String> getAllOrderItem() throws IOException {
        ArrayList<String> fileData=new ArrayList<>();
        FileReader fr=new FileReader("OrderItem.txt");
        BufferedReader br=new BufferedReader(fr);
        String line;
        while((line=br.readLine())!=null){
            fileData.add(line);
        }
        return fileData;    
    }

}
