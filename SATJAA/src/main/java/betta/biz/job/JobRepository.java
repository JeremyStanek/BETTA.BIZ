package betta.biz.job;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface JobRepository extends CrudRepository<Job, String>{
	
	public List<Job> findByCustomerId (String customerId);
	//public List<Job> findByName getJobsByName(String name);
	//public List<Job> findByDescription (String foo);
}
