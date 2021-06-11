package sheridan.kang7.exercise2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerDataRepository extends JpaRepository<CustomerEntity, Integer> {

}

