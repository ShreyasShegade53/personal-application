package com.tech.personal.service.criteria;

import java.io.Serializable;
import java.util.Objects;
import org.springdoc.core.annotations.ParameterObject;
import tech.jhipster.service.Criteria;
import tech.jhipster.service.filter.*;

/**
 * Criteria class for the {@link com.tech.personal.domain.Address} entity. This class is used
 * in {@link com.tech.personal.web.rest.AddressResource} to receive all the possible filtering options from
 * the Http GET request parameters.
 * For example the following could be a valid request:
 * {@code /addresses?id.greaterThan=5&attr1.contains=something&attr2.specified=false}
 * As Spring is unable to properly convert the types, unless specific {@link Filter} class are used, we need to use
 * fix type specific filters.
 */
@ParameterObject
@SuppressWarnings("common-java:DuplicatedBlocks")
public class AddressCriteria implements Serializable, Criteria {

    private static final long serialVersionUID = 1L;

    private LongFilter id;

    private StringFilter line1;

    private StringFilter line2;

    private StringFilter country;

    private StringFilter state;

    private StringFilter city;

    private IntegerFilter pincode;

    private LongFilter employeeId;

    private Boolean distinct;

    public AddressCriteria() {}

    public AddressCriteria(AddressCriteria other) {
        this.id = other.id == null ? null : other.id.copy();
        this.line1 = other.line1 == null ? null : other.line1.copy();
        this.line2 = other.line2 == null ? null : other.line2.copy();
        this.country = other.country == null ? null : other.country.copy();
        this.state = other.state == null ? null : other.state.copy();
        this.city = other.city == null ? null : other.city.copy();
        this.pincode = other.pincode == null ? null : other.pincode.copy();
        this.employeeId = other.employeeId == null ? null : other.employeeId.copy();
        this.distinct = other.distinct;
    }

    @Override
    public AddressCriteria copy() {
        return new AddressCriteria(this);
    }

    public LongFilter getId() {
        return id;
    }

    public LongFilter id() {
        if (id == null) {
            id = new LongFilter();
        }
        return id;
    }

    public void setId(LongFilter id) {
        this.id = id;
    }

    public StringFilter getLine1() {
        return line1;
    }

    public StringFilter line1() {
        if (line1 == null) {
            line1 = new StringFilter();
        }
        return line1;
    }

    public void setLine1(StringFilter line1) {
        this.line1 = line1;
    }

    public StringFilter getLine2() {
        return line2;
    }

    public StringFilter line2() {
        if (line2 == null) {
            line2 = new StringFilter();
        }
        return line2;
    }

    public void setLine2(StringFilter line2) {
        this.line2 = line2;
    }

    public StringFilter getCountry() {
        return country;
    }

    public StringFilter country() {
        if (country == null) {
            country = new StringFilter();
        }
        return country;
    }

    public void setCountry(StringFilter country) {
        this.country = country;
    }

    public StringFilter getState() {
        return state;
    }

    public StringFilter state() {
        if (state == null) {
            state = new StringFilter();
        }
        return state;
    }

    public void setState(StringFilter state) {
        this.state = state;
    }

    public StringFilter getCity() {
        return city;
    }

    public StringFilter city() {
        if (city == null) {
            city = new StringFilter();
        }
        return city;
    }

    public void setCity(StringFilter city) {
        this.city = city;
    }

    public IntegerFilter getPincode() {
        return pincode;
    }

    public IntegerFilter pincode() {
        if (pincode == null) {
            pincode = new IntegerFilter();
        }
        return pincode;
    }

    public void setPincode(IntegerFilter pincode) {
        this.pincode = pincode;
    }

    public LongFilter getEmployeeId() {
        return employeeId;
    }

    public LongFilter employeeId() {
        if (employeeId == null) {
            employeeId = new LongFilter();
        }
        return employeeId;
    }

    public void setEmployeeId(LongFilter employeeId) {
        this.employeeId = employeeId;
    }

    public Boolean getDistinct() {
        return distinct;
    }

    public void setDistinct(Boolean distinct) {
        this.distinct = distinct;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        final AddressCriteria that = (AddressCriteria) o;
        return (
            Objects.equals(id, that.id) &&
            Objects.equals(line1, that.line1) &&
            Objects.equals(line2, that.line2) &&
            Objects.equals(country, that.country) &&
            Objects.equals(state, that.state) &&
            Objects.equals(city, that.city) &&
            Objects.equals(pincode, that.pincode) &&
            Objects.equals(employeeId, that.employeeId) &&
            Objects.equals(distinct, that.distinct)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, line1, line2, country, state, city, pincode, employeeId, distinct);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "AddressCriteria{" +
            (id != null ? "id=" + id + ", " : "") +
            (line1 != null ? "line1=" + line1 + ", " : "") +
            (line2 != null ? "line2=" + line2 + ", " : "") +
            (country != null ? "country=" + country + ", " : "") +
            (state != null ? "state=" + state + ", " : "") +
            (city != null ? "city=" + city + ", " : "") +
            (pincode != null ? "pincode=" + pincode + ", " : "") +
            (employeeId != null ? "employeeId=" + employeeId + ", " : "") +
            (distinct != null ? "distinct=" + distinct + ", " : "") +
            "}";
    }
}
