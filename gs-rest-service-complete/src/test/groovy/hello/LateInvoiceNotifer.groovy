package hello

public class LateInvoiceNotifierSpec extends spock.lang.Specification{
	//Class to be tested
	private LateInvoiceNotifier lateInvoiceNotifier
  
	//Dependencies (will be mocked)
	private EmailSender emailSender
	private InvoiceStorage invoiceStorage
  
	//Test data
	private Customer sampleCustomer
  
	/**
  * Runs before each test method, like the JUnit Before
  * annotation
  */
	public void setup(){
	  invoiceStorage = Stub(InvoiceStorage.class)
	  emailSender = Mock(EmailSender.class)
  
	  lateInvoiceNotifier = new LateInvoiceNotifier(emailSender,invoiceStorage);
  
	  sampleCustomer = new Customer()
	  sampleCustomer.setFirstName("Susan")
	  sampleCustomer.setLastName("Ivanova")
	}
  
	public void "a late invoice should trigger an email"() {
	  given: "a customer with a late invoice"
	  invoiceStorage.hasOutstandingInvoice(sampleCustomer) >> true
  
	  when: "we check if an email should be sent"
	  lateInvoiceNotifier.notifyIfLate(sampleCustomer)
  
	  then: "the customer is indeed emailed"
	  1 * emailSender.sendEmail(sampleCustomer)
	}
  
	public void "no late invoices"() {
	  given: "a customer with good standing"
	  invoiceStorage.hasOutstandingInvoice(sampleCustomer) >> false
  
	  when: "we check if an email should be sent"
	  lateInvoiceNotifier.notifyIfLate(sampleCustomer)
  
	  then: "an email is never sent out"
	  0 * emailSender.sendEmail(sampleCustomer)
	}
  
  
  }