package CMSDao;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import CMSBll.UserAccount;
import CMSBll.CustomerAccount;

public class MSUserLoginDA implements MSUserLoginDAO {
        @Override
    public boolean checkUser(UserAccount u) throws IOException{
        boolean found = false;

        try {
            FileReader fr = new FileReader("User.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = null;
            String[] splt = null;
            while ((line = br.readLine()) != null) {
                splt = line.split(",");
                if (splt[1].equals(u.getUserName()) && splt[2].equals(u.getUserPassword()) && splt[3].equals(u.getUserRole())) {
                    found = true;
                    break;
                }
            }
            br.close();
  
        } catch (Exception e) {
            System.out.println(e);
        }
        return found;
    }

    
        public boolean checkCustomer(CustomerAccount ca) throws IOException{
        boolean found = false;

        try {
            FileReader fr = new FileReader("Customer.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = null;
            String[] splt = null;
            while ((line = br.readLine()) != null) {
                splt = line.split(",");
                if (splt[2].equals(ca.getCustomerName()) && splt[3].equals(ca.getCustomerPassword())) {
                    found = true;
                    break;
                }
            }
            br.close();
  
        } catch (Exception e) {
            System.out.println(e);
        }
        return found;
    }

    
}
