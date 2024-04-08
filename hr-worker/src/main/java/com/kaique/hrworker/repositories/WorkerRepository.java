package com.kaique.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kaique.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
