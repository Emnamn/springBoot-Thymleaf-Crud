package com.command.gestion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.command.gestion.model.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
