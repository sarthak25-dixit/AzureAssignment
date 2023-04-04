package com.nagarro.bench.Azure;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AzureAssignmentApplication {

	@Autowired
	private ClientRepo repo;
	
	@GetMapping("/clients")
	public List<Client> AllClient(){
		return repo.findAll();
		
	}
	
	@PostMapping("client")
	public Client AddClient(@RequestBody Client client) {
		return repo.save(client);
	}
	public static void main(String[] args) {
		SpringApplication.run(AzureAssignmentApplication.class, args);
	}

}
