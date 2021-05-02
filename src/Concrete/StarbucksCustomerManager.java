package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager  {
	  private ICustomerCheckService iCustomerCheckService; //bu olaya dependency injection denir
	  
      public StarbucksCustomerManager(ICustomerCheckService iCustomerCheckService) {
		     this.iCustomerCheckService = iCustomerCheckService;
	  }


	 @Override
      public void save(Customer customer){
    	  if(iCustomerCheckService.checkIfRealPerson(customer)) {
    		  super.save(customer);
    	  }
    	  else {
    	  System.err.println("Not a valid person.");
    	  }
     }

	
	

}
