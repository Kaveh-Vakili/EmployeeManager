package repo;

import java.util.Optional;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.management.model.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    public static void deleteEmployeeById(Long id) {
		// TODO Auto-generated method stub
		
	}

    public static Optional<Employee> findEmployeeById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
}