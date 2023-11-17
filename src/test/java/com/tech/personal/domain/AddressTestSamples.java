package com.tech.personal.domain;

import java.util.Random;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class AddressTestSamples {

    private static final Random random = new Random();
    private static final AtomicLong longCount = new AtomicLong(random.nextInt() + (2 * Integer.MAX_VALUE));
    private static final AtomicInteger intCount = new AtomicInteger(random.nextInt() + (2 * Short.MAX_VALUE));

    public static Address getAddressSample1() {
        return new Address().id(1L).line1("line11").line2("line21").country("country1").state("state1").city("city1").pincode(1);
    }

    public static Address getAddressSample2() {
        return new Address().id(2L).line1("line12").line2("line22").country("country2").state("state2").city("city2").pincode(2);
    }

    public static Address getAddressRandomSampleGenerator() {
        return new Address()
            .id(longCount.incrementAndGet())
            .line1(UUID.randomUUID().toString())
            .line2(UUID.randomUUID().toString())
            .country(UUID.randomUUID().toString())
            .state(UUID.randomUUID().toString())
            .city(UUID.randomUUID().toString())
            .pincode(intCount.incrementAndGet());
    }
}
