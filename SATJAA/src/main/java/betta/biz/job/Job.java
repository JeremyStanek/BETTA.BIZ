package betta.biz.job;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import betta.biz.customer.Customer;

@Entity
public class Job {

	@Id
	private String id;
	private String date;
	private String startTime;
	private String endTime;
	private String InvoiceId; //Need to implement this as a link to invoice relation
	
	@ManyToOne	//Lazy load?
	private Customer customer; 
	
	public Job() {
		
	}
	
	public Job(String id, String date, String startTime, String endTime, String customerId, String invoiceId) {
		super();
		this.id = id;
		this.date = date;
		this.startTime = startTime;
		this.endTime = endTime;
		InvoiceId = invoiceId;
		this.customer = new Customer(customerId, "", "", "");
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
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
	