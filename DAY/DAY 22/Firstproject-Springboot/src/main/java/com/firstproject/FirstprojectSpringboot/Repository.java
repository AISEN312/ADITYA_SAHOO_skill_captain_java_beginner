package com.firstproject.FirstprojectSpringboot;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository <Customer, Long> {

    List<Customer> findByLastName(String lastName);

    Customer findById(long id);
}