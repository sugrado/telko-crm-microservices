package com.turkcell.crm.customer_service.business.abstracts;

import com.turkcell.crm.customer_service.business.dtos.requests.customers.CustomerContactDto;
import com.turkcell.crm.customer_service.entities.concretes.Customer;

public interface ContactService {
    void add(CustomerContactDto customerContactDto, Customer customer);
}
