package fauzia.spring.core.service;

import fauzia.spring.core.repository.CustomerRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CustomerService {

    @Autowired
    @Getter
    @Qualifier("normalCustomerRepository")
    private CustomerRepository normalCustomerRepository;

    @Autowired
    @Getter
    @Qualifier("premiumCustomerRepository")
    private CustomerRepository premiumCustomerRepository;
}
