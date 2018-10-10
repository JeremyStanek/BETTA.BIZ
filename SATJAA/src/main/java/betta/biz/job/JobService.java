package betta.biz.job;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class JobService {
	
	@Autowired
	private JobRepository jobRepository;
	
	public List<Job> getAllJobs(String id) {
	     List<Job> jobs = new ArrayList<>();
	     jobRepository.findByCustomerId(id)
	      .forEach(jobs::add);
	      return jobs;
	}
	
	public Optional<Job> getJob(String id) {
		return jobRepository.findById(id);
	}

	public void addJob(Job job) {
		jobRepository.save(job);
	}

	public void updateJob(Job job) {
		jobRepository.save(job);
	}

	public void deleteJob(String id) {
		jobRepository.deleteById(id);
		
	}
}
