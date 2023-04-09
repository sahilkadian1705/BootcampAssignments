package ComponentMapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping("/employees/save")
    public void addEmployee(){
        Employee employee = new Employee();
        employee.setId(1);
        employee.setName("Sahil");
        Address address = new Address();
        address.setStreet("Street No.5");
        address.setCity("New Delhi");
        address.setState("Delhi");
        address.setCountry("India");
        address.setZipcode(110045);
        employee.setAddress(address);
        employeeRepository.save(employee);
    }
}
