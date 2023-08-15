package service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.managemebt.exception.UserNotFoundException;
import com.management.model.Employee;
/*
import repo.EmployeeRepository;
//add to database remove from
@Service
@Component
@ComponentScan("repo.EmployeeRepository")



public class EmployeeService {
	
	@Autowired
	@Qualifier("EmployeeRepository")
	
	EmployeeRepository storage;
	
	
	public EmployeeService() {

		
	}
	
	@Autowired
	public EmployeeService(EmployeeRepository storage) {
		this.storage=storage;
	}
	
	public Employee addEmployee(Employee employee) {
		employee.setEmployeeCode(UUID.randomUUID().toString());
		return storage.save(employee);
	}
	
	public List<Employee> findAll(){
		return new ArrayList<Employee>(storage.findAll());
	}
	
	public Employee updateEmployee(Employee employee) {
		return storage.save(employee);
	}
	
	
	
	public boolean save(Employee employee) {
		Employee e = storage.save(employee);
		return e.equals(employee);

	}
	
	public Employee findEmployeeById(Long id) {
		return EmployeeRepository.findEmployeeById(id).orElseThrow(()-> new UserNotFoundException("User by id"));
	}
	
	public void deleteEmployee(Long id) {
		EmployeeRepository.deleteEmployeeById(id);
	}
}
*/



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.management.model.*;
import service.*;
import repo.*;
import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class EmployeeService {
    private static EmployeeRepository employeeRepo;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public Employee addEmployee(Employee employee) {
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepo.save(employee);
    }

    public  List<Employee> findAllEmployees() {
        return employeeRepo.findAll();
    }

    public Employee updateEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

    public Employee findEmployeeById(Long id) {
        return EmployeeRepository.findEmployeeById(id)
                .orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found"));
    }

    public void deleteEmployee(Long id){
        EmployeeRepository.deleteEmployeeById(id);
    }

	
}