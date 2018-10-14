package betta.biz.job;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import betta.biz.customer.Customer;

@RestController
public class JobController {


	@Autowired
	private JobService jobService;
	
	@RequestMapping("/customers/{id}/jobs")
	public List<Job> getAllJobs(@PathVariable String id){
		return jobService.getAllJobs(id);
	}
	
	@RequestMapping("/customers/{customerId}/jobs/{id}")
	public Optional<Job> getJob(@PathVariable String id) {
		return jobService.getJob(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/customers/{customerId}/jobs/{id}")
	public void addJob(@RequestBody Job job, @PathVariable String customerId) {
		job.setCustomer(new Customer(customerId, "", "", "", "", ""));
		jobService.addJob(job);
	}

	@RequestMapping(method=RequestMethod.PUT, value="/customers/{customerId}/jobs/{jobId}")
	public void updateJob(@RequestBody Job job, @PathVariable String customerId, @PathVariable String jobId) {
		job.setCustomer(new Customer(customerId, "", "", "", "", ""));
		jobService.updateJob(job);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/Jobs/{JobId}/jobs/{id}")
	public void deleteJob(@PathVariable String id) {
		jobService.deleteJob(id);
	}
}
