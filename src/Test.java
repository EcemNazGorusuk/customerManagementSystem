import java.sql.Date;
import Abstract.BaseCustomerManager;
import Concrete.NeroCustomerManager;
import Entities.Customer;
public class Test {
public static void main(String[] args) {


   Date tarih=new Date(1997,19,8);
	BaseCustomerManager baseCustomerManager=new NeroCustomerManager();
	baseCustomerManager.save(new Customer("152", "Engin", "Demiroð",tarih, "288614"));
	
}
}
