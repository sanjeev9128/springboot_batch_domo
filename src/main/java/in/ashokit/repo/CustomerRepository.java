package in.ashokit.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.ashokit.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Serializable> {

}
