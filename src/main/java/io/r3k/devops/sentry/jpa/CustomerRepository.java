package io.r3k.devops.sentry.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    @Query(nativeQuery = true, value = "select * from customer c where c.syntax_error")
    List<Customer> findAllWithSyntaxError();
}
