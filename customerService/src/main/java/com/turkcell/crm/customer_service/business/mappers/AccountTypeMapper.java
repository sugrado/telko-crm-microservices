package com.turkcell.crm.customer_service.business.mappers;

import com.turkcell.crm.customer_service.business.dtos.requests.account_types.CreateAccountTypeRequest;
import com.turkcell.crm.customer_service.business.dtos.responses.account_types.CreatedAccountTypeResponse;
import com.turkcell.crm.customer_service.business.dtos.responses.account_types.GetAllAccountTypeResponse;
import com.turkcell.crm.customer_service.core.utilities.mapping.MapstructService;
import com.turkcell.crm.customer_service.entities.concretes.AccountType;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(config = MapstructService.class)
public interface AccountTypeMapper {
    AccountType toAccountType(CreateAccountTypeRequest createAccountTypeRequest);
    CreatedAccountTypeResponse toCreatedAccountTypeResponse(AccountType accountType);
    List<GetAllAccountTypeResponse> toGetAllAccountTypeResponse(List<AccountType> accountTypeList);
}

