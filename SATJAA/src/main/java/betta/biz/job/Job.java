package betta.biz.job;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import betta.biz.customer.Customer;

@Entity
public class Job {

	@Id
	private String id;
	private String dateStarted;
	private String dateFinished;
	private String timeStarted;
	private String timeFinished;
	private String InvoiceId; //Need to implement this as a link to invoice relation
	//private Employee employee; Add this in eventually
	
	@ManyToOne	//Lazy load?
	private Customer customer; 
	
	public Job() {
		
	}
	
	public Job(String id, String dateStarted, String dateFinished, String timeStarted, String timeFinished, String customerId, String invoiceId) {
		super();
		this.id = id;
		this.dateStarted = dateStarted;
		this.dateFinished = dateFinished;
		this.timeStarted = timeStarted;
		this.timeFinished = timeFinished;
		InvoiceId = invoiceId;
		this.customer = new Customer(customerId, "", "", "", "", "");
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDateStarted() {
		return dateStarted;
	}
	public void setDateStarted(String date) {
		this.dateStarted = dateStarted;
	}
	public String getDateFinished() {
		return dateFinished;
	}
	public void setDateFinished(String dateFinished) {
		this.dateFinished = dateFinished;
	}
	
	public String gettimeStarted() {
		return timeStarted;
	}
	public void settimeStarted(String timeStarted) {
		this.timeStarted = timeStarted;
	}
	public String gettimeFinished() {
		return timeFinished;
	}
	public void settimeFinished(String timeFinished) {
		this.timeFinished = timeFinished;
	}
	
	public String getInvoiceId() {
		return InvoiceId;
	}
	public void setInvoiceId(String invoiceId) {
		InvoiceId = invoiceId;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}
	