package com.tech.personal.domain;

import static com.tech.personal.domain.AddressTestSamples.*;
import static com.tech.personal.domain.EmployeeTestSamples.*;
import static org.assertj.core.api.Assertions.assertThat;

import com.tech.personal.web.rest.TestUtil;
import org.junit.jupiter.api.Test;

class AddressTest {

    @Test
    void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(Address.class);
        Address address1 = getAddressSample1();
        Address address2 = new Address();
        assertThat(address1).isNotEqualTo(address2);

        address2.setId(address1.getId());
        assertThat(address1).isEqualTo(address2);

        address2 = getAddressSample2();
        assertThat(address1).isNotEqualTo(address2);
    }

    @Test
    void employeeTest() throws Exception {
        Address address = getAddressRandomSampleGenerator();
        Employee employeeBack = getEmployeeRandomSampleGenerator();

        address.setEmployee(employeeBack);
        assertThat(address.getEmployee()).isEqualTo(employeeBack);

        address.employee(null);
        assertThat(address.getEmployee()).isNull();
    }
}
