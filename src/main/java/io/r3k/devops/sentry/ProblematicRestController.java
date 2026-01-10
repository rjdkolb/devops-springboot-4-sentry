package io.r3k.devops.sentry;

import io.r3k.devops.sentry.jpa.Customer;
import io.r3k.devops.sentry.jpa.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api")
public class ProblematicRestController {

    private final CustomerRepository customerRepository;

    public ProblematicRestController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @GetMapping(path = "/divide")
    public String division(@RequestParam Integer by) {
        return Integer.toString(100 / by);
    }

    @GetMapping(path = "/sqlerror")
    public List<Customer> findAll() {
        return customerRepository.findAllWithSyntaxError();
    }

}
