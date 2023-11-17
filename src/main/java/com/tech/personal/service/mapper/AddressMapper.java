package com.tech.personal.service.mapper;

import com.tech.personal.domain.Address;
import com.tech.personal.domain.Employee;
import com.tech.personal.service.dto.AddressDTO;
import com.tech.personal.service.dto.EmployeeDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Address} and its DTO {@link AddressDTO}.
 */
@Mapper(componentModel = "spring")
public interface AddressMapper extends EntityMapper<AddressDTO, Address> {
    @Mapping(target = "employee", source = "employee", qualifiedByName = "employeeId")
    AddressDTO toDto(Address s);

    @Named("employeeId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    EmployeeDTO toDtoEmployeeId(Employee employee);
}
