package com.example.beebookinghotel.model.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
@Data
@Builder
public class BookingFacilityDto {

    private Long id;

    private LocalDate createAt;

    private Long totalPrice;
    private Long bookingId;

    private Long facilityId;
}
