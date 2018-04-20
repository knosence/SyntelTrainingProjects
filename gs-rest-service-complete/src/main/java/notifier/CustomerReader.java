package notifier;

public class CustomerReader {

	  @PersistenceContext
	  private EntityManager entityManager;

	  public String findFullName(Long customerID){
	    Customer customer = entityManager.find(Customer.class, customerID);
	    return customer.getFirstName() +" "+customer.getLastName();
	  }

	}
