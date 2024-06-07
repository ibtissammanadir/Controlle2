package com.example.springcontrol.repository;

import com.example.springcontrol.Model.EmployeEntityManager;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeEntityManager,Long> {
}
