package in.simbu.Repo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import in.simbu.Entities.Employee;

public interface EmpRepository extends CrudRepository<Employee, Serializable>{
	
	//@Query("select empId,empName,empSalary from Employee where empName=:name")
	List<Employee> findByEmpName(String name);
	
	List<Employee> findByEmpNameAndEmpSalary(String name, Double sal);
	
	@Query("select empId,empName from Employee")
	List<Employee> getAll();
	
	public List<Employee> findByEmpNameIn(List<String> name);
	
	@Query("select empSalary from Employee where empName=:name")
	public Double get(String name);

}
