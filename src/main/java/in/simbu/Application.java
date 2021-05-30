package in.simbu;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.simbu.Entities.Employee;
import in.simbu.Repo.EmpRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		EmpRepository empRepository = context.getBean(EmpRepository.class);
		
		Employee emp1 = new Employee(101,"simbu",10000.00);
		Employee emp2 = new Employee(102,"neela",20000.00);
		Employee emp3 = new Employee(103,"mani",30000.00);
		Employee emp4 = new Employee(104,"jaya",15000.00);
		Employee emp5 = new Employee(105,"priya",40000.00);
		
		List<Employee> emps = new ArrayList<>();
	//	emps.add(emp1);emps.add(emp2);emps.add(emp3);
		emps.add(emp4);emps.add(emp5);
		
//		emp.setEmpId(103);
//		emp.setEmpName("mani");
//		emp.setEmpSalary(20000.00);
		
	//	empRepository.save(emp);
		
//		empRepository.saveAll(emps);
		
//		Optional<Employee> byId = empRepository.findById(101);
//		System.out.println(byId);
		
//		List<Serializable> allById = new ArrayList<>(Arrays.asList(101,105,103));
		
//		Iterable<Employee> findAllById = empRepository.findAllById(allById);
//		System.out.println(findAllById);
		
		
		
//		Iterable<Employee> findAll = empRepository.findAll();
//		findAll.forEach(s -> System.out.println(s));
		
//		empRepository.deleteAll();
		
//		List<Employee> findByEmpName = empRepository.findByEmpName("simbu");
//		System.out.println(findByEmpName);
		
//		List<Employee> findByEmpNameAndEmpSalary = empRepository.findByEmpNameAndEmpSalary("priya", 40000.00);
		
//		findByEmpNameAndEmpSalary.forEach(s -> System.out.println(s));
		
//		List<Employee> findByEmpNameIn = empRepository.findByEmpNameIn(Arrays.asList("simbu","priya"));
//		findByEmpNameIn.forEach(s -> System.out.println(s));
		
		
		//Customize method
//		 List<Employee> all = empRepository.getAll();
//		all.forEach(s -> System.out.println(s));
		
		Double findEmpSalaryByName = empRepository.get("simbu");
		System.out.println(findEmpSalaryByName);
		
	}

}
