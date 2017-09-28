package javabrains_springboot.repository;

import org.springframework.data.repository.CrudRepository;

import javabrains_springboot.pojo.Department;

public interface DepartmentRepository extends CrudRepository<Department, String>{

}
