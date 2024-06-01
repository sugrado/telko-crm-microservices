package com.turkcell.crm.search_service.business.concretes;

import com.turkcell.crm.search_service.business.abstracts.IndividualCustomerSearchService;
import com.turkcell.crm.search_service.business.dtos.responses.customers.SearchIndividualCustomersResponse;
import com.turkcell.crm.search_service.business.mappers.IndividualCustomerMapper;
import com.turkcell.crm.search_service.core.services.search.SearchService;
import com.turkcell.crm.search_service.core.services.search.models.DynamicQuery;
import com.turkcell.crm.search_service.data_access.abstracts.IndividualCustomerRepository;
import com.turkcell.crm.search_service.entities.concretes.IndividualCustomer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IndividualCustomerSearchManager implements IndividualCustomerSearchService {
    private final IndividualCustomerRepository customerRepository;
    private final SearchService searchService;
    private final IndividualCustomerMapper customerMapper;

    @Override
    public void add(IndividualCustomer customer) {
        this.customerRepository.save(customer);
    }

    @Override
    public void update(IndividualCustomer customer) {
        this.customerRepository.save(customer);
    }

    @Override
    public void delete(int customerId) {
        this.customerRepository.deleteById(customerId);
    }

    public List<SearchIndividualCustomersResponse> searchCustomers(DynamicQuery dynamicQuery) {
        List<IndividualCustomer> customers = searchService.dynamicSearch(dynamicQuery, IndividualCustomer.class);
        return this.customerMapper.toSearchIndividualCustomersResponses(customers);
    }
}
