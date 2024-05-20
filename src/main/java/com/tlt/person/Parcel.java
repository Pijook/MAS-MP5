package com.tlt.person;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Parcel {

    private static List<Long> parcelNumbers = new ArrayList<>();

    private Long parcelNumber;
    private String destination;

    public Parcel(final Long parcelNumber, final String destination) {
        if(parcelNumbers.contains(parcelNumber)) {
            throw new IllegalArgumentException("Parcel number already exists");
        }

        this.parcelNumber = parcelNumber;
        this.destination = destination;
        parcelNumbers.add(parcelNumber);
    }

    public void setParcelNumber(final Long parcelNumber) {
        if(parcelNumbers.contains(parcelNumber)) {
            throw new IllegalArgumentException("Parcel number already exists");
        }

        parcelNumbers.remove(this.parcelNumber);
        this.parcelNumber = parcelNumber;
        parcelNumbers.add(parcelNumber);
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
}
