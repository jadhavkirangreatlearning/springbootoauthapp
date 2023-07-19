package com.csi;

import com.csi.model.Employee;
import com.csi.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SpringbootoauthApplication {

    @Autowired
    EmployeeRepo employeeRepoImpl;

    public static void main(String[] args) {
        SpringApplication.run(SpringbootoauthApplication.class, args);
    }

    @PostConstruct
    public void saveData() {
        Employee employee = new Employee(1001, "DAN", 97000);

        employeeRepoImpl.save(employee);


    }
}
