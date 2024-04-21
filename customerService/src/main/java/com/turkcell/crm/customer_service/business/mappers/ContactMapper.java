package com.turkcell.crm.customer_service.business.mappers;

import com.turkcell.crm.customer_service.business.dtos.requests.customers.CustomerContactDto;
import com.turkcell.crm.customer_service.core.utilities.mapping.MapstructService;
import com.turkcell.crm.customer_service.entities.concretes.Contact;
import org.mapstruct.Mapper;

@Mapper(config = MapstructService.class)
public interface ContactMapper {
    Contact toContact(CustomerContactDto customerContactDto);
}
