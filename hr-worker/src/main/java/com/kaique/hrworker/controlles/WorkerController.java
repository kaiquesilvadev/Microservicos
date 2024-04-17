package com.kaique.hrworker.controlles;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kaique.hrworker.entities.Worker;
import com.kaique.hrworker.repositories.WorkerRepository;

@RestController
@RequestMapping(value = "/workers")
public class WorkerController {

	private static Logger logger = LoggerFactory.getLogger(WorkerController.class);

	@Autowired
	private WorkerRepository repository;

	@Autowired
	private Environment env;
	
	/*TODO: Está sendo usado apenas para verificar se o projeto está se comunicando com as configurações. */
	@Value("${test.config}")
	private String testConfig;
	
	/*TODO: Está sendo usado apenas para verificar se o projeto está se comunicando com as configurações. */
	@GetMapping(value = "/configs")
	public ResponseEntity<Void> getConfigs() {
		logger.info("CONFIG = " + testConfig);
		return ResponseEntity.noContent().build();
	}		
	

	@GetMapping
	public ResponseEntity<List<Worker>> findAll() {
		List<Worker> list = repository.findAll();
		return ResponseEntity.ok(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Worker> findById(@PathVariable Long id) {

		try {
			Thread.sleep(5000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		logger.info("PORT = " + env.getProperty("local.server.port"));

		Worker obj = repository.findById(id).get();
		return ResponseEntity.ok(obj);
	}

}
